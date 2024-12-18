package N2.E2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de enteros
        List<Integer> numbers = Arrays.asList(3, 55, 44);

        // Crear instancia de ListProcessor
        ListProcessor processor = new ListProcessor();

        // Obtener la cadena procesada
        String result = processor.processNumbers(numbers);

        // Imprimir el resultado
        System.out.println("Processed result: " + result);
    }
}
