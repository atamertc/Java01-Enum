package com.atamertc.example01;

enum Gun {
    PAZARTESI,
    SALI,
    CARSAMBA,
    PERSEMBE,
    CUMA,
    CUMARTESI,
    PAZAR
}
public class RunnerEnumSwitch {

    public static void main(String[] args) {
        RunnerEnumSwitch runnerEnumSwitch = new RunnerEnumSwitch();
        runnerEnumSwitch.guneTepki(Gun.PAZARTESI);

    }
    public void guneTepki(Gun gun) {
        switch (gun) {
            case PAZARTESI -> System.out.println("Sendrom basladi");
            case CUMA -> System.out.println("Yasasin tatil geliyor");
            case CUMARTESI,PAZAR -> System.out.println("Dunya varmis");
            default -> System.out.println("Hayat devam ediyor");
        }
    }
}
