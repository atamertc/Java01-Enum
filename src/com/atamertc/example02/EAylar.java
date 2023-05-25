package com.atamertc.example02;

public enum EAylar {
    HAZIRAN(30), TEMMUZ(31), AGUSTOS(31);

    private int gunSayisi;

    private EAylar(int gunSayisi) {
        this.gunSayisi = gunSayisi;
    }

    public int getGunSayisi() {
        return gunSayisi;
    }
}

