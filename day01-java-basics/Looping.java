public class Looping {

    public static void main(String[] args) {

        // Left Increasing Triangle
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Left Decreasing Triangle
        for (int i = 8; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Right Increasing Triangle
        for (int i = 1; i <= 8; i++) {

            for (int j = 1; j <= 8 - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();

        // Right Decreasing Triangle
        for (int i = 8; i >= 1; i--) {

            for (int j = 1; j <= 8 - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}