// Insertion and Deletion
// init size 0
// non synchronised or thread unsafe




import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        
        System.out.println("Initial Capacity : "+l.size());  // itnit capacity 0

        l.add(null);       // null allows
        l.add(10);
        l.add(true);
        l.add(false);
        l.add('A');    // Heterogenious
        l.add(10);     // Duplicate allows

        System.out.println(l);
        System.out.println(l.size());
        l.addFirst(50);
        System.out.println("Contains : "+l.contains('A'));
        System.out.println(l);
    }
}
