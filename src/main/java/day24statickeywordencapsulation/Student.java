package day24statickeywordencapsulation;


//Encapsulation: "Date Hidding(Gizlemek)" demektir.
//Data'yi neden gizlersiniz ? Data'yi dis etkenlerden korumak icin
//Data'yi nasil gizlersin ? Access Modifier'ini "private" yaparak gizleriz.
//Data'yi gizledikten sonra baska Class'lardan okumak istersen ne yaparsin?
//"get method'lar (getter)" olusturarak gizledigimiz datalari okunur hale getirebiliriz.
//Data'yi gizledikten sonra baska Class'lardan degistirmek istersen ne yaparsin?
//"set method'lar (setter)" olusturarak gizledigimiz datalari degistirilir hale getirebiliriz.

public class Student {

    public String stdName = "Tom Hanks";
    private String stdId = "TH202201";
    private double gpa =3.8;
    private boolean retired = false;


}
