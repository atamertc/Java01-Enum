package com.atamertc.example01;

//enum Color {
//    RED,
//    GREEN,
//    BLUE
//}
public class RunnerColor {
    //burda kullanilirsa diger siniflar erisemez
    enum Color {
        RED,
        GREEN,
        BLUE,
        WHITE;

        Color() {
            System.out.println("Constructor calisti");
        }
    }
    public static void main(String[] args) {
        Color color = Color.RED; //new kullanmadik dikkat!
        System.out.println(Color.GREEN.ordinal());
//        System.out.println(color);

        //3 onemli metod var:
        //1. ordinal(): enum fieldlarin indexini donuyor.(dizi mantigi)
        //2. values(): enum icindeki tum degerleri bir dizi olarak doner.
        //3. valueOf(): String olarak verilen degeri enum icinde bulursa doner.
//
//        Color[] colorDizi = Color.values();
//        for (Color c:
//             colorDizi) {
//            System.out.println("Field: "+c+" index: "+c.ordinal());
//        }
//        System.out.println(Color.valueOf("RED"));
    }
}
