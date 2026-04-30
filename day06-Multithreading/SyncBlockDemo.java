class SyncBlockDemo {
    int count = 0;

    void increment() {
        synchronized(this) {
            count++;
        }
    }

    public static void main(String[] args) throws Exception {
        SyncBlockDemo obj = new SyncBlockDemo();

        Thread t1 = new Thread(() -> {
            for(int i=0;i<1000;i++) obj.increment();
        });

        Thread t2 = new Thread(() -> {
            for(int i=0;i<1000;i++) obj.increment();
        });

        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println(obj.count);
    }
}