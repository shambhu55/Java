// No duplicate, one null value, heterogeneous, ## Maintain Order
// Non Synchronized
// java 1.4
// internally uses LinkedList + Hash table
// init capacity 16, 
// increase by 2x, with LF .75
// to search and maintain order


import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet s = new LinkedHashSet();

        System.out.println(s.size());

        s.add(10);
        s.add(10);
        s.add("Hello");
        s.add(false);
        s.add(null);
        s.add('A');
        s.add(55);
        
        System.out.println(s.hashCode());
        System.out.println(s.remove(55));
        System.out.println(s.getFirst());
        System.out.println(s.getLast());
        System.out.println(s);
    }
}
