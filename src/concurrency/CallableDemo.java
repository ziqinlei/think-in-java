package concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author Leiziqin
 * @since 2018/6/5
 */
class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() {
        return "result of TaskWithResult " + id;
    }
}

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        List<Future<String>> results = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            results.add(exec.submit(new TaskWithResult(i)));
        }
        for (Future<String> fs : results) {
            try {
                System.out.println(fs.get());
            } catch (InterruptedException | ExecutionException e) {
                System.out.println(e.getMessage());
            } finally {
                exec.shutdown();
            }
        }
    }
}