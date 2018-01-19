package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        {
            // code for personal assessment week 2 (Friday 1/19/18)
            //SCOTT - Here is what I don't understand and therefore could not complete the assessment:
            //1) The while statements I struggle with. I have included it below but it is not done correctly.
            //   I have commented much of this out to reduce the errors.
            //2) How to make user's input 'generic' in order for it to continue to be re-evaluated.
            //   The code below includes the logic I was thinking about, but it is has a different names for each time the user enters a number.  NOT GOOD CODING.
            //3) How to count the users' input.
            //4) The If and If Else statements are not written correctly.
            // NOTE: I had it running at least to ask the questions and prompt a reply, but after attempting to add in my While Statements I messed something up.

            Boolean ask = true;
            Scanner sc = new Scanner(System.in);
            while(ask){

            Random selectNumber = new Random();
            int selectRandom = selectNumber.nextInt(10000);
            System.out.println(selectRandom + " DISPLAYED FOR TESTING PURPOSE ONLY!!!");


            System.out.println("Please enter a number between 1 - 10,000:");
            String originalNumber = sc.nextLine();
            int originalInt = Integer.parseInt(originalNumber);

                {

                    {
                        if (originalInt == selectRandom);
                        System.out.println("Good Job");

                    }else if (originalInt > selectRandom) {
                    System.out.println("LOWER");
                    System.out.println("The random number is less than " + originalInt + " and > 1");
                    System.out.println("Please enter another number:");
                    String secondNumber = sc.nextLine();
                    int secondInt = Integer.parseInt(secondNumber);

                }else if (originalInt < selectRandom) {
                    System.out.println("HIGHER");
                    System.out.println("The random number is greater than " + originalInt + " and < 10,000");
                    String secondNumber = sc.nextLine();
                    int secondInt = Integer.parseInt(secondNumber);
                }
//                System.out.println("Do you want to play again?");
//               String responseFromUser = sc.nextLine();
//               if (responseFromUser.equalsIgnoreCase("yes")) {
//                   ask = true;
//               }else {
//                   ask = false;{
                         System.out.println("Have a nice day.");
               }
            }




}}