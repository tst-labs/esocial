package br.jus.tst.esocialjt.util;

import org.apache.commons.lang3.StringUtils;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class CSVUtil {

    public static final String SEPARATOR = ";";
    private CSVUtil(){
    }

    public static StringBuilder convertToCSV(List<Map<String, Object>> flatMapList) {
        Set<String> keySet = new LinkedHashSet<>();
        flatMapList
                .stream()
                .map(v -> v.keySet())
                .forEach(k -> keySet.addAll(k));

        StringBuilder sb = new StringBuilder();

        sb.append(StringUtils.join(keySet, SEPARATOR));
        flatMapList.forEach(entry -> {
            sb.append("\n");
            List<String> linha = keySet
                    .stream()
                    .map(key -> Optional.ofNullable(entry.get(key)).orElse(""))
                    .map(Object::toString)
                    .collect(Collectors.toList());
            sb.append(StringUtils.join(linha, SEPARATOR));
        });
        return sb;
    }
}
