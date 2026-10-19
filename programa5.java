import java.util.Scanner;

public class programa5 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un año: ");
        int año = input.nextInt();

        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
            System.out.println("El año " + año + " es bisiesto");
        } else {
            System.out.println("El año " + año + " no es bisiesto");
        }
        input.close();
    }
}
