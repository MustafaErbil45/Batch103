package day24statickeywordencapsulation;

import java.util.Scanner;

public class SuleHocaday12 {

    // Kullanicidan dogdugu ay ve gun bilgilerini alarak burcunu hesaplatan kodu yaziniz

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen doggunuz ayı String olarak giriniz...");
        String ay =input.nextLine();

        System.out.println("Lutfen dogdugunuz gun bilgisini yazınız");
        int gun =input.nextInt();

        String burc="";

        if( ay.equalsIgnoreCase("Ocak")){
            if(gun>22)
                burc="kova";
            else burc="Oglak";

        }
        if( ay.equalsIgnoreCase("Subat")){
            if(gun>22)
                burc="kova";
            else burc="Oglak";

        }
        if( ay.equalsIgnoreCase("Mart")){
            if(gun>22)
                burc="kova";
            else burc="Oglak";

        }
        if( ay.equalsIgnoreCase("Nisan")){
            if(gun>22)
                burc="kova";
            else burc="Oglak";

        }
        if( ay.equalsIgnoreCase("Mayıs")){
            if(gun>22)
                burc="kova";
            else burc="Oglak";

        }
        if( ay.equalsIgnoreCase("Haziran")){
            if(gun>22)
                burc="kova";
            else burc="Oglak";

        }
        if( ay.equalsIgnoreCase("Temmuz")){
            if(gun>22)
                burc="kova";
            else burc="Oglak";

        }
        if( ay.equalsIgnoreCase("Ağustos")){
            if(gun>22)
                burc="kova";
            else burc="Oglak";

        }
        if( ay.equalsIgnoreCase("Eylül")){
            if(gun>22)
                burc="kova";
            else burc="Oglak";

        }
        if( ay.equalsIgnoreCase("Ekim")){
            if(gun>22)
                burc="kova";
            else burc="Oglak";

        }
        if( ay.equalsIgnoreCase("Kasım")){
            if(gun>22)
                burc="kova";
            else burc="Oglak";

        }
        if( ay.equalsIgnoreCase("Aralık")){
            if(gun>22)
                burc="kova";
            else burc="Oglak";

        }

    }
}
