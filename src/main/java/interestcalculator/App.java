package interestcalculator;

import java.util.Scanner;

public class App 
{
    public double calculateSimpleInterest(double principal, double rate, double time)
    {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal Amount:");
        double principal = sc.nextDouble();

        System.out.println("Enter Rate of Interest:");
        double rate = sc.nextDouble();

        System.out.println("Enter Time (in years):");
        double time = sc.nextDouble();

        App obj = new App();

        double simpleInterest = obj.calculateSimpleInterest(principal, rate, time);

        System.out.println("Simple Interest is: " + simpleInterest);

        sc.close();
    }
}