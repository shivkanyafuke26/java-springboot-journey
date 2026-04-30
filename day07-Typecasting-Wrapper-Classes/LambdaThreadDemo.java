class LambdaThreadDemo {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Lambda thread running");
        });
        t.start();
    }
}