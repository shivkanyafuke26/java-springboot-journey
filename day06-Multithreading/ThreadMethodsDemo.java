class ThreadMethodsDemo extends Thread {
    public void run() {
        for(int i=1;i<=3;i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            try { Thread.sleep(500); } catch(Exception e) {}
        }
    }

    public static void main(String[] args) {
        ThreadMethodsDemo t = new ThreadMethodsDemo();
        t.setName("MyThread");
        t.start();
    }
}