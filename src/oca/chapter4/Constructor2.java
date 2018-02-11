package oca.chapter4;

public class Constructor2 {

    public int bar = global;

    public static int global = 1;

    public static void main(String[] args) {
        System.out.println(new Constructor2().bar);
    }
}
