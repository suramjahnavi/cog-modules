public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new MessageThread("Thread 1 Message");
        Thread t2 = new MessageThread("Thread 2 Message");

        t1.start();
        t2.start();
    }
}