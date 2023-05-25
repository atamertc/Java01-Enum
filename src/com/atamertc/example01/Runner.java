package com.atamertc.example01;

public class Runner {

    public static void main(String[] args) {

        Personel personel = new Personel("Engin", "Ankara", Unvanlar.MUDUR);
        Personel personel1 = new Personel("Ata", "Ankara", Unvanlar.MUHENDIS);
        System.out.println(Unvanlar.HIZMETLI.name()+" "+Unvanlar.HIZMETLI.ordinal());

    }
}
