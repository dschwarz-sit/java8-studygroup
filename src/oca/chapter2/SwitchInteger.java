package oca.chapter2;

public class SwitchInteger {

    public static void main(String[] args) {

        final int COMPARE = 1;
        
        Integer i = 1;
        
        switch(i) {
        
            case COMPARE:
                System.out.println("Match const");
                break;
                
            default:
                System.out.println("Fallback");
        }
    }
    
}
