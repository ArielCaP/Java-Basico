import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese su estatura(m): ");
        double estatura=sc.nextDouble();
        System.out.println("Ingrese su peso en Kg: ");
        double peso=sc.nextDouble();
        double imc= peso/(estatura*estatura);

        if (imc<18.5){
            System.out.println("El imc"+ imc +" da como resultado un bajo peso.");
        }
        else if(imc>=18.5&&imc<=24.9){
            System.out.println("El imc"+imc+" da como resultado un peso normal.");
        }
        else if(imc>=25&&imc<=29.9){
            System.out.println("El imc"+imc+" da como resultado un sobrepeso.");
        }
        else{
            System.out.println("El imc"+imc+" da como resultado obesidad.");
        }
    }
}