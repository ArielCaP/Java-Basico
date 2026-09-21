import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Cuantas notas quieres ingresar?: ");
        int cantidad=sc.nextInt();
        double[] notas=new double[cantidad];//array con cantidad fija
        for(int i=0;i<cantidad;i++){
            System.out.println("Ingrese la nota #"+ (i+1)+ ": ");
            notas[i]=sc.nextDouble();
        }
        double suma=0;
        double maxima=notas[0];
        double minima= notas[0];
        for (int i=0;i<cantidad;i++){
            suma=suma+notas[i];
            if(notas[i]>maxima){
                maxima=notas[i];
            }
            if(notas[i]<minima){
                minima=notas[i];
            }
        }
        double promedio=suma/cantidad;
        System.out.println("El promedio es: " + promedio);
        System.out.println("La nota más alta es: " + maxima);
        System.out.println("La nota más baja es: " + minima);
    
    }
}
