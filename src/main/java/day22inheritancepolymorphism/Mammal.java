package day22inheritancepolymorphism;


public abstract class Mammal extends Animal{

    public int a = 13;
    public int b = 34;

    public void eat(){
        System.out.println("Mammal eat");
    }

    public void drink(){
        System.out.println("Mammal drink");
    }

    public Mammal(){
        System.out.println("Mammal");
    }

    public abstract int add(int a, int b);

    public abstract Integer multiply(int a, int b);

    //Asagidaki method "Overriding Method"
    public abstract Mammal create();
}
