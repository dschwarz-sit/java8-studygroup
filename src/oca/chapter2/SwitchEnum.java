package oca.chapter2;

public class SwitchEnum {

    enum Size {
        SMALL, MEDIUM, LARGE
    }
    
    public static final Size MEDIUM_SIZE = Size.MEDIUM;
    
    public void enumSwitch() {
        
        
        Size size = Size.MEDIUM;
        
        switch(size) {
            case LARGE:
                System.out.println("Large");
                break;
                
//            case Size.MEDIUM:
//                System.out.println("Medium");
//                break;
//
//              case MEDIUM_SIZE:
//                System.out.println("Medium too");
//                break;

            default:
                System.out.println("Not so large");
        }
    }
    
}
