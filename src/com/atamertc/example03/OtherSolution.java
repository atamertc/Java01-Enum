package com.atamertc.example03;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class OtherSolution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int playerScore = 0;
        int computerScore = 0;
        int roundCounter = 0;

        System.out.println("How many rounds do you want to play?");
        int totalRound = Integer.parseInt(sc.nextLine());
        ArrayList<String> actionList = new ArrayList<>();
        actionList.add("rock");
        actionList.add("paper");
        actionList.add("scissors");

        //Iterate to totalRound count
        while (true) {
            roundCounter++;
            System.out.println("Round number: " + roundCounter);
            System.out.println("\"rock\",\"scissors\",\"paper\" choose one of them: ");
            String playerChoice = sc.nextLine();
            int computerChoice = rd.nextInt(actionList.size());

            System.out.println("Player choice: " + playerChoice);
            System.out.println("Computer choice: " + actionList.get(computerChoice));
            //Actions
            if (playerChoice.equals(actionList.get(computerChoice))) {
                System.out.println("Tie!, Both player chose same action");
            } else if (playerChoice.equals("rock")) {
                if (actionList.get(computerChoice).equals("scissors")) {
                    System.out.println("Player won!");
                    playerScore += 1;
                } else {
                    System.out.println("Computer won!");
                    computerScore += 1;
                }
            } else if (playerChoice.equals("paper")) {
                if (actionList.get(computerChoice).equals("rock")) {
                    System.out.println("Player won!");
                    playerScore += 1;
                } else {
                    System.out.println("Computer won!");
                    computerScore += 1;
                }
            } else if (playerChoice.equals("scissors")) {
                if (actionList.get(computerChoice).equals("paper")) {
                    System.out.println("Player won!");
                    playerScore += 1;
                } else {
                    System.out.println("Computer won!");
                    computerScore += 1;
                }
            }
            System.out.println("Score= " + "Player score: " + playerScore + " , Computer score: " + computerScore);
            System.out.println("====================================================");
            if (roundCounter == totalRound) {
                break;
            }
        }
        //Decision
        if (playerScore == computerScore) {
            System.out.println("There is no winner, Tie");
        } else if (playerScore > computerScore) {
            System.out.println("Player won with score= "+playerScore+" : "+computerScore);
        } else if (playerScore < computerScore) {
            System.out.println("Computer won with score= "+playerScore+" : "+computerScore);
        }


    }
}
