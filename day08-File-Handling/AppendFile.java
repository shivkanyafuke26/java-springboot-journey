import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt", true);
            writer.write("\nAppending new data...");
            writer.close();

            System.out.println("Data appended");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}