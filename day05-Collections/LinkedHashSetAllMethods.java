import java.util.*;

public class LinkedHashSetAllMethods {
    public static void main(String[] args) {

        // Create LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // add()
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // duplicate ignored
        System.out.println("add(): " + set);

        // addAll()
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Spring");
        set2.add("HTML");

        set.addAll(set2);
        System.out.println("addAll(): " + set);

        // contains()
        System.out.println("contains(Java): " + set.contains("Java"));

        // size()
        System.out.println("size(): " + set.size());

        // isEmpty()
        System.out.println("isEmpty(): " + set.isEmpty());

        // remove()
        set.remove("Python");
        System.out.println("remove(Python): " + set);

        // removeAll()
        set.removeAll(set2);
        System.out.println("removeAll(): " + set);

        // add again
        set.add("SQL");
        set.add("React");

        // Iterator
        System.out.println("Iterator:");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // For-each
        System.out.println("For-each:");
        for (String s : set) {
            System.out.println(s);
        }

        // clone()
        LinkedHashSet<String> copy =
                (LinkedHashSet<String>) set.clone();
        System.out.println("clone(): " + copy);

        // toArray()
        Object arr[] = set.toArray();
        System.out.println("toArray():");
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // retainAll()
        LinkedHashSet<String> set3 = new LinkedHashSet<>();
        set3.add("Java");
        set3.add("SQL");

        set.retainAll(set3);
        System.out.println("retainAll(): " + set);

        // equals()
        System.out.println("equals(copy): " + set.equals(copy));

        // hashCode()
        System.out.println("hashCode(): " + set.hashCode());

        // clear()
        set.clear();
        System.out.println("clear(): " + set);

        // isEmpty after clear
        System.out.println("isEmpty(): " + set.isEmpty());
    }
}