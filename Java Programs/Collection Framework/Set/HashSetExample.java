// no duplicate, no order, one null value, heterogeneous, 
// non-Synchronized
// java 1.2, implemented by set interface
// initial capacity 16 and Load Factor .75
// increase capacity by 2x
// best for serching operation without maintaining order
// internally uses hashtable


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set s = new HashSet();

        System.out.println("Initial cap : "+s.size());
        s.add(10);
        s.add("Hello");
        s.add(true);
        s.add(null);
        s.add(null);
        s.add(10);
        
        System.out.println(s);
        System.out.println("Final cap : "+s.size());
        System.out.println(s.remove(10));
        System.out.println(s.contains("Hello"));
        System.out.println(s.hashCode());
        System.out.println(s.isEmpty());
        System.out.println(s);

        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
