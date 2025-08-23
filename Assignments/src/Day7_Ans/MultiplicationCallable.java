package Day7_Ans;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiplicationCallable {

    static class MultiplicationTask implements Callable<Integer> {
        private int a, b;

        public MultiplicationTask(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public Integer call() throws Exception {
            Thread.sleep(1000);
            return a * b;
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = new MultiplicationTask(5, 7);

        Future<Integer> futureResult = executor.submit(task);

        try {
            Integer result = futureResult.get();
            System.out.println("multiplication result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}

