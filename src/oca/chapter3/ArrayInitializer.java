package oca.chapter3;

public class ArrayInitializer {
    
    public static void main(String[] args) {
        oneDimension();
    }
    public static void oneDimension() {
        
        String[] s1 = new String[] { "a", "b" };
        String[] s2 = new String[] { new String("a"), "b" };
        
        System.out.println(s1.equals(s2));
//        s1 = new String[] { "c", "d" };
//        s2 = { "c", "d" };
    }
    
    public static void towDimensions() {
        String[][] s1 = { { "a" }, { "c", "d" } };
        
        s1 = new String[][] { new String[] { "a" }, new String[] { "c", "d" } };
        s1 = new String[][] { { "a" }, { "c", "d" } };
//        s1 = { { "a" }, { "c", "d" } };
    }

}
