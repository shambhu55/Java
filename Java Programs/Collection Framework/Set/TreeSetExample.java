import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet t = new TreeSet<>();

        System.out.println(t.size());

        t.add(10);
        t.add(20);
        t.add(5);
        t.add(7);

        System.out.println(t.ceiling(10));
        System.out.println(t.getLast());
        System.out.println(t.getFirst());
        System.out.println(t);
    }    
}
