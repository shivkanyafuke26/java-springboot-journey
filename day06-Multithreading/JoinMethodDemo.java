class JoinMethodDemo extends Thread {
    public void run() {
        for(int i=1;i<=3;i++) {
            System.out.println("Child: " + i);
        }
    }

    public static void main(String[] args) throws Exception {
        JoinMethodDemo t = new JoinMethodDemo();
        t.start();
        t.join();
        System.out.println("Main thread finished");
    }
}