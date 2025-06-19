// to represent obj in fifo order on basis of Priority
// no duplicate, maintain order, no null, Homogeneous
// non synchronized
// default 11 element
// increases with 2x
// java 1.5



import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue q = new PriorityQueue();
        System.out.println(q.size());
        q.add(1);

        System.out.println(q);
    }
}


