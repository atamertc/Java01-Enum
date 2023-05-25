package com.atamertc.example03;


enum EGameActions {
    ROCK("PAPER"), PAPER("SCISSORS"), SCISSORS("ROCK");

    String loserTo;

    private EGameActions(String loserTo) {
        this.loserTo = loserTo;
    }
}
