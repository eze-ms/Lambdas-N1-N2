package N1.E2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Lista de frutas de ejemplo
        List<String> fruitsList = Arrays.asList("apple", "orange", "banana", "kiwi", "melon", "grape");

        // Obtener las frutas que contienen 'o' y tienen más de 5 letras usando la clase WordProcessor
        List<String> filteredFruits = WordProcessor.filterWordsContainingOAndLongerThanFive(fruitsList);

        // Imprimir el resultado
        WordProcessor.printFilteredFruits(filteredFruits);
    }
}