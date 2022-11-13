package day29abstractioncollections;

        /*

        "abstract method" lar sadece ne yapılacağını söyler(What to do9
        "concrete method" lar ne yapılacağı ile birlikte nasıl yapılacağını(How to do) da söyler.

        "interface" ler bir yapılacaklar işler listesidir.(To do list)

        "multiple parent interface" kullandığınızda aynı method ismi ile birden fazla method oluşturursanız bu methodların
        return type'ları aynı olmalıdır.Aksi takdirde hata verir.

        "interface" lerde constructor olmadığı için interface'lerden object oluşturulamaz.
        "abstract class" larda class oldukları için constructorlar vardır.
         Ama constructor lar abstract class'larda object oluşturamazlar.

        Soru:"Abstract Class" ile "Interface" in farkları nelerdir?
             1)Method
                "Abstract Class" hem abstract hem de concrete method lar içerebilir.
                "Interface" ler ise sadece abstract method'lar içerir.
                Ama istesek interface'ler içinde de "default" ve "static" keyword'ler kullanarak concrete method'lar oluşturabiliriz.

            2)Variable
                "Abstract Class" larda normal Class'lardaki gibi her türlü variable oluşturabilir.
                "Interface" lerde ise variable'lar public static ve final olmak zorundadır.

            3)Inheritance
            "Abstract Class" lar class oldukları için multiple inheritance'a müsade etmezler.
            "Interface"ler ise multiple Inheritance'i destellerler.

           4)Object Creation
            "Abstract Class" larda constructor vardir ama object olusturmada kullanilmazlar.
            "Interface" lerde ise constructor olmadigindan object olusturulamaz.


      Soru:Object Oriented Programming Language prensipleri nelerdir?
           i)Inheritance ii)Polymorphism iii)Encapsulation  iv)Abstraction

        */



public class Civic implements Engine, Ac{


    @Override
    public void run() {
        System.out.println("Civic runs well");

    }


}
