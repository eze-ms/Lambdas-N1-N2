package N1.E6;

import java.util.Collection;
import java.util.Comparator;

public class ListProcessor {

    // Metodo para ordenar las palabras por longitud dentro de un HashMap
    public void sortWordsByLength(Collection<String> words) {
        words.stream()
                .sorted(Comparator.comparingInt(String::length))  // Ordenar por longitud
                .forEach(word -> System.out.println("- " + word));  // Imprimir las palabras ordenadas
    }
}
