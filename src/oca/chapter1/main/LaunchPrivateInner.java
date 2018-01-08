package oca.chapter1.main;


class LaunchPrivateInner {

    public static void main(String[] args) {
        System.out.println("outer");
    }
    
    private static class PrivateInner {
        
        public static void main(String[] args) {
            System.out.println("PrivateInner called");
        }
    }

}

