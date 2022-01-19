import { useOcorrencias } from "../../api/ESocialJTServiceApi";
import DataPanel from "../../components/data/DataPanel";
import Page from "../../components/layout/page/Page";
import ItemOcorrencia from "../../components/ocorrencia/ItemOcorrencia";
import PageHeader from "../../components/page-header/PageHeader";

function EventosPage() {
  const { data: ocorrencias, isLoading } = useOcorrencias();

  return (
    <Page>
      <PageHeader
        primary="Eventos"
        secondary="Nesta página é possível visualizar informações de todos eventos enviados para o eSocial"
      />
      <DataPanel
        loading={isLoading}
        isEmpty={!ocorrencias || !ocorrencias.length}
        emptyMessage="Nenhum evento enviado para o eSocial"
        paperEmptyPanel
      >
        {ocorrencias &&
          ocorrencias.map((ocorrencia) => (
            <ItemOcorrencia key={ocorrencia.id} ocorrencia={ocorrencia} />
          ))}
      </DataPanel>
    </Page>
  );
}

export default EventosPage;
