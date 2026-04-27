import java.util.Scanner;

public class DataTypesMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Data Type:");
        System.out.println("1. byte");
        System.out.println("2. short");
        System.out.println("3. int");
        System.out.println("4. long");
        System.out.println("5. float");
        System.out.println("6. double");
        System.out.println("7. char");
        System.out.println("8. boolean");
        System.out.println("9. String");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                byte b = 100;
                System.out.println("\nData Type : byte");
                System.out.println("Value     : " + b);
                System.out.println("Size      : 1 byte");
                System.out.println("Range     : -128 to 127");
                System.out.println("Used For  : Small integer values");
                break;

            case 2:
                short s = 2000;
                System.out.println("\nData Type : short");
                System.out.println("Value     : " + s);
                System.out.println("Size      : 2 bytes");
                System.out.println("Range     : -32,768 to 32,767");
                System.out.println("Used For  : Integer values");
                break;

            case 3:
                int i = 50000;
                System.out.println("\nData Type : int");
                System.out.println("Value     : " + i);
                System.out.println("Size      : 4 bytes");
                System.out.println("Range     : -2^31 to 2^31-1");
                System.out.println("Used For  : Default integer type");
                break;

            case 4:
                long l = 999999L;
                System.out.println("\nData Type : long");
                System.out.println("Value     : " + l);
                System.out.println("Size      : 8 bytes");
                System.out.println("Range     : Very large integers");
                System.out.println("Used For  : Large numeric values");
                break;

            case 5:
                float f = 10.5f;
                System.out.println("\nData Type : float");
                System.out.println("Value     : " + f);
                System.out.println("Size      : 4 bytes");
                System.out.println("Precision : Up to 6-7 digits");
                System.out.println("Used For  : Decimal values");
                break;

            case 6:
                double d = 25.6789;
                System.out.println("\nData Type : double");
                System.out.println("Value     : " + d);
                System.out.println("Size      : 8 bytes");
                System.out.println("Precision : Up to 15 digits");
                System.out.println("Used For  : Accurate decimal values");
                break;

            case 7:
                char c = 'A';
                System.out.println("\nData Type : char");
                System.out.println("Value     : " + c);
                System.out.println("Size      : 2 bytes");
                System.out.println("Range     : 0 to 65,535 (Unicode)");
                System.out.println("Used For  : Single character");
                break;

            case 8:
                boolean bool = true;
                System.out.println("\nData Type : boolean");
                System.out.println("Value     : " + bool);
                System.out.println("Size      : JVM dependent");
                System.out.println("Values    : true / false");
                System.out.println("Used For  : Conditions");
                break;

            case 9:
                String str = "Hello Java";
                System.out.println("\nData Type : String");
                System.out.println("Value     : " + str);
                System.out.println("Size      : Depends on length");
                System.out.println("Type      : Non-Primitive");
                System.out.println("Used For  : Group of characters");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}