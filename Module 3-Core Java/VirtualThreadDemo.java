public class VirtualThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            System.out.println("Running in thread: " + Thread.currentThread());
        };

        for (int i = 0; i < 5; i++) {
            Thread.startVirtualThread(task);
        }

        // Give threads time to run before main thread exits
        Thread.sleep(1000);
    }
}