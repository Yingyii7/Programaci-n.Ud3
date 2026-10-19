import java.util.Scanner;

/**
 *
 * @author Usuario1
 */
public class programa3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        double numero1 = input.nextDouble();
        System.out.println("Introduce un segundo numero: ");
        double numero2 = input.nextDouble();
        
        if (numero1 < numero2) {
            System.out.println("El numero " + numero1 + " es menor que " + numero2);
        } else if (numero1 > numero2) {
            System.out.println("El numero " + numero1 + " es mayor que " + numero2);
        } else {
            System.out.println("Los numeros son iguales");
        }
        input.close();
    }
} 

