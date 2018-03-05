package oca.chapter5;

class Parent {
    
    public void publicMethod() { }
    
    protected void protectedMethod() { }
    
    private void privateMethod() { }
}

public class OverrideOverload extends Parent {

    public void publicMethod() { }
    
    public void protectedMethod() { }

    public void privateMethod() { }

}

