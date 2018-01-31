package oca.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static void main(String[] args) {
//        arrToList();
//        listToArr();
    }
    
    public static void arrToList() {
        
        String[] arr = { "a", "b", "c" };
        List<String> arrList = Arrays.asList(arr);  // backed list
        
        arr[0] = "other";
        
        System.out.println(arrList);
    }
    
    public static void listToArr() {
        
        List<String> arrList = new ArrayList<>();
        arrList.add("a");
        
//        String[] arr = arrList.toArray(new String[0]);
        
//      String[] arr = new String[1];
//      arrList.toArray(arr);  // caution!
        
//        String[] arr = arrList.toArray(new String[arrList.size()]);
        
        String[] arr = new String[arrList.size()];
        arrList.toArray(arr);
        
        arrList.add("abc");
        
        System.out.println(java.util.Arrays.toString(arr));
    }
}
