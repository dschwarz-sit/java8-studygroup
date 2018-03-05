package oca.chapter5;

class Cat {
    
    public void say() {
        System.out.println("miau");
        printType();
    }
    
    public static void printType() {
        System.out.println("pussy cat");
    }
}

class Lion extends Cat {

    public void say() {
        System.out.println("roar");
        printType();
    }
    
    public static void printType() {
        System.out.println("king of animals");
    }

}

public class Polymorphism  {
    
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.say();
        lion.printType();
        
        Cat cat = lion;
        cat.say();
        cat.printType();
        
        
    }
}

