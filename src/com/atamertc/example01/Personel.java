package com.atamertc.example01;

public class Personel {
    public String uuid;
    public String ad;
    public String adres;
    public Unvanlar unvanlar;

    public Personel(String ad, String adres, Unvanlar unvanlar) {
        this.ad = ad;
        this.adres = adres;
        this.unvanlar = unvanlar;
        //this.unvanlar = unvanlar.ordinal(); // int donmek istiyorsan yapilabilir (gereksiz)
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Unvanlar getUnvanlar() {
        return unvanlar;
    }

    public void setUnvanlar(Unvanlar unvanlar) {
        this.unvanlar = unvanlar;
    }
}
