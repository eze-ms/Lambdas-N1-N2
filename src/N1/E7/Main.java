package N1.E7;

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

        // Crear instancia de ListProcessor
        ListProcessor processor = new ListProcessor();

        // Obtener las palabras ordenadas de más larga a más corta y mostrarlas
        System.out.println("Words sorted by length (longest to shortest):");
        processor.sortWordsByLengthDescending(wordsMap.values());
    }
}
