package Project;

import java.util.ArrayList;
import java.util.Scanner;

class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> amounts = new ArrayList<>();
        amounts.add(1000.0);
        amounts.add(2000.0);
        amounts.add(1500.0);
        amounts.add(1200.0);
        amounts.add(800.0);
        amounts.add(500.0);

        double total = 0;

        for (double am : amounts){
            total += am;
        }

        double ans = (9.0 / 100) * total;

        System.out.println("Amounts: " + amounts);
        System.out.println("Total of 6-month statement: " + total);
        System.out.println("9/100 of the total: " + ans);

    }
}
