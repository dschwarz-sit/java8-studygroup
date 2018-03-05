package oca.chapter3;

public class ZeroLengthArray {

    public static void main(String[] args) {
        String[][] arr = new String[2][0];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[0].length);
        
        arr[0] = new String[2];
        System.out.println(arr[0].length);
    }
}
