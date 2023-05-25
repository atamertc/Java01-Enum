package com.atamertc.example04;

public enum Urunler {
    CIPS(5),KOLA(6),SEKER(4),YAG(7),UN(3),EKMEK(1),CAY(4),YUMURTA(6),YOGURT(3), SUT(2);

    int fiyat;
    Urunler(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getFiyat() {
        return fiyat;
    }

}
