package oca.chapter5;

public abstract class OverrideDefault implements Base {
    
    public abstract void print();

}

interface Base {
   default void print() {
       System.out.println("interface printing");
   }
}