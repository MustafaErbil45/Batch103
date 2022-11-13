package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        String str = "Kara kara dusunme Ankara";

        //indexOf() methodu verilen character veya caharacterlerin ilk görünümünün indexini verir.
        int idxA = str.indexOf("kara");
        System.out.println(idxA);

        //lastIndexOf() methodu
        int idxA2 = str.lastIndexOf("kara");
        System.out.println(idxA2);//9

        String s = "Mississippi";

        int idxI = s.indexOf('i');//indexOf() hem String hem de char ile kullanabiliriz
        System.out.println(idxI);//1

       int idxIss1 = s.indexOf("iss");//Ilk görünümün ilk karakterinin indexini verir.
        System.out.println(idxIss1);
        int idxIss2 =s.lastIndexOf("iss");//Son görünümün ilk karakterinin indexini verir.
        System.out.println(idxIss2);

    //Example 1;Bir String'deki bir character'in tekrarlı veya tekrarsız olduğunu gösteren kodu yazınız
        //"Helloooo"  ==>H-->Tekrarsız e-->tekrarsız l-->tekrarlı o-->tekrarlı

        String t = "Helloooo";
       char c ='e';

        if(t.indexOf('c')==t.lastIndexOf('c')){
            System.out.println("Tekrarsiz");
        }else{
            System.out.println("Tekrarli");
        }

        String u = "Learn Java earn money";

        //indexOf() iki parametre ile kullanılırsa ikinci parametrede verilen sayı kadar karakteri geçtikten sonra istenen
        //karakterin ilk görünümünün indeksini return eder.
        int sonuc = u.indexOf(" ", 6);
        System.out.println(sonuc);//11


        //lastIndexOf() iki parametre ile kullanılırsa ikinci parametrede verilen sayiyi index olarak kabul edip en baştan
        //bu indexe kadar olan karakterleri bir kutu içine alınız ve lastIndexOf() method'unu sadece bu kutu icindeki
        // String icin kullaniniz.
        String m = "Hello everyone!";
       int e = m.lastIndexOf("e", 10);
        System.out.println(e);


        String v = "";

        //isEmpty() method'u bir String'in bos olup olmadigini kontrol eder.
        //Eger String'de hic character yoksa isEmpty() "true" return eder, herhangi bir character varsa "false" return eder.
        //length()==0 demek isEmpty() true verir demektir.
        //Bir String'in bos olup olmadigini anlamak icin "length()==0" kullanmayin, "isEmpty()" kullanin

        boolean bosMU = v.isEmpty();
        System.out.println(bosMU);

        String x = " ";
        //isBlank() hem "bos String" icin hem de "sadece space" iceren String'ler icin true return eder.
        boolean blankMi = x.isBlank();
        System.out.println(blankMi);//true

        //Example 2: Kullanicidan alinan isim mutlaka space'den farkli en az 1 character icermelidir.

        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz...");
        String ilk = input.nextLine();

        if(ilk.isBlank()){
            System.out.println("Sana ismini gir dedim...");
        }else{
            System.out.println(ilk);
        }

    }

}
