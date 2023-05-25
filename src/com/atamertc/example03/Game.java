package com.atamertc.example03;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Taş-Kağıt-Makas Oyununa hoşgeldin!");
        System.out.println("Seçimini yap!");
        System.out.println("1- " + EGameActions.ROCK);
        System.out.println("2- " + EGameActions.SCISSORS);
        System.out.println("3- " + EGameActions.PAPER);
        EGameActions[] gameActions = EGameActions.values();
        EGameActions player = gameActions[sc.nextInt() - 1];
        EGameActions computer = gameActions[rnd.nextInt(3)];

        if (computer == player)
            System.out.println("Tie! Both player chose same action");
        else if (computer.loserTo.equalsIgnoreCase(player.name()))
            System.out.println("Player won!");
        else {
            System.out.println("Computer won...");
        }

    }




}
