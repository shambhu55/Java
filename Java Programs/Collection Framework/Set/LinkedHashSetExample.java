// init capasity 16 nd load factor .75
// increase by 2x
// search op


import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet<>();

        set.add(1);
        set.add("HashSetExample");
        set.add(null);
        set.add(null);
        set.add(true);
        set.add("Shambhu");
        set.add("Shambhu");
        set.add(55);
        set.add(11111111);

        System.out.println(set);
    }
}
