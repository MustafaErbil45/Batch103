package day40benimcalışmam;

import java.util.Scanner;

public class BenimCalısmam {

    public static void main(String[] args) {

        double gömlekFiyat = 19.6;
        double sapkaFiyat = 23.99;
        double ayakkabıFiyat = 102.85;

        System.out.println("Toplam Fiyat:" + gömlekFiyat + sapkaFiyat + ayakkabıFiyat);


        float x = 15.99F;
        long y = 13L;
        int z = 12;
        System.out.println("Değişkenlerin carpimi:" + x*y*z);

        //Basit faizi bulmak için bir kod yazınız.
        //Not: Basit faiz formülü = anapara * oran * yılDegeri /100
        int anapara = 10000, oran = 6, yilDegeri = 3;

        int basitFaiz =anapara * oran * yilDegeri/100;
        System.out.println("Basit faiz degeri:" + basitFaiz);


        //Bir String ve iki long data tipinde değişken oluşturunuz. Konsolda bu long değişkenlerin
        //toplamını ve çarpımını String ile yazdırınız
        String s ="Sonuc";
        Long a =123L;
        Long b=912344L;
        System.out.println(s+(a+b));
        System.out.println(s+a*b);

        //Değerleri farklı olan iki boolean data tipinde değişken oluşturunuz ve bu değerleri iki
        //ardışık değer arasında boşluk bırakacak şekilde aynı satırda yazdırınız.

        boolean c= true;
        boolean d= false;
        System.out.println(c+ "   "+d);

        //3 öğe (kitap, defter ve laptop) fiyatı için long data tipinde değişkenler oluşturunuz.
        //Konsolda 2 kitap, 4 defter ve 3 laptop için toplam fiyatını yazdırınız

        float kitap = 12.99F, defter =22.25F, laptop=1234.34F;
        float toplamFiyat= 2*kitap + 4*defter + 3*laptop;
        System.out.println("Toplam fiyat:" + toplamFiyat);

        //İki tamsayıyı değiştirmek için bir kod yazınız
        Scanner scan = new Scanner(System.in);
        System.out.println("2 sayi giriniz:");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        System.out.println("Değiştirmeden önce:" +n1+ "-" + n2);

        double temp = n1;
        n1=n2;
        n2=temp;
        System.out.println("Değiştirdikten sonra:" +n1+ "-" +n2);

       short yas=12;
       int yeniYas=yas;

       long uzunluk= 12L;
       int yeniuzunluk=(int)(uzunluk);

       double fiyat=1.2;
       short yeniFiyat=(short)fiyat;
        System.out.println(yeniFiyat);

        byte age=23;
        double newAge=age;
        System.out.println(newAge);




    }

}