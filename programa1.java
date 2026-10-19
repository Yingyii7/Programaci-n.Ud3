import java.util.Scanner;



public class programa1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce su edad: ");
        int edad = input.nextInt();
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
    }
}