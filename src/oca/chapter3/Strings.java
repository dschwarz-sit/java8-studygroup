package oca.chapter3;

public class Strings {

    public static void main(String... args) {
        String a = "a";
        StringBuilder sb = new StringBuilder("a");
        
        System.out.println(sb.equals(a));
        System.out.println(a.equals(sb));
        System.out.println(a.equals(sb.toString()));

    }
    
}
