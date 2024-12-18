package N2.E3;

public class Operations {

    // Métodos estáticos para las operaciones
    public static float add(float a, float b) {
        return a + b;
    }

    public static float subtract(float a, float b) {
        return a - b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static float divide(float a, float b) {
        return b != 0 ? a / b : Float.NaN;  // Manejo de división por cero
    }
}

