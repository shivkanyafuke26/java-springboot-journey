class ThreadCreationUsingThread extends Thread {
    public void run() {
        System.out.println("Thread using Thread class");
    }

    public static void main(String[] args) {
        ThreadCreationUsingThread t = new ThreadCreationUsingThread();
        t.start();
    }
}