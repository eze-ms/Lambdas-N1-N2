package N1.E3;

import java.util.Arrays;
import java.util.List;

public class Month {

    // Metodo para transformar los meses a mayúsculas usando una lambda
    public void printMonthsInUpperCase() {
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");

        // Transformar los meses a mayúsculas usando una lambda
        months.forEach(month -> System.out.println(month.toUpperCase()));
    }
}
