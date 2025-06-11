// Insertion and Deletion
// init size 0
// non synchronised or thread unsafe




import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList<>();
        l1.add("shambhu");
        l1.add("shambhu");
        l1.add(true);
        l1.add(null);
        l1.add(5555);
        
        System.out.println(l1);
    }
}
