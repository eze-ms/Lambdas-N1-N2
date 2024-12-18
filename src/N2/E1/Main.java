package N2.E1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de nombres propios
        List<String> names = Arrays.asList("Ana", "Ben", "Eva", "Alex", "Max", "Amy", "Tom");

        // Crear instancia de ListProcessor
        ListProcessor processor = new ListProcessor();

        // Obtener los nombres que comienzan con 'A' y tienen exactamente 3 letras
        List<String> filteredNames = processor.filterNames(names);

        System.out.println("Names that start with 'A' and have exactly 3 letters:");
        filteredNames.forEach(System.out::println);
    }
}