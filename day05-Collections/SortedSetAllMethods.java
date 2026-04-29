import java.util.*;

public class SortedSetAllMethods {
    public static void main(String[] args) {

        // Create SortedSet using TreeSet
        SortedSet<Integer> set = new TreeSet<>();

        // add()
        set.add(50);
        set.add(20);
        set.add(10);
        set.add(40);
        set.add(30);
        set.add(20);   // duplicate ignored
        System.out.println("add(): " + set);

        // addAll()
        SortedSet<Integer> set2 = new TreeSet<>();
        set2.add(60);
        set2.add(70);

        set.addAll(set2);
        System.out.println("addAll(): " + set);

        // first()
        System.out.println("first(): " + set.first());

        // last()
        System.out.println("last(): " + set.last());

        // contains()
        System.out.println("contains(30): " + set.contains(30));

        // size()
        System.out.println("size(): " + set.size());

        // isEmpty()
        System.out.println("isEmpty(): " + set.isEmpty());

        // remove()
        set.remove(40);
        System.out.println("remove(40): " + set);

        // iterator()
        System.out.println("Iterator:");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // headSet()
        System.out.println("headSet(50): " + set.headSet(50));

        // tailSet()
        System.out.println("tailSet(30): " + set.tailSet(30));

        // subSet(from,to)
        System.out.println("subSet(20,60): " + set.subSet(20, 60));

        // comparator()
        System.out.println("comparator(): " + set.comparator()); // null = natural sorting

        // toArray()
        Object arr[] = set.toArray();
        System.out.println("toArray():");
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // equals()
        System.out.println("equals(set2): " + set.equals(set2));

        // hashCode()
        System.out.println("hashCode(): " + set.hashCode());

        // clear()
        set.clear();
        System.out.println("clear(): " + set);

        // isEmpty after clear
        System.out.println("isEmpty(): " + set.isEmpty());
    }
}