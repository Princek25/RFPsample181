package com.bridgelabz.basics;
import javax.swing.*;
import java.util.Scanner;
public class vowel_consonent {
    public static void main(String[] args) {
        System.out.println("Enter a alphabet");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u' )
                System.out.println("Vowel");
        else
            System.out.println("Constant");



    }
}
