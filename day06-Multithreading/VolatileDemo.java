class VolatileDemo {
    static volatile boolean flag = true;

    public static void main(String[] args) {

        new Thread(() -> {
            while(flag) {}
            System.out.println("Stopped");
        }).start();

        new Thread(() -> {
            try { Thread.sleep(1000); } catch(Exception e){}
            flag = false;
        }).start();
    }
}