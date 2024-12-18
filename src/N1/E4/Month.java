package N1.E4;

import java.util.Arrays;
import java.util.List;

public class Month {
    // Metodo para imprimir los nombres de los meses utilizando method reference
    public void printMonths() {
        // Crear la lista con los nombres de los meses
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");

        // Imprimir todos los meses utilizando method reference
        months.forEach(System.out::println);  // Method reference para imprimir cada mes
    }
}
