// init capasity 16 nd load factor .75
// increase by 2x
// search op


import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet set = new HashSet<>();

        set.add(1);
        set.add("HashSetExample");
        set.add(null);
        set.add(null);
        set.add(true);
        set.add("Shambhu");
        set.add("Shambhu");
        set.add(55);

        System.out.println(set);
    }
}
