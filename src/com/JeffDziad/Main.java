package com.JeffDziad;

import java.util.Scanner;

public class Main {
    private static final String[] choices = new String[] {"Mild or Spicy", "Tea or Coffee", "Breakfast or Brunch", "Summer or Winter", "Paper or Plastic"};
    private static final String[] outcomes = new String[] {"You prefer life to be calm and organized.", "You prefer life to be spontaneous and active.", "You prefer a good balance in life."};
    private static int[] userInput = new int[5];
    private static boolean playAgain = true;
    private static int result = 0;
    public static void getResult(){
        for(int input: userInput){
            result += input;
        }
        System.out.printf("Your score: %d\n", result);
        System.out.print("Personality: ");
        if(result < 3) {
             System.out.println(outcomes[0]);
        }
        else if(result > 3) {
            System.out.println(outcomes[1]);
        }
        else {
            System.out.println(outcomes[2]);
        }
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int cont;
        do{
            System.out.println("Module 1 Assignment - Select your preference. 0 for left, 1 for right.");
            for(int i = 0; i < 5; i++){
                System.out.printf("---- Question %d ----\n", i + 1);
                System.out.println(choices[i] + "?");
                System.out.print("(0 / 1): ");
                userInput[i] = Integer.parseInt(keyboard.nextLine());
            }
            getResult();
            System.out.print("Play again? Press 0. -- Exit? Press 1. : ");
            cont = Integer.parseInt(keyboard.nextLine());
            if(cont == 1) {
                playAgain = false;
                break;
            }
            else if(cont == 0){
                userInput = new int[5];
                result = 0;
            }
        }while(playAgain);
    }
}
