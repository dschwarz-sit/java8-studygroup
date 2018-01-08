package oca.chapter2;

public class Operator {

    public static void main(String[] args) {
        
        int var = 1;
        int d = ++var * (var++ + ++var);
        
        // 2 * (2 + 4)
        
        System.out.println(d);
    }
}
