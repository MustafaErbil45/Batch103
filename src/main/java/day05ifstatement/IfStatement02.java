package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

      //kullanici gün numarasini girsin kod gün ismini yazsın
      //      2==>Pazartesi     5==>Persembe ....

        Scanner input = new Scanner(System.in);
        System.out.println("Gun numarasını giriniz...");
        byte gunNo = input.nextByte();

        if(gunNo==1) {
            System.out.println("Pazar");
        }else if(gunNo==2){
            System.out.println("Pazartesi");
        }else if(gunNo==3){
            System.out.println("salı");
        }else if(gunNo==4){
            System.out.println("Carsamba");
        }else if(gunNo==5){
            System.out.println("Persembe");
        }else if(gunNo==6){
            System.out.println("Cuma");
        }else if(gunNo==7){
            System.out.println("Cumartesi");
        }else{
            System.out.println("Gecerli bir gun numarasi giriniz. Gecerli gun numaraları 1,2,3,4,5,6,7 dir");
        }

    }
}
