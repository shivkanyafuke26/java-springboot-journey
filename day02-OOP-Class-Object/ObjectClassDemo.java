public class ObjectClassDemo {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Shivani");
        Student s2 = new Student(1, "Shivani");
        Student s3 = new Student(2, "Aman");

        System.out.println("----- 1. toString() -----");
        System.out.println(s1.toString());

        System.out.println("\n----- 2. hashCode() -----");
        System.out.println(s1.hashCode());

        System.out.println("\n----- 3. equals() -----");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false

        System.out.println("\n----- 4. getClass() -----");
        System.out.println(s1.getClass());

        System.out.println("\n----- 5. clone() -----");
        try {
            Student s4 = (Student) s1.clone();
            System.out.println(s4);
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println("\n----- 6. finalize() -----");
        Student temp = new Student(3, "Temp");
        temp = null;
        System.gc(); // request garbage collection

        System.out.println("\n----- 7. wait(), notify(), notifyAll() -----");
        System.out.println("These are used in multithreading (not shown fully here)");
    }
}

/* ---------------- STUDENT CLASS ---------------- */
class Student implements Cloneable {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /* 1. toString() */
    public String toString() {
        return id + " - " + name;
    }

    /* 2. equals() */
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.id == s.id && this.name.equals(s.name);
    }

    /* 3. hashCode() */
    public int hashCode() {
        return id;
    }

    /* 4. clone() */
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /* 5. finalize() */
    protected void finalize() {
        System.out.println("Object is destroyed: " + name);
    }
}