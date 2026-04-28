import java.util.Scanner;

public class JavaMenuProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== JAVA TOPICS MENU =====");
        System.out.println("1. Tokens");
        System.out.println("2. Operators");
        System.out.println("3. Control Flow Statements");
        System.out.println("4. Data Types");
        System.out.print("Enter Your Choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("\nThere are 6 Different Tokens in Java:\n"
                        + "1. Keywords\n"
                        + "2. Identifiers\n"
                        + "3. Operators\n"
                        + "4. Separators\n"
                        + "5. Comments\n"
                        + "6. Literals (Data)");
                break;

            case 2:
                System.out.println("\nThere are 9 Different Operators in Java:\n"
                        + "1. Arithmetic Operators\n"
                        + "2. Relational Operators\n"
                        + "3. Logical Operators\n"
                        + "4. Assignment Operators\n"
                        + "5. Unary Operators\n"
                        + "6. Bitwise Operators\n"
                        + "7. Shift Operators\n"
                        + "8. Ternary Operators\n"
                        + "9. instanceof Operator");
                break;

            case 3:
                System.out.println("\nThere are 3 Main Types of Control Flow Statements in Java:\n"
                        + "1. Decision Making Statements\n"
                        + "   - if Statement\n"
                        + "   - if-else Statement\n"
                        + "   - else-if Ladder\n"
                        + "   - switch Statement\n\n"

                        + "2. Looping Statements\n"
                        + "   - for Loop\n"
                        + "   - while Loop\n"
                        + "   - do-while Loop\n"
                        + "   - Enhanced for Loop\n\n"

                        + "3. Control Transfer Statements\n"
                        + "   - break Statement\n"
                        + "   - continue Statement\n"
                        + "   - return Statement");
                break;

            case 4:
                System.out.println("\nSelect Data Type:");
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
                int ch = sc.nextInt();

                switch (ch) {

                    case 1:
                        System.out.println("\nbyte = 1 byte | Range: -128 to 127");
                        break;

                    case 2:
                        System.out.println("\nshort = 2 bytes | Range: -32,768 to 32,767");
                        break;

                    case 3:
                        System.out.println("\nint = 4 bytes | Default Integer Type");
                        break;

                    case 4:
                        System.out.println("\nlong = 8 bytes | Large Integer Values");
                        break;

                    case 5:
                        System.out.println("\nfloat = 4 bytes | Decimal Values");
                        break;

                    case 6:
                        System.out.println("\ndouble = 8 bytes | Accurate Decimal Values");
                        break;

                    case 7:
                        System.out.println("\nchar = 2 bytes | Single Character");
                        break;

                    case 8:
                        System.out.println("\nboolean = true / false");
                        break;

                    case 9:
                        System.out.println("\nString = Group of Characters");
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }
                break;

            default:
                System.out.println("Invalid Main Choice");
        }

        sc.close();
    }
}