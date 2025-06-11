// Display
// initl size 10
// non synchronised or thread unsafe
// increase size by 1.5x

// Vector : all same, but size increase 2x





import java.util.ArrayList; // Import the standard ArrayList

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();       // Generic Arraylist: can add only declared dataType... here String
        l1.add("Shambhu");
        l1.add(null);
        l1.add("Mahesh");

        System.out.println("Generic : "+l1);

        for (String s1 : l1) {
            System.out.print(s1+", ");
        }
        System.out.println();



        ArrayList l2 = new ArrayList<>();       // non geneic: can add all datatType elements
        l2.add(1);
        l2.add(true);
        l2.add(null);
        l2.add(1);
        System.out.println("Non Generic : "+l2);

        System.out.println(l2.get(0));
    }
}