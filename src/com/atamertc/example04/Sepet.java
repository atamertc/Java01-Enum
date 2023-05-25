package com.atamertc.example04;

import java.util.ArrayList;
import java.util.Scanner;

/*

 */
public class Sepet {
    Urunler[] urunListesi = Urunler.values();
    ArrayList<Urunler> sepetListesi;

    public Sepet(ArrayList<Urunler> sepetListesi) {
        this.sepetListesi = sepetListesi;
    }

    public void sepetFulle() {
        for (int i = 0; i < urunListesi.length; i++) {
            sepetListesi.add(urunListesi[i]);
        }
    }

    public void sepetEkle(String urun) {
        sepetListesi.add(Urunler.valueOf(urun));
    }

    public int sepetHesapla(ArrayList<Urunler> sepetListesi) {
        int toplam = 0;
        for (int i = 0; i < sepetListesi.size(); i++) {
            toplam = toplam + sepetListesi.get(i).getFiyat();
        }
        return toplam;
    }

    public void urunListele() {
        for (int i = 0; i < urunListesi.length; i++) {
            System.out.println(i+1+"-"+urunListesi[i]);
        }
    }

    public void sepetListele() {
        if (sepetListesi.isEmpty()) {
            System.out.println("Sepetiniz bos");
        } else {
            for (int i = 0; i < sepetListesi.size(); i++) {
                System.out.println(i+1+"-"+sepetListesi.get(i));
            }
        }

    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int secim = 5;
        do {
            menuArayuz();
            secim = Integer.parseInt(scanner.nextLine());
            switch (secim) {
                case 1:
                    urunListele();
                    break;
                case 2:
                    while (true) {
                        System.out.println("Eklemek istediginiz urunu giriniz: ");
                        String urun = scanner.nextLine().toUpperCase();
                        sepetEkle(urun);
                        System.out.println("Eklemeye devam etmek icin 1 e cikmak icin 2 ye basin");
                        int devamMi = Integer.parseInt(scanner.nextLine());
                        if (devamMi == 2) {
                            break;
                        }
                    }
                    break;
                case 3:
                    sepetListele();
                    break;
                case 4:
                    System.out.println(sepetHesapla(this.sepetListesi));
                    break;
                case 5:
                    System.out.println("Cikis yaptiniz");
                    break;
            }
        } while (secim != 5);

    }

    public void menuArayuz() {
        System.out.println("===============================");
        System.out.println("Alisveris uygulamasina hosgeldiniz");
        System.out.println("1- Urunleri listele");
        System.out.println("2- Sepete ekle");
        System.out.println("3- Sepeti goster");
        System.out.println("4- Sepeti hesapla");
        System.out.println("5- Cikis");
    }









}
