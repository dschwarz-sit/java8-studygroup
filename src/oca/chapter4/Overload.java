package oca.chapter4;

public class Overload {

    void foo(short b) {
        System.out.println("foo short");
    }

    void foo(int i) {
        System.out.println("foo int");
    }

    public static void main(String[] args) {
        byte c = 'x';
        new Overload().foo(c);
    }
}
