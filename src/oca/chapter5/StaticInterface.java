package oca.chapter5;

public class StaticInterface implements I {

    public void somMethod() {
        defaultMethod();
        I.myStaticMethod();
    }
}

interface I {
    
    default void defaultMethod() {
        myStaticMethod();
    }
    
    static void myStaticMethod() {
        System.out.println("my static method");
    }
}