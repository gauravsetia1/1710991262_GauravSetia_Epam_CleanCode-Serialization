package org.example.constructionCost;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter material type :-");
        String material= scanner.nextLine();
        System.out.println("Enter area :-");
        int area= scanner.nextInt();
        System.out.println("Enter automation type :-");
        String automation=scanner.next();

        Cost cost = new Cost(material,area,automation);
        System.out.println("The Final Cost : Rs."+ cost.calculateCost());
    }
}
