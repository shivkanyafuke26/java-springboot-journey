import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        try {
            // Write object
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.txt"));
            out.writeObject(new Student(1, "Shivkanya"));
            out.close();

            // Read object
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.txt"));
            Student s = (Student) in.readObject();
            System.out.println(s.id + " " + s.name);
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}