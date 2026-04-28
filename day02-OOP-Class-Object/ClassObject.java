public class ClassObject {

    public static void main(String[] args) {

        // Abstract Class via Child Class
        ChildClass cl = new ChildClass();
        cl.run();
        cl.mainMethod();

        System.out.println();

        // Final Class
        FinalClass fc = new FinalClass();
        fc.show();

        System.out.println();

        // Interface Implementation
        InterfaceChild ic = new InterfaceChild();
        ic.print();

        System.out.println();

        // Inner Class
        OuterClass.Inner in = new OuterClass().new Inner();
        in.msg();

        System.out.println();

        // Static Nested Class
        OuterClass.StaticNested sn = new OuterClass.StaticNested();
        sn.show();

        System.out.println();

        // Anonymous Class (Abstract Class)
        AbstractClass obj = new AbstractClass() {
            void run() {
                System.out.println("Anonymous Class Implementation of Abstract Method");
            }
        };
        obj.run();
    }
}

/* Abstract Class */
abstract class AbstractClass {
    abstract void run();
}

/* Child Class of Abstract */
class ChildClass extends AbstractClass {

    public void run() {
        System.out.println("This is Abstract Class Implementation.");
        System.out.println("Can have abstract + non-abstract methods. Cannot create object");
    }

    public void mainMethod() {
        System.out.println("This is Child Class Method");
    }
}

/* Final Class */
final class FinalClass {

    public void show() {
        System.out.println("This is Final Class.");
    }
}

/* Interface */
interface MyInterface {
    void print();
}

class InterfaceChild implements MyInterface {
    public void print() {
        System.out.println("This is Interface Implementation.");
    }
}

/* Inner + Static Nested Class */
class OuterClass {

    class Inner {
        void msg() {
            System.out.println("This is Inner Class");
        }
    }

    static class StaticNested {
        void show() {
            System.out.println("This is Static Nested Class");
        }
    }
}