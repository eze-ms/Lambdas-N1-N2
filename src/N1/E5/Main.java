package N1.E5;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la Functional Interface usando una lambda
        MyFunctionalInterface pi = () -> 3.1415d;

        System.out.println("Code Pi: " + pi.getPiValue());
    }
}
