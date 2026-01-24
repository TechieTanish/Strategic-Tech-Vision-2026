import java.util.Scanner;

class TempConverter {
    public static void main(String args[]) {
        System.out.println("Program started");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");

        double F = scanner.nextDouble();

        double C = 5.0 / 9 * (F - 32);

        System.out.println("F = " + F);
        System.out.println("C = " + C);

        scanner.close();
    }
}
