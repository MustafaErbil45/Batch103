package day22inheritancepolymorphism;


public class Cat extends Mammal{

    public int a = 14;

    public void eat(){
        System.out.println("Cat eat");
    }

    public Cat(){
        System.out.println("Cat");
   }

    @Override
    public int add(int a, int b) {
        return 0;
    }

    @Override
    public Integer multiply(int a, int b) {
        return null;
    }

    @Override
    public Mammal create() {
        return null;
    }
}
