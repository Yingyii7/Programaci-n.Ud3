import java.util.Scanner;

public class programa6 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una nota de 0 a 10: ");
        double nota = input.nextDouble();
            
            if (nota >= 0 && nota <= 10) {

                if (nota < 5) {
                    System.out.println("Suspenso");
                } else if (nota < 7) {
                    System.out.println("Aprobado");
                } else if (nota < 9) {
                    System.out.println("Notable");
                } else {
                    System.out.println("Sobresaliente");
                } 
            } else {
                System.out.println("Nota no valida");
            }

        input.close();
    }
}