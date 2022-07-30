package com.bridgelabz.basics;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of these number: ");
        System.out.println(sum);

    }
}
