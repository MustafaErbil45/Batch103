package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

        /*İNTERVİEW SORUSUDUR.
        ArrayList ler ayni data tipine sahip birden fazla datayi depolamak için kullanılır.
        Array ile Arraylist'in farkı nedir?
           1-)Array oluştururken  Array'in icine kac tane eleman koymamız gerektiğini söylemeliyiz, söylediğimiz eleman
           sayısından fazla eleman koyamayız. Arraylar eleman sayısında "fixed" dirler.
           Arraylistleri oluştururken eleman sayısı söylemeye gerek yok, cunku ArrayList'ler eleman sayısında "flexible"(esnek) dirler.

           2-) Array'lerin icine "primitive" ve "referance" ler konulur.
               ArrayList'lerin icine ise sadece "non-primitive" ler konulur.

           3-) Array'ler super fast, cok hızlı. Array'ler memory'i çok az kullanır.
           Note:Eleman sayısı kesin belli olan coklu dataları depolamak için Array kullanırız, ama eleman sayısı değisken olan coklu
           datalar icin Array kullanma riskini almayın.
         */

    public static void main(String[] args) {

        //Arraylist nasıl oluşturulur?
        //1.yol
        ArrayList<Integer> ages = new ArrayList<Integer>();
        //2.yol
        ArrayList<Integer> heights = new ArrayList<Integer>();
        //3.yol
        List<Integer> nums = new ArrayList<Integer>();

        //Arraylist nasıl yazdırılır?
        System.out.println(nums);//[]

        //Arraylist nasıl eleman eklenir?
        //add() her zaman elemanı en sona ekler(insertion order)
        nums.add(21);
       nums.add(18);
       nums.add(20);
       System.out.println(nums);//[21,18,20]

        nums.add(1 ,50);
        System.out.println(nums);//[21,50,18,20]

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);
        System.out.println(nums);//[21,50,18,20,23,185]
        System.out.println(prices);//[23,185]

        nums.addAll(2,prices);
        System.out.println(nums);//[21,50,23,185,18,20,23,185]

        //ArrayList'lerin eleman sayisi nasıl bulunur?
        int elemanSayisi = nums.size();
        System.out.println(elemanSayisi);//8

        //ArrayList'lerde herhangi bir eleman nasıl seçilir?
        //get() methodu istenen bir index'teki elemani verir

        int el1= nums.get(3);
        System.out.println(el1);//185

        //ArrayList'in bos olup olmadigini nasıl anlarız?
        boolean bos1 =nums.isEmpty();
        System.out.println(bos1);//false

        boolean bos2 =ages.isEmpty();
        System.out.println(bos2);//true

        //ArrayList'lerde bir eleman nasıl değiştirilir?
        nums.set(3,200);
        System.out.println(nums);//[21, 50, 23, 200, 18, 20, 23, 185]

        //Example 1: nums ArrayList'indeki tüm tek sayiları 11 artırdıktan sonra ekrana yazdırınız

                //[21,50,23,200,18,20,23, 185]

        for(int w: nums){

            if(w%2!=0){
                nums.set(nums.indexOf(w),w+11);
             }
        }
        System.out.println(nums);//[32, 50, 34, 200, 18, 20, 34, 196]

        //remove() methodunun icine tamsayi koyarsanız Java onu index olarak kabul eder.
      //Example 2:ArrayList'den 200 elemanını siliniz
      //NOT:tüm tam sayılar JAVA için aksi söylenmedikçe primitive'dir yani "int" dir.
      //NOT:"primitevler" ArrayList'lerin elemani olamazlar.
      //NOT:"primitevi wrapper class a çevirirseniz, non-primiteve olur ve non-primitevler ArrayList lerin elemanı olur, index olamaz.
       Integer sayi=34;
        nums.remove(sayi);
        System.out.println(nums);//[32, 50, 200, 18, 20, 34, 196]

    }
}
