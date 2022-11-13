package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Size verilen pozitif ve negatif sayilar içeren bir integer array'deki "en büyük negatif" ve en küçük pozitif
        // elemanı bulunuz.

        int arr [] = { -12, 18, -5, 23, -2, 0};

        Arrays.sort(arr);

        int maxNegative = arr[0];
        int minPositive = arr[arr.length-1];

                            // [ -12, -5, 0, 18, 23]
        for(int w : arr) {

            if(w<0) {
                maxNegative = Math.max(maxNegative, w);

            }
               if(w>0){

                   minPositive = Math.min(minPositive,w);
               }


            System.out.println("En buyuk negatif: " + maxNegative );
            System.out.println("En kucuk pozitif: " + minPositive );

        }
    }


}
