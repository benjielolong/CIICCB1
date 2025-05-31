package Tasks;

abstract class AbstractClass {
    // Abstract method that must be implemented by subclasses
    abstract void abstractMethod();
    
    // Concrete method with implementation
    void concreteMethod() {
        System.out.println("This is a concrete method.");
    }
}

// First implementation of the abstract class
class B extends AbstractClass {
    @Override
    void abstractMethod() {
        System.out.println("B's implementation of abstractMethod.");
    }
}

// Second implementation of the abstract class
class C extends AbstractClass {
    @Override
    void abstractMethod() {
        System.out.println("C's implementation of abstractMethod.");
    }
}

public class task14 {
    public static void main(String args[]) {
        // Create instance of class B
        B b = new B();
        b.abstractMethod();
        b.concreteMethod();
        
        // Create instance of class C
        C c = new C();
        c.abstractMethod();
        c.concreteMethod();
    }
}
