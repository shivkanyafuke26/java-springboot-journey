public class LoopingStatements {
    public static void main(String[] args) {

        System.out.println("FOR LOOP:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Value = " + i);
        }

        System.out.println("\nWHILE LOOP:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Value = " + j);
            j++;
        }

        System.out.println("\nDO-WHILE LOOP:");
        int k = 1;
        do {
            System.out.println("Value = " + k);
            k++;
        } while (k <= 5);

        System.out.println("\nENHANCED FOR LOOP:");
        int arr[] = {10, 20, 30, 40, 50};

        for (int value : arr) {
            System.out.println("Value = " + value);
        }
    }
}