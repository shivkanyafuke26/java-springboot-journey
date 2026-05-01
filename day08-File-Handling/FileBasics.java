import java.io.File;
import java.io.IOException;

public class FileBasics {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");

            if (file.createNewFile()) {
                System.out.println("File Created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }

            System.out.println("File Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());

            // Delete file
            // file.delete();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}