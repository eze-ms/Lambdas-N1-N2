package N2.E4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear la lista de cadenas y números
        List<String> list = Arrays.asList("Word", "2", "paint", "45", "Ink", "740", "Aquarell", "34", "enterprise");

        // Crear instancia de ListProcessor
        ListProcessor processor = new ListProcessor();

        // Ordenar por el primer carácter
        System.out.println("Sorted by first Character");
        processor.sortByFirstCharacter(list);
        System.out.println(list);

        // Ordenar primero las que contienen 'e'
        System.out.println("Sorted first contains e");
        processor.sortByContainsE(list);
        System.out.println(list);

        // Cambiar 'a' por '4'
        System.out.println("Change a for 4");
        processor.replaceAWith4(list);
        System.out.println(list);

        // Filtrar y mostrar solo los números
        System.out.println("Print only numbers");
        System.out.println(processor.filterNumbers(list));
    }
}
