import { useState, useEffect } from "react";
import {
  Dialog,
  DialogTitle,
  DialogContent,
  DialogActions,
  Button,
  FormControl,
  InputLabel,
  Select,
  MenuItem,
  Box
} from "@mui/material";
import AceEditor from "react-ace";
import {
  useCriarOcorrencia,
  useExemploOcorrencia
} from "../../api/ESocialJTServiceApi";
import useFeedback from "../../components/feedback/useFeedback";
import * as TiposOcorrencia from "../../shared/tiposOcorrencia";

import "ace-builds/src-noconflict/mode-json";
import "ace-builds/src-noconflict/theme-monokai";
import "ace-builds/src-noconflict/ext-language_tools";

// Criar array de tipos de ocorrência a partir das constantes
const tiposOcorrencia = Object.entries(TiposOcorrencia).map(([key, value]) => ({
  value: value,
  label: key
    .replace(/_/g, " ")
    .toLowerCase()
    .replace(/\b\w/g, (l) => l.toUpperCase())
}));

function EnviarJson({ open, onClose }) {
  const [json, setJson] = useState("");
  const [tipoSelecionado, setTipoSelecionado] = useState("");
  const criarOcorrencia = useCriarOcorrencia();
  const { showError } = useFeedback();
  const { data: exemploData } = useExemploOcorrencia(tipoSelecionado);

  // Limpar campos quando o dialog é aberto
  useEffect(() => {
    if (open) {
      setTipoSelecionado("");
      setJson("");
    }
  }, [open]);

  useEffect(() => {
    if (exemploData) {
      setJson(JSON.stringify(exemploData, null, 2));
    }
  }, [exemploData]);

  const handleChange = (newValue) => {
    setJson(newValue);
  };

  const handleTipoChange = (event) => {
    setTipoSelecionado(event.target.value);
  };

  const handleEnviar = async () => {
    try {
      // Validar se o JSON é válido
      const jsonObj = JSON.parse(json);

      // Enviar para o backend
      await criarOcorrencia.mutateAsync(jsonObj);

      // Fechar o dialog
      onClose();

      // Limpar o editor
      setJson("");
    } catch (error) {
      if (error instanceof SyntaxError) {
        showError("JSON inválido: " + error.message);
      } else {
        showError(
          "Erro ao enviar ocorrência: " + (error.message || "Erro desconhecido")
        );
      }
    }
  };

  return (
    <Dialog open={open} onClose={onClose} maxWidth="lg" fullWidth>
      <DialogTitle>Enviar JSON manualmente</DialogTitle>
      <DialogContent sx={{ p: 2, height: "70vh" }}>
        <Box sx={{ my: 1 }}>
          <FormControl fullWidth size="small">
            <InputLabel>Selecionar modelo</InputLabel>
            <Select
              value={tipoSelecionado}
              label="Selecionar modelo"
              onChange={handleTipoChange}
            >
              <MenuItem value="">
                <em>Nenhum</em>
              </MenuItem>
              {tiposOcorrencia.map((tipo) => (
                <MenuItem key={tipo.value} value={tipo.value}>
                  {tipo.label}
                </MenuItem>
              ))}
            </Select>
          </FormControl>
        </Box>
        <AceEditor
          mode="json"
          theme="monokai"
          onChange={handleChange}
          value={json}
          name="json-editor"
          editorProps={{ $blockScrolling: true }}
          setOptions={{
            enableBasicAutocompletion: true,
            enableLiveAutocompletion: true,
            enableSnippets: true,
            showLineNumbers: true,
            tabSize: 2
          }}
          style={{
            width: "100%",
            height: "calc(100% - 64px)"
          }}
        />
      </DialogContent>
      <DialogActions>
        <Button onClick={onClose}>Cancelar</Button>
        <Button
          onClick={handleEnviar}
          variant="contained"
          disabled={criarOcorrencia.isLoading}
        >
          {criarOcorrencia.isLoading ? "Enviando..." : "Enviar"}
        </Button>
      </DialogActions>
    </Dialog>
  );
}

export default EnviarJson;
