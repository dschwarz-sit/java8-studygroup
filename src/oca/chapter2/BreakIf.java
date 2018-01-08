package oca.chapter2;

public class BreakIf {

    public static void main(String[] args) {
        
        label:
        {
            System.out.println("Checking args");
            
            if (args.length == 0) {
                break label;
            }
            
            System.out.println("Some args");
        }
    
        System.out.println("Done");
        
    }
}
