import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number:");
        int n = sc.nextInt();
        int a = n;
        int temp = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            temp = temp + (d * d * d);
        }
        if (temp == a) {
            System.out.println(a + " is an Armstrong number");
        } else {
            System.out.println(a + " is not an Armstrong number");
        }

        sc.close();
    }
}
