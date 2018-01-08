package oca.chapter1;

public class Literals {

    static float x;
    static float y;
    
    public static void main(String[] args) {
        
        x = 010f;
        y = 010;
        
        System.out.println(x == y);
        System.out.println(x);
        System.out.println(y);
        System.out.println("------------------");
        
        x = 0b10;
        y = 010L;
        System.out.println(x == y);
        System.out.println(x);
        System.out.println(y);
        System.out.println("------------------");
        
        x = 01f;
        y = 0x1f;
        System.out.println(x == y);
        System.out.println(x);
        System.out.println(y);
    }
}
