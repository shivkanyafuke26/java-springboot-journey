import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFile {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("data.bin");
            fos.write(65); // ASCII A
            fos.close();

            FileInputStream fis = new FileInputStream("data.bin");
            System.out.println("Read: " + fis.read());
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}