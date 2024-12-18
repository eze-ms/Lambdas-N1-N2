package N1.E2;

import java.util.List;
import java.util.stream.Collectors;

public class WordProcessor {

    // Metodo para filtrar las palabras que contienen la letra 'o' y tienen más de 5 letras
    public static List<String> filterWordsContainingOAndLongerThanFive(List<String> words) {
        return words.stream()
                .filter(word -> word.toLowerCase().contains("o") && word.length() > 5)
                .collect(Collectors.toList());
    }

    // Metodo para imprimir las frutas filtradas con más detalles
    public static void printFilteredFruits(List<String> filteredFruits) {
        System.out.println("Filtered fruits (with 'o' and more than 5 letters):");
        filteredFruits.forEach(fruit -> {
            System.out.println("Fruit: " + fruit + ", Length: " + fruit.length() + " characters");
        });
    }
}