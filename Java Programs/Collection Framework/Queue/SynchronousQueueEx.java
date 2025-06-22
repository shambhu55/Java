import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueEx {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();

        // Producer
        Thread producer = new Thread(() -> {
            try {
                System.out.println("Putting 10");
                queue.put(10); // waits for consumer
                System.out.println("10 has been taken by consumer");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer
        Thread consumer = new Thread(() -> {
            try {
                Thread.sleep(3000); // wait before consuming
                int value = queue.take();
                System.out.println("Consumed: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
