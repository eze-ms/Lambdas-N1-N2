package N2.E3;

public class Main {
    public static void main(String[] args) {

        // Crear operaciones utilizando referencias a métodos
        Operation addition = Operations::add;  // Referencia al método estático add
        Operation subtraction = Operations::subtract;  // Referencia al método estático subtract
        Operation multiplication = Operations::multiply;  // Referencia al método estático multiply
        Operation division = Operations::divide;  // Referencia al método estático divide


        System.out.println("Addition: " + addition.operation(5, 3));
        System.out.println("Subtraction: " + subtraction.operation(5, 3));
        System.out.println("Multiplication: " + multiplication.operation(5, 3));
        System.out.println("Division: " + division.operation(5, 3));
    }
}
