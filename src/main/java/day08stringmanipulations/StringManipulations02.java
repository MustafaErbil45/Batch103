package day08stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        //Example 1:Bir string'deki space haric kac tane karakter kullanıldıgını gösteren kodu yazınız
        //         "Ali okula gitti." ==>14 tane karakter var
        String str = "Ali okula gitti.";

        //replace() method'u bir String'deki herhangi bir karakteri veya karakterleri değiştirmek için kullanılır.
        int num = str.replace( "", "").length();//str:ali okula gitti yerine kullanılır.
        System.out.println(num);

        //Example 2:bir string deki tüm "a" harflerini "A" ya ceviriniz.
        String s = "Ankara'nin tasina gözlerinin yasina bak.";

       String yeniS = s.replace( "a", "A");
        System.out.println(yeniS);

        //Example 3: Bir string deki  tüm "kara" kelimesinin yerine "*" koyunuz.
        String t = "Kara kara düsünme Ankara";

       String yeniT = t.replace("kara", "*");
        System.out.println(yeniT);//Kara * dusunme An*

        //Example 4: Bir Strindeki tüm sayıları "*" a çeviriniz.
       //           "AC202117004"; ==>AC********
        String stdId = "AC202117004";

        String yeniStdId = stdId.replaceAll( "[0-9]", "*");
        System.out.println(yeniStdId);//AC********


        //Bir grup datayı ifade eden kodlara "Regex" denir.
        //"Regex" Regular Expressions ın kisaltılmıs halidir.

        //1-)tüm rakamları ögrenmek icin ==>[0-9)
        //tüm kücük harfler ==>[a-z]
        //tüm büyük harfler==>[A-Z]
        //tum harler==>[a-zA-Z]
        //sesli harfler==>[aeiouAEIOU]
        //Space==>[ ]
        //tüm rakamlar ve tüm harfler ==>[0-9a-zA-Z]
        //tüm noktalama isaretleri==>\\p{Punct}//noktalama işaretleri için regex diye google da aratabilirsin
        //rakamlar haric tüm karakterler==>[^0-9]
        //kucuk harfler haric tüm karakterler==>[^a-z]
        //büyük harfler haric tüm karakterler==>[^A-Z]
        //tüm harfler haric tüm karakterler==>[^a-zA-Z]
        //space haric ==>[^ ]

        //Example 5: Verilen bir String de kullanılan noktalama işareti ve rakamlar ve space karakteri haric tüm
        //karakterlerin sayisini bulan kodu yazınız


        String u = "Ali 13 yasinda dersem inanma!...";
        int sonuc = u.replaceAll( "[0-9]", "").
                replaceAll( " ", "").
                replaceAll( "\\p{Punct}", "").
                length();

        System.out.println(sonuc);

        //Example 6:Bir password'un gecerli olup olmadıgını asagıdaki kurallara göre test eden kodu yazınız
        //          space haric en az sekiz karakter olmalı
        //         en az bir sembol, en az bir rakam, en az bir büyük harf icermeli
        //          en az bir kucuk harf icermeli

        String pwd = "B78c? K!m";
        //          space haric en az sekiz karakter olmalı
        boolean first = pwd.replace( " ", " ").length()>7;
        //         en az bir sembol icermeli
        boolean second = pwd.replaceAll( "[0-9a-zA-Z ]", "").length()>0;
        //          en az bir rakam icermeli
        boolean third = pwd.replaceAll( "[^0-9]", "").length()>0;
        //          en az bir büyük harf icermeli
        boolean fourth = pwd.replaceAll( "[^A-Z]", "").length()>0;
        //          En az 1 kucuk harf icermeli
        boolean fifth = pwd.replaceAll("[^a-z]", "").length()>0;

        boolean pwdGecerli = first && second && third && fourth && fifth;

        if(pwdGecerli){
            System.out.println("Password'unuz gecerlidir...");
        }else{
            System.out.println("Password'unuz gecerli degildir...");
        }


        //Example 7 : Bir String'deki noktalama isaretleri haric karakter sayısını gösteren kod yazınız
        String cumle = "Sen yapmazsan, ben ?...";
        int number = cumle.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(number);



        //Example 8:verilen bir string "Al" ile başlıyor ve "x" ile bitiyorsa ekrana "Harika" yazdirin,
        //          aksi halde "Normal" yazdırın.

        String v = "Kalex";
        boolean baslangic = v.startsWith("Al");
        boolean bitis = v.endsWith("x");
        String result = baslangic && bitis ? "Harika" : "Normal";
        System.out.println(result);






    }
}
