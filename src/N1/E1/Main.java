package N1.E1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Lista de palabras de ejemplo
        List<String> wordsList = Arrays.asList("apple", "orange", "banana", "kiwi", "melon", "grape");

        // Obtener las palabras que contienen la letra 'o' usando la clase WordProcessor
        List<String> filteredWords = WordProcessor.filterWordsContainingO(wordsList);

        // Imprimir el resultado
        filteredWords.forEach(System.out::println);
    }
}