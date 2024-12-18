package N2.E1;

import java.util.List;
import java.util.stream.Collectors;

public class ListProcessor {

    // Metodo para filtrar las cadenas que empiezan con 'A' y tienen exactamente 3 letras
    public List<String> filterNames(List<String> names) {
        return names.stream()
                .filter(name -> name.startsWith("A") && name.length() == 3)  // Filtrar nombres que comienzan con 'A' y tienen 3 letras
                .collect(Collectors.toList());  // Recoger el resultado en una lista
    }
}