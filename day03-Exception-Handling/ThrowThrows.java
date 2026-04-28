public class ThrowThrows {

    static void checkAge(int age) throws ArithmeticException {

        if (age < 18) {
            throw new ArithmeticException("Not eligible for vote");
        } else {
            System.out.println("Eligible for vote");
        }
    }

    public static void main(String[] args) {

        checkAge(16);
    }
}