class SynchronizationExample {
    int count = 0;

    synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws Exception {
        SynchronizationExample obj = new SynchronizationExample();

        Thread t1 = new Thread(() -> {
            for(int i=0;i<1000;i++) obj.increment();
        });

        Thread t2 = new Thread(() -> {
            for(int i=0;i<1000;i++) obj.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count: " + obj.count);
    }
}