// java.util.Concurrent package
// no null, ordered, heterogeneous, duplicated
// synchronized, Bounded
// FIFO order
// Wifi, limited login devices
// java 1.5v
// to solve producer and consumer problem


import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueExample {
    public static void main(String[] args) {
        ArrayBlockingQueue q = new ArrayBlockingQueue(5);

        q.add(1);
        q.add(1);
        q.add("a");
        q.add(true);
        q.add("Array");

        

        System.out.println("\n"+q);
    }
}
