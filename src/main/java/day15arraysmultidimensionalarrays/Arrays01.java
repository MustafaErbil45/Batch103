package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {
        //binarySearch() Method: Bu methodu kullanarak bir elemanın Array'da olup olmadığını anlarız.
        //binarySearch() Method'unu kullanmadan önce mutlaka Array.sort() kullanılmalıdır.
       //binarySearch() Method'u aradiğiz eleman Array'de varsa o elemanın indeksini return eder.

        //binarySearch() Method'u aradiğiniz eleman Array'de yoksa -a şeklinde bir negatif sayi alırsınız.
        //bu sayidaki a'nın anlamı bu eleman Array'de yok demektir, "a" nin anlami olsaydı kacinci sirada olurdu demektir.

        //binarySearch() Method'u tekrarlayan elemanlar için kullanılmaz.

        int arr[] = {12, 31, 43, 14};
        int sayi = 43;

        Arrays.sort(arr);// [12, 14, 31, 43]

        Arrays.binarySearch(arr, sayi);

        int idx1 = Arrays.binarySearch(arr, sayi);

        System.out.println(idx1);

       int sayi2 =17;
       int sonuc= Arrays.binarySearch(arr, sayi2);

        System.out.println(sonuc);//-3

    }
}
