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
        







    }
}
