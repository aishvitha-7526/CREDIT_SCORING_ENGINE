import java.util.Scanner;

public class CreditScoringEngine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Annual Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Monthly Expenses: ");
        double expenses = sc.nextDouble();

        System.out.print("Enter Loan Amount: ");
        double loan = sc.nextDouble();

        System.out.print("Good Repayment History? (true/false): ");
        boolean repayment = sc.nextBoolean();

        int score = 300;

        if(income > 500000)
            score += 200;

        if(expenses < income/12 * 0.5)
            score += 150;

        if(loan < income)
            score += 150;

        if(repayment)
            score += 100;

        System.out.println("\nCredit Score: " + score);

        if(score >= 800)
            System.out.println("Excellent Credit");
        else if(score >= 650)
            System.out.println("Good Credit");
        else if(score >= 500)
            System.out.println("Average Credit");
        else
            System.out.println("Poor Credit");

        sc.close();
    }
}
