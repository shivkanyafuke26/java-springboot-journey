public class Constructor {

    public Constructor() {
        System.out.println("Constructor have same name as class name");
        System.out.println("I'm Non Parameterized Constructor");
    }

    public Constructor(int a) {
        System.out.println("I'm Parameterized Constructor.");
        System.out.println(a);
    }

    Constructor(Constructor c) {
        System.out.println("I'm Copy Constructor.");
    }


    public static void main(String[] args) {

        System.out.println("Constructor");
	
	    System.out.println("There are 5 Types of Constructors:");
        System.out.println("1. Default Constructor");
        System.out.println("2. Parameterized Constructor");
        System.out.println("3. Non-Parameterized Constructor");
        System.out.println("4. Copy Constructor");
        System.out.println("5. Multiple Constructor\n");

        Constructor c1 = new Constructor();
      
        Constructor c2 = new Constructor(4);

        Constructor c3 = new Constructor(c1);   // Copy Constructor Call
    }
}