// Programa que identifique si un número es primo
import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("PROGRAMA QUE DETERMINA SI UN NÚMERO ES PRIMO");
        System.out.println("Ingresa el número");
        int numero = lector.nextInt();
        boolean esPrimo = true;
        int i = 2;
        while(i < Math.sqrt(numero)){
            if(numero % i == 0){
                esPrimo = false;
            }
            i++;
        }
        if(esPrimo) {
            System.out.println("Sí es primo");
        }
        else {
            System.out.println("No es primo");
        }
    }
}
