package N1.E7;

import java.util.Collection;
import java.util.Comparator;

public class ListProcessor {

    // Método para ordenar las palabras por longitud de más larga a más corta dentro de un HashMap
    public void sortWordsByLengthDescending(Collection<String> words) {
        words.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())  // Ordenar de más largo a más corto
                .forEach(word -> System.out.println("- " + word));  // Imprimir las palabras ordenadas
    }
}
