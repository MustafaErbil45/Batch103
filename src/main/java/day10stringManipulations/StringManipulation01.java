package day10stringManipulations;

public class StringManipulation01 {

    public static void main(String[] args) {

        String a = "Java kolaydir.";

       //startsWith("kola", 5) kodu ilk 5 karakter'den sonraki String'e bakar ve o String'in "kola" ile baslayip
        // baslamadigini kontrol eder."kola" ile basliyorsa "true", baslamiyorsa "false" return eder.

        boolean b = a.startsWith( "kola", 5);
        System.out.println(b);

        //replaceFirst("a", "*"); kod String deki ilk "a" yi "*" e cevirir.
        //replace("a", "*"); kod String deki tum "a" lari "*" e cevirir.

        String c = a.replaceFirst( "a", "*");
        System.out.println(c);//J*ava kolaydir

        //concat() method'u iki tane String'i birbirine yapistirmaya yarar.
        //"Concatenation" islemi iki turlu yapilabilir; i)+ ile ii)concat() ile
        //Java bir islem icin method uretmisse o method'u kullanmak "best practice" dir.

        String d = c.concat("Anladın mı?");
        System.out.println(d);//Java kolaydir. Anladın mi?

        String e = "     Tom Hanks     ";
        System.out.println(e);// "    Tom Hanks     "

        //trimm() methodu bir Stringin bas ve sonundaki "space" characterlerini siler,arada ki "space " characterlerine dokunmaz
        String f = e.trim();
        System.out.println(f);//"Tom Hanks"

       String h = "Java";
       String i = "Java";

       //h.compareTo(i); kod iki tane String'i alfabetik(lexicographic) olarak karsilastirir.
        //Buyuk harf e duyarlidir.
        //Buyuk harf kucuk harf'e duyarli olmasini istemezseniz h.compareToIgnoreCase(i); kullanabilirsiniz.
        //h.compareTo(i); kodda "h" nin alphabetik sirasindan "i" nin alfabetik sirasi cikarilir.

       int k = h.compareTo(i);
        System.out.println(k);

        //a.repeat(5); kodu "a" String'ini yanyana 5 kere yapistirir
        //repeat(0);empty String return eder.
        //Java Documents'a ulaşmak için --> Windows==>Ctrl e basılı tutun ve mouse ile method ismine tıklayın.
        String n= a.repeat(-5);
        System.out.println(n);




    }

}
