import java.io.*;
import java.util.Scanner;

public class EmployeeFileManager {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Add Employee\n2. View Employees");
        int choice = sc.nextInt();

        if (choice == 1) {
            FileWriter fw = new FileWriter("emp.txt", true);
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            fw.write(id + " " + name + "\n");
            fw.close();

            System.out.println("Employee Added");

        } else if (choice == 2) {
            BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        }
    }
}