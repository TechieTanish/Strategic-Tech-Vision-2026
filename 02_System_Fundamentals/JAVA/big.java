
// to find the biggest number among three numbers
import java.util.Scanner;

class Big {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int biggest = (a > b && a > c) ? a : (b > c ? b : c);

        System.out.println("The biggest number is: " + biggest);

        sc.close();
    }
}
