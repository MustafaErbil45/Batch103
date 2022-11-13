package day07ternarystringmanipulation;

public class Ternary01 {

    public static void main(String[] args) {

        //example 1: Bir sayinin pozitif mi negatif mi olduğunu ekrana yazdıran kodu yazınız

        //1.Way:if-else
        int a = -12;
        if(a>0){
            System.out.println("Pozitif");
        }else{
            System.out.println("Pozitif degil");
        }
        //2.Way:ternary
                //Condition  ?  Condition doğru ise uygulanacak kod  : Cndition yanlis ise uygulanacak kod;
        String sonuc = a>0    ?         "Pozitif"                    :            "Pozitif değil";
        System.out.println(sonuc);

        //Example 2: Iki sayida kücük olanı secen kodu yazınız
        int b = 23;
        int c = 23;

       int min = b<c ? b : c;
        System.out.println(min);

        //Example 3:Verilen bir sayının mutlak degerini hesaplayan kodu yazınız.
        //              pozitif sayıların ve sıfırın mutlak degeri kendileridir.
        //              negatif sayilarin mutlak degeri -1 ile carpilmıs halleridir.

        int d = -45;
        int abs = d<0 ? -1*d : d;
        System.out.println(abs);

        //Example 4:Iki tane sayi ayni isaretli ise bu sayilari carpiniz, farkli isaretli ise "islem
        //yapamam" mesajı veriniz

        int e = 12;
        int f = 10;

        //Ternary farkli data tiplerinde sonuc return ederse sonucun data tipini "Object" yapiniz.
        Object islem = (e>0 && f>0) || (e<0 && f<0) ? e*f : "Islem Yapamam" ;
        System.out.println(islem);

        //Java'da her class'ın en az bir tane "parent" class'ı vardir.
        //Sadece object class'in "parent" clas'i yoktur.

    }

}
