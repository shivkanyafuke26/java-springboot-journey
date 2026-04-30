class InterThreadCommunicationDemo {

    synchronized void printNumbers() {
        for(int i=1;i<=5;i++) {
            System.out.println(i);
        }
        notify();
    }

    synchronized void printLetters() {
        try { wait(); } catch(Exception e) {}
        for(char c='A';c<='E';c++) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        InterThreadCommunicationDemo obj = new InterThreadCommunicationDemo();

        Thread t1 = new Thread(() -> obj.printNumbers());
        Thread t2 = new Thread(() -> obj.printLetters());

        t2.start();
        t1.start();
    }
}