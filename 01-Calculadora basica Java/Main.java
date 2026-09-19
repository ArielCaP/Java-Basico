import java.util.Scanner;

public class Main { // El nombre de la clase debe ser exactaente igual al nombre del archivo co el q
                    // guardaste el programa Main--Main.java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        double numero1 = sc.nextDouble();
        System.out.println("Ingese el segundo numero: ");
        double numero2 = sc.nextDouble();
        System.out.println("Que operacion desea realizar(+, -, *, /)🧡: ");
        String operacion = sc.next();
        if (operacion.equals("+")) {// .equals se utiliza para comparar texto y == este operador se usa para
                                    // numeros.
            double resultado = numero1 + numero2;
            System.out.println("El resultado de la suma es: " + resultado);
        } else if (operacion.equals("-")) {
            double resultado = numero1 - numero2;
            System.out.println("El resultado de la resta es: " + resultado);
        } else if (operacion.equals("*")) {
            double resultado = numero1 * numero2;
            System.out.println("El resultado de la multiplicacion es: " + resultado);
        } else if (operacion.equals("/")) {
            if (numero2 == 0) {
                System.out.println("ERROR---No se puede dividir para cero.");
            } else {
                double resultado = numero1 / numero2;
                System.out.println("El resultado de la division es: " + resultado);
            }
        } else {
            System.out.println("Operador invalido......");
        }
    }
}