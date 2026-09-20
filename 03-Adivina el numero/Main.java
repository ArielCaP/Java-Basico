import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int numeroSecreto=rand.nextInt(100)+1;//numero aleatorio del 0 al 99 por eso el +1
        int intentos=0;
        while (true) {
            System.out.println("Ingrese un numero del 1 al 100:");
            int intento=sc.nextInt();
            intentos=intentos+1;

            if (intento<numeroSecreto){
                System.out.println("Muy bajo intenta de nuevo.");
            }
            else if (intento>numeroSecreto) {
                System.out.println("Muy alto intenta de nuevo");
            }
            else{
                System.out.println("Felicidades acertaste el numero en "+intentos+" intentos.");
                break;
            }
        }
    }
}

