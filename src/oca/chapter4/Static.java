package oca.chapter4;

public class Static {
    public static String foo() {
        return "FOO";
    }
}

class Derived extends Static {

}

class Other {
    public static void main(String[] args) {

        System.out.println(Static.foo());
        System.out.println(Derived.foo());

        Static s = new Static();
        //System.out.println(s.foo());

        Derived d = new Derived();
        //System.out.println(d.foo());
        d = null;
        //System.out.println(d.foo());

    }
}