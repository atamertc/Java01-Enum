package com.atamertc.example04;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("Sut");
        urunler.add("Kola");

        List<String> urunler2 = new ArrayList<>(List.of("Cips", "Kola", "Şeker", "Yağ", "Un", "Ekmek", "Çay", "Yumurta", "Yoğurt", "Süt"));
        //Y ile baslayanlari listeden sildirme
        ileBaslayanSil(urunler2,'Y');
        //ileBaslayanSil2(urunler2, 'Y');
        urunler2.remove(1);
    }

    private static void ileBaslayanSil(List<String> urunler2, char c) {
        List<String> urunlerYeni = new ArrayList<>(urunler2);
        for (int i = 0; i < urunler2.size(); i++) {
            if (urunler2.get(i).charAt(0) == c) {
                urunlerYeni.remove(urunler2.get(i));
            }
        }
        System.out.println(urunlerYeni);
    }

    private static void ileBaslayanSil2(List<String> urunler2, char c) {
        for (int i = urunler2.size() - 1; i >= 0; i--) {
            if (urunler2.get(i).charAt(0) == c) {
                urunler2.remove(i);
            }
        }
        for (String string :
                urunler2) {
            System.out.println(string);
        }
    }



}
