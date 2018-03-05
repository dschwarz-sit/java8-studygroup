package oca.chapter4;

public class OverloadMultipleParameters {

    public static void foo(int a, Integer b) {
        System.out.println(1);
    }
    
    public static void foo(int a, Long b) {
        System.out.println(2);
    }
    
    public static void foo(long a, Integer b) {
        System.out.println(3);
    }
    
    public static void foo(long a, long b) {
        System.out.println(4);
    }
    
    public static void foo(int... a) {
        System.out.println(4);
    }
        
    public static void main(String[] args) {
        foo(1,2);
    }

}
