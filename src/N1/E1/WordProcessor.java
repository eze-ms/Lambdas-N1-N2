package N1.E1;

import java.util.List;
import java.util.stream.Collectors;

public class WordProcessor {

    // Método para filtrar las palabras que contienen la letra 'o'
    public static List<String> filterWordsContainingO(List<String> words) {
        return words.stream()
                .filter(word -> word.toLowerCase().contains("o"))  // Insensible a mayúsculas/minúsculas
                .collect(Collectors.toList());  // Convertir el stream de vuelta a lista
    }
}
