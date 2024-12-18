package N2.E4;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ListProcessor {

    // Metodo para ordenar las cadenas según el primer carácter y si contienen una 'e'
    public void sortByFirstCharacter(List<String> list) {
        list.sort(Comparator.comparingInt(s -> s.toUpperCase().charAt(0)));  // Usar toUpperCase() sin Locale
    }

    // Metodo para ordenar primero las cadenas que contienen 'e' y luego alfabéticamente
    public void sortByContainsE(List<String> list) {
        list.sort(Comparator.comparing((String s) -> !s.toUpperCase().contains("E"))  // Usar toUpperCase() sin Locale
                .thenComparing(s -> s.toUpperCase()));  // Ordenar alfabéticamente
    }

    // Reemplaza todas las 'a' por '4' en la lista
    public void replaceAWith4(List<String> list) {
        list.replaceAll(s -> s.replace("a", "4"));
    }

    // Filtra y retorna solo los números (como Strings)
    public String filterNumbers(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("\\d+"))  // Filtrar solo los números (como Strings)
                .collect(Collectors.joining(","));  // Unir los números filtrados en una cadena separada por comas
    }
}
