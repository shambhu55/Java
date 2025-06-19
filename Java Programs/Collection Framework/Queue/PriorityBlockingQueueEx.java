// No null, duplicated, homogeneous, no order
// Synchronized
// fifo order based on priority, and to solve C-P problem
// init capacity (2^31)-1, increase by 2x
// java 1.5
// broadcasting, 


import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueEx {
    public static void main(String[] args) {
        PriorityBlockingQueue q = new PriorityBlockingQueue<>();
        q.add(10);
        q.add(5);
        q.add(5);
        System.out.println(q);
    }
}
