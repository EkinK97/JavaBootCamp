package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner length = new Scanner(System.in);
        System.out.println("Please Enter length of the square:");
        int a = length.nextInt();
//        for (int x = 0; x < a ; x++) {
//            for (int y = 0; y < a ; y++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
        for (int j=1; j<=a; j++) //loop for top length
        {
            System.out.print("*");
        }
        System.out.println("");

        //dikdörtgenin orta kısmı
        for (int i=1; i<=a-2; i++) ///middle part of square
        {
            System.out.print("*");
            for (int j=1; j<=a-2; j++)
            {
                System.out.print("+");//inside of our sqaure
            }
            System.out.println("*");//add a star end of our line
        }

        for (int j=1; j<=a; j++) //loop for down length
        {
            System.out.print("*");
        }

    }
}
