package N1.E8;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Crear un HashMap con claves enteras y valores como palabras aleatorias
        HashMap<Integer, String> wordsMap = new HashMap<>();
        wordsMap.put(1, "Elephant");
        wordsMap.put(2, "Sun");
        wordsMap.put(3, "Computer");
        wordsMap.put(4, "Guitar");
        wordsMap.put(5, "Phone");
        wordsMap.put(6, "Lamp");
        wordsMap.put(7, "Window");

        // Crear una instancia de ReverseString usando una lambda
        ReverseString reverse = (input) -> new StringBuilder(input).reverse().toString();

        // Aplicar la lambda a cada palabra y mostrar el resultado
        System.out.println("Reversed words:");
        wordsMap.values().forEach(word -> {
            String reversedWord = reverse.reverse(word);
            System.out.println("- " + word + " -> " + reversedWord);
        });
    }
}
