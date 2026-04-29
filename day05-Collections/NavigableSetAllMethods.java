import java.util.*;

public class NavigableSetAllMethods {
    public static void main(String[] args) {

        // Create NavigableSet using TreeSet
        NavigableSet<Integer> set = new TreeSet<>();

        // add()
        set.add(50);
        set.add(20);
        set.add(10);
        set.add(40);
        set.add(30);
        set.add(60);
        set.add(70);
        System.out.println("add(): " + set);

        // first()
        System.out.println("first(): " + set.first());

        // last()
        System.out.println("last(): " + set.last());

        // lower()
        System.out.println("lower(30): " + set.lower(30));

        // floor()
        System.out.println("floor(35): " + set.floor(35));

        // higher()
        System.out.println("higher(30): " + set.higher(30));

        // ceiling()
        System.out.println("ceiling(35): " + set.ceiling(35));

        // pollFirst()
        System.out.println("pollFirst(): " + set.pollFirst());
        System.out.println(set);

        // pollLast()
        System.out.println("pollLast(): " + set.pollLast());
        System.out.println(set);

        // contains()
        System.out.println("contains(40): " + set.contains(40));

        // size()
        System.out.println("size(): " + set.size());

        // isEmpty()
        System.out.println("isEmpty(): " + set.isEmpty());

        // headSet(element, inclusive)
        System.out.println("headSet(50,true): " + set.headSet(50, true));

        // tailSet(element, inclusive)
        System.out.println("tailSet(30,true): " + set.tailSet(30, true));

        // subSet(from,true,to,false)
        System.out.println("subSet(20,true,60,false): "
                + set.subSet(20, true, 60, false));

        // descendingSet()
        System.out.println("descendingSet(): " + set.descendingSet());

        // iterator()
        System.out.println("Iterator:");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // descendingIterator()
        System.out.println("Descending Iterator:");
        Iterator<Integer> dit = set.descendingIterator();
        while (dit.hasNext()) {
            System.out.println(dit.next());
        }

        // remove()
        set.remove(40);
        System.out.println("remove(40): " + set);

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