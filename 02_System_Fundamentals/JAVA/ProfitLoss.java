// to caluclate the Profit loss by taking input from user of CP & SP

import java.util.Scanner;

class ProfitLoss {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost Price:");
        float CP = sc.nextFloat();
        System.out.println("Enter the Selling Price:");
        float SP = sc.nextFloat();
        float Result = (CP > SP) ? ((CP - SP) / CP) * 100 : ((SP - CP) / CP) * 100;
        System.out.println(Result);
        sc.close();

    }
}