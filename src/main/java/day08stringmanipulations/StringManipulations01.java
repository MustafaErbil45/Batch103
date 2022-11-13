package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Kullanıcıdan aldığınız ismin ilk ve son harfini ekrana yazdırınız.
        //      Ramazan==>Rn

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = input.next();


       //1. yol
        char ilkHarf = isim.charAt(0);
        char sonHarf = isim.charAt(isim.length()-1);//yazdığınız kod sadece bazı durumlar için çalışırsa o koda
                                                    //" Hard Coding" denir. bu kod aslında kod değildir.
                                                    //yazdığınız kod her kod için çalışırsa  o koda "Dynamic Coding" denir.

        System.out.println("" + ilkHarf + sonHarf);// "" bu işareti ya başa ya ortaya koyabilirsin ama sen başa koy kanka

        //2. yol
       String ilk = isim.substring(0,1);
       String son = isim.substring(isim.length()-1);
       System.out.println(ilk + son);

       //Example 2:verilen stringdeki sadece hayvan isimlerini yazdırınız.
        //         "ben kedi, eşim tavuk, oğlum sever inek"

        String str = "ben kedi, esim tavuk, oglum sever inek";


       //substring() in iki kullanımı vardır.
       //1-)substring(baslangic indexi, bitis indexi) String'in ortasından bir parca almaya yarar
       //2-) substring(baslangic indexi) String'in verilen index'ten sonuna kadar almaya yarar
        String kedi = str.substring(4, 8);
        String tavuk = str.substring(15, 20);

       String inek = str.substring(34, 38);

        System.out.println(kedi + tavuk + inek);

        //Example 3:İlk isim ve soyisimi iceren isimlerden ilk ve soyisimlerin başharflerini ekrana yazdırınız.
        //          Ali Can ==>AC     Tahsin Yurdakul==>TY

        System.out.println("İlk ve soyisminizi giriniz");

        String tamIsim =input.nextLine();

        String a = tamIsim.substring(0, 1);

        String b =tamIsim.split( "")[1].substring(0,1 );

        System.out.println(a + b);



    }
}
