package oca.chapter2;

public class SwitchNull {

    public static void main(String[] args) {
        
        switchInteger(null);
        
    }
    
    public static void switchInteger(Integer i) {
        
        switch(i) {
            default:
                System.out.println("Always reached");
        }
    }
    
}
