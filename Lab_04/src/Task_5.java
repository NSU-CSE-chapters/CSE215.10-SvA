/*(Financial application: compute the future investment value) Write a method that computes future
        investment value at a given interest rate for a specified number of years. The future investment is
        determined using the following formula.

        futureInvestmentValue =

        investmentAmount ∗ (1 + monthlyInterestRate)୬୳୫ୠୣ୰୓୤ଢ଼ୣୟ୰ୱ∗ଵଶ

        Use the following method header:
public static double futureInvestmentValue(double investmentAmount, double
        monthlyInterestRate, int years)
        For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.
        Write a test program that prompts the user to enter the investment amount (e.g.,1000) and the interest
        rate (e.g., 9%) and prints a table that displays future value for the years from 1 to 30, as shown
        below:
        The amount invested: 1000
        Annual interest rate: 9
        Years Future Value
        1 1093.80
        2 1196.41
        ...
        29 13467.25
        30 14730.57
*/

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The amount invested: ");
        double invest = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Years Future Value: ");
        int years = input.nextInt();

        double ans = futureInvestmentValue(invest, annualInterestRate/12, years);
        System.out.printf("future investment value = %.2f", ans);
    }

    public static double futureInvestmentValue(double investmentAmount, double
            monthlyInterestRate, int years) {
      double  ans =  investmentAmount* Math.pow((1+monthlyInterestRate), years*12);

      return  ans;
    }
}
