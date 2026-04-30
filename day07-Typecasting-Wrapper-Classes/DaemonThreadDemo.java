class DaemonThreadDemo {
    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            while(true) {
                System.out.println("Running...");
            }
        });

        t.setDaemon(true);
        t.start();

        System.out.println("Main thread ends");
    }
}