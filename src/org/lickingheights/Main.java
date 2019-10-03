package org.lickingheights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//declare phase
        Scanner Keyboard;
    int testing;
    String question;



    //initializing phase
        Keyboard = new Scanner(System.in);
        System.out.println("Give me a number 1-100 and a random question.");
        int firstNumber = Keyboard.nextInt();
        if (10 >= firstNumber && firstNumber > 0) {
            System.out.print("Very Possible");
        }
        else if (20 >= firstNumber && firstNumber > 11) {
            System.out.print("Impossible");
        }
        else if (30 >= firstNumber && firstNumber > 21) {
            System.out.print("Yes");
        }
        else if (40 >= firstNumber && firstNumber > 31) {
            System.out.print("That is very unlikely");
        }
        else if (50 >= firstNumber && firstNumber > 41) {
            System.out.print("Possible");
        }
        else if (60 >= firstNumber && firstNumber > 51) {
            System.out.print("Not that likely");
        }
        else if (70 >= firstNumber && firstNumber > 61) {
            System.out.print("Likely");
        }
        else if (80 >= firstNumber && firstNumber > 71) {
            System.out.print("I'm not sure");
        }
        else if (90 >= firstNumber && firstNumber > 81) {
            System.out.print("It is certain");
        }
        else if (100 >= firstNumber && firstNumber > 91) {
            System.out.print("Probably not");
        }

        else System.out.println("To high/low of a number");

    }
}
