package day06nestedifswitch;

public class NestedIf01 {

    public static void main(String[] args) {

        //Nested=iç içe geçmiş demiş(zigon sehpa gibi)(If'ın icinde If)
        /*
        Password'un ilk harfi büyük harf ise
         'A' olursa geçerli password aksi halde gecersiz password
        Pasword'un ilk harfi küçük harfse
         'z' olursa gecerli password aksi halde gecersiz password
         */
   //note:Java "nested" kodlari calistirirken cok zaman harcar, buna "Time Complexity" denir.
        //Bu yuzden mumkunse "nested" kod yazmamaya calisiriz.


        String pwd = "5xy12!";
        char ilkHarf = pwd.charAt(0);

        if(ilkHarf>='A' && ilkHarf<='Z'){
            if(ilkHarf=='A'){
                System.out.println("Gecerli Password");
            }else{
                System.out.println("Gecersiz Password");
            }
        }else if(ilkHarf>='a' && ilkHarf<='z'){
            if(ilkHarf=='z'){
                System.out.println("Gecerli Password");
            }else{
                System.out.println("Gecersiz Password");
            }
        }else{
            System.out.println("Ilk karakter harf olmalidir");
    }

    }
}
