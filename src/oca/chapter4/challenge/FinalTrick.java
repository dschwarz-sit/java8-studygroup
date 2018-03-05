package oca.chapter4.challenge;

public class FinalTrick {

    // begin - keep this block as is
    public final String CONST;
    
    { 
        CONST = "const";
    }
    
    public void init() {
        try {
            System.out.println(CONST.toString());
        } catch (NullPointerException e) {
            System.out.println("Can your reach this line?");
        }
    }
    // end - keep this block as is

    public static void main(String[] args) {
        new FinalTrick().init();
    }

}

