import java.util.*;

public class TreeSetAllMethods {
    public static void main(String[] args) {

        // Create TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // add()
        set.add(50);
        set.add(20);
        set.add(10);
        set.add(40);
        set.add(30);
        set.add(20); // duplicate ignored
        System.out.println("add(): " + set);

        // addAll()
        TreeSet<Integer> set2 = new TreeSet<>();
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

        // higher()
        System.out.println("higher(30): " + set.higher(30));

        // lower()
        System.out.println("lower(30): " + set.lower(30));

        // ceiling()
        System.out.println("ceiling(35): " + set.ceiling(35));

        // floor()
        System.out.println("floor(35): " + set.floor(35));

        // pollFirst()
        System.out.println("pollFirst(): " + set.pollFirst());
        System.out.println(set);

        // pollLast()
        System.out.println("pollLast(): " + set.pollLast());
        System.out.println(set);

        // remove()
        set.remove(40);
        System.out.println("remove(40): " + set);

        // Iterator
        System.out.println("Iterator:");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // descendingIterator()
        System.out.println("descendingIterator:");
        Iterator<Integer> dit = set.descendingIterator();
        while (dit.hasNext()) {
            System.out.println(dit.next());
        }

        // headSet()
        System.out.println("headSet(50): " + set.headSet(50));

        // tailSet()
        System.out.println("tailSet(30): " + set.tailSet(30));

        // subSet()
        System.out.println("subSet(20,60): " + set.subSet(20, 60));

        // clone()
        TreeSet<Integer> copy = (TreeSet<Integer>) set.clone();
        System.out.println("clone(): " + copy);

        // toArray()
        Object arr[] = set.toArray();
        System.out.println("toArray():");
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // clear()
        set.clear();
        System.out.println("clear(): " + set);

        // isEmpty after clear
        System.out.println("isEmpty(): " + set.isEmpty());
    }
}