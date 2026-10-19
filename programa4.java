import java.util.Scanner;

public class programa4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        double numero1 = input.nextDouble();
        System.out.println("Introduce un segundo numero: ");
        double numero2 = input.nextDouble();
        System.out.println("Introduce un tercer numero: ");
        double numero3 = input.nextDouble();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El numero " + numero1 + " es el mayor");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El numero " + numero2 + " es el mayor");
        } else {
            System.out.println("El numero " + numero3 + " es el menor");
        }

        input.close();
    }
}