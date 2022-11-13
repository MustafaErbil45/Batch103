package day07ternarystringmanipulation;

public class NestedTernary01 {

    public static void main(String[] args) {

        /*
        Verilen yılın "Leap Year"(Artık Yıl) olup olmadığını kontrol eden kodu yazınız.
        1-)yıl 100 e bölünürse 400 e de bölünmelidir.==>1600+ 1800-
        2-)yıl 100 2 bölünmezse 4 e bölünmelidir.==>1996+ 2001-

         */
        int year = 2022;
        String leap =year%100==0 ? (year%400==0 ? "Leap year" : "Leap year degil") : (year%4==0 ? "Leap year" : "Leap year degil");
        System.out.println(leap);

            /*
            Asagıdaki kurallara göre password'un gecerli olup olmadıgını kontrol eden kodu yazınız
            1-)sekiz karakterden fazla veya  sekiz karakter varsa ilk harfi 'i' olmalıdır.
            2-)Sekiz karakterden az karakter varsa ilk harfi 'K' olmalıdır.
             */
        String pwd = "K2a3";

        char ilkHarf = pwd.charAt(0);

        String gecerli = pwd.length()<8 ? (ilkHarf=='K' ? "Gecerli" : "Gercersiz") : (ilkHarf=='i' ? "Gecerli" : "Gecersiz");

        System.out.println(gecerli);


    }

}
