package com.company;
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args){
        String operation = "";
        Scanner Pattern = new Scanner(System.in);
        String hashed = "";
        boolean b;
        System.out.println ("Enter the pattern string:"); // user choose pattern words
        String search = Pattern.nextLine();
        String userCase = " ";
        hashed = search.replaceAll("[AaEeIiOoUu]", "*");
        while (true){
            System.out.println("Please Enter you string"); // users input string
            String string = Pattern.nextLine();
            b=string.contains(search); // find search word from string

            if(b==true) {
                System.out.println(hashed +" occurs in " + string );
                System.out.println("Do you want to continue? [Y/N]");
                String question = Pattern.nextLine();
                if(question.equalsIgnoreCase("n")) // if user want to continue muss write y/Y
                    break;
            }
            else {
                System.out.println(hashed +" does NOT occur in " + string);
                System.out.println("Do you want to continue? [Y/N]");
                String question = Pattern.nextLine();
                if(operation.equalsIgnoreCase("n"))
                    break;
            }

        }
        }
}
