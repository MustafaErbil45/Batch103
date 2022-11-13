package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //Kullanicidan yas degerini alan kodu alan ve yasin hangi evrede oldugunu asagidaki tabloya göre ekrana yazdrınız
        //0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //tanımlanmamis evre

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz...");
        int yas = input.nextInt();

        if(yas<0){
            System.out.println("Gecerli yas giriniz");
        }else if(yas<=4){
            System.out.println("Bebek");
        }else if(yas<=12){
            System.out.println("Cocuk");
        }else if(yas<=20){
            System.out.println("Genc");
        }else if(yas<=30){
            System.out.println("Yetiskin");
        }else{
            System.out.println("Tanımlanmamış evre...");
        }

    }
}
