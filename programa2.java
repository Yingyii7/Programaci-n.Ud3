import java.util.Scanner;

public class programa2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce su edad: ");
        int edad = input.nextInt();
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}