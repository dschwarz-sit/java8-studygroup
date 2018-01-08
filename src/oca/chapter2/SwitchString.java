package oca.chapter2;

public class SwitchString {

    public static final String COMPARE = "other";
    
    
    public static void main(String[] args) {

        String cmp = "cmp";
        
        switch(cmp) {
            case COMPARE:
                System.out.println("Match");
                break;
            default:
                System.out.println("Fallback");
        }
    }
    
}
