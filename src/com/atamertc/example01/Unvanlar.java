package com.atamertc.example01;
//enum nedir? kendi tipinden ve belirli sayida nesneyi sirali olarak tutan yapi
//buradaki tum alanlar public static final
//enum alanlari yazimi bittiginde baska bir alan metod veya constructor yazicaksak
//; ile sonlandirmalisin
//enumlarla inheritance yapamazsiniz
//constructori private olmak zorundadir
//isimlendirmesi BUYUK_HARF ile yapilir
//
//3 onemli metod var:
//1. ordinal(): enum fieldlarin indexini donuyor.(dizi mantigi)
//2. values(): enum icindeki tum degerleri bir dizi olarak doner.
//3. valueOf(): String olarak verilen degeri enum icinde bulursa doner.
//
//enum icindeki fieldlarin her biri icin constructor calisir
public enum Unvanlar {
    MUDUR("Mudur", 10),
    MUHENDIS("Muhendis", 8),
    HIZMETLI("Hizmetli", 5),
    ;

    String unvan;
    int no;

    Unvanlar(String unvan, int no) {
        this.unvan = unvan;
        this.no = no;
    }

}
