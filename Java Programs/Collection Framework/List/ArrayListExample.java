// Display
// initl size 10
// non synchronised or thread unsafe
// increase size by 1.5x

// Vector : all same, but size increase 2x


import java.util.ArrayList; // Import the standard ArrayList

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        
        System.out.println("Initial Capacity : "+al.size());  // itnit capacity 0

        al.add(null);       // null allows
        al.add(10);
        al.add(true);
        al.add(false);
        al.add('A');    // Heterogenious
        al.add(10);     // Duplicate allows

        System.out.println(al);
        System.out.println(al.size());
        al.addFirst(50);
        System.out.println("Contains : "+al.contains('A'));
        System.out.println(al);
    }
}