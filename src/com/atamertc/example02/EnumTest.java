package com.atamertc.example02;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println(EAylar.AGUSTOS.name());
        System.out.println(EAylar.AGUSTOS.ordinal());
        EAylar aylar = EAylar.valueOf("TEMMUZ");
        System.out.println(aylar.ordinal());

        EAylar[] aylars = EAylar.values();
        for (EAylar ay :
                aylars) {
            System.out.println((ay.ordinal() + 1) + "- " + ay);
        }
        System.out.println(EAylar.HAZIRAN.getGunSayisi());

    }
}
