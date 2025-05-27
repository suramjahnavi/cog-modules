import java.util.concurrent.*;
import java.util.*;

public class ExecutorCallableDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = Arrays.asList(
            () -> {
                TimeUnit.SECONDS.sleep(1);
                return "Task 1 completed";
            },
            () -> {
                TimeUnit.SECONDS.sleep(2);
                return "Task 2 completed";
            },
            () -> {
                TimeUnit.SECONDS.sleep(3);
                return "Task 3 completed";
            }
        );

        try {
            List<Future<String>> results = executor.invokeAll(tasks);

            for (Future<String> future : results) {
                System.out.println(future.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}