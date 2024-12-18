package N2.E2;

import java.util.List;
import java.util.stream.Collectors;

public class ListProcessor {

    // Metodo para crear la cadena con "e" o "o" dependiendo de si el número es par o impar
    public String processNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> (number % 2 == 0 ? "e" : "o") + number)  // Preceder con "e" o "o" según sea par o impar
                .collect(Collectors.joining(", "));  // Unir los elementos con una coma
    }
}
