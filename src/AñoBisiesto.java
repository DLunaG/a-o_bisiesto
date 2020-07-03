import java.util.Scanner;

public class AñoBisiesto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qué año quieres saber si es bisiesto: ");
        int año = sc.nextInt();

        if (año % 400 == 0) {
            System.out.println(año + " es un año bisiesto.");
        } else if (año % 100 == 0) {
            System.out.println(año + " no es un año bisiesto.");
        } else if (año % 4 == 0) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es bisiesto.");
        }
    }
}
