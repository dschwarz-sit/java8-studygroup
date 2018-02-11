package oca.chapter4;

public class Constructor {

    public static int global;
    public static int a = global;

    static {
        global = 1;
    }

    public static int b = global;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
