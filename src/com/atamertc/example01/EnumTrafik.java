package com.atamertc.example01;

enum TrafikIsiklar {
    RED("Kirmizi yaniyor, Dur"),
    YELLOW("Sari yaniyor, Hazirlan"),
    GREEN("Yesil yaniyor, Gec");
    String durum;

    TrafikIsiklar(String durum) {
        this.durum = durum;
    }

    public String getDurum() {
        return durum;
    }
}
public class EnumTrafik {
    public static void main(String[] args) {
        TrafikIsiklar[] isiklars = TrafikIsiklar.values();
        for (TrafikIsiklar isik :
                isiklars) {
            System.out.println(isik + " " + isik.getDurum());
        }
        System.out.println(TrafikIsiklar.RED.getDurum().equals("Kirmizi yaniyor, Dur"));

        TrafikIsiklar isik = null;
        System.out.println(isik == TrafikIsiklar.RED);
        //nullpointer!! -> System.out.println(isik.equals(TrafikIsiklar.RED));

    }
}
