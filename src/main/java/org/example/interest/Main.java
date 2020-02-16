package org.example.interest;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        double principle,rate;
        int time;

        System.out.println("Enter Principle : ");
        principle=scanner.nextDouble();
        System.out.println("Rate : ");
        rate=scanner.nextDouble();
        System.out.println("Time : ");
        time=scanner.nextInt();

        Interest interest=new Interest(principle,rate,time);
        System.out.println("Simple Interest :- "+interest.getSimpleInterest());
        System.out.println("Compound Interest :- "+interest.getCompoundInterest());
    }
}
