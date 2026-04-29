import java.util.*;

public class ArrayListAllMethods {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> list = new ArrayList<>();

        // add()
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("After add(): " + list);

        // add(index, element)
        list.add(1, "Spring");
        System.out.println("After add(index, element): " + list);

        // addAll()
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("HTML");
        list2.add("CSS");

        list.addAll(list2);
        System.out.println("After addAll(): " + list);

        // get()
        System.out.println("get(2): " + list.get(2));

        // set()
        list.set(0, "Java Core");
        System.out.println("After set(): " + list);

        // remove(index)
        list.remove(3);
        System.out.println("After remove(index): " + list);

        // remove(object)
        list.remove("CSS");
        System.out.println("After remove(object): " + list);

        // contains()
        System.out.println("contains(Java Core): " + list.contains("Java Core"));

        // indexOf()
        System.out.println("indexOf(Spring): " + list.indexOf("Spring"));

        // lastIndexOf()
        list.add("Spring");
        System.out.println("lastIndexOf(Spring): " + list.lastIndexOf("Spring"));

        // size()
        System.out.println("size(): " + list.size());

        // isEmpty()
        System.out.println("isEmpty(): " + list.isEmpty());

        // clone()
        ArrayList<String> copy = (ArrayList<String>) list.clone();
        System.out.println("clone(): " + copy);

        // toArray()
        Object arr[] = list.toArray();
        System.out.println("toArray():");
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // sort()
        Collections.sort(list);
        System.out.println("After sort(): " + list);

        // reverse()
        Collections.reverse(list);
        System.out.println("After reverse(): " + list);

        // shuffle()
        Collections.shuffle(list);
        System.out.println("After shuffle(): " + list);

        // ensureCapacity()
        list.ensureCapacity(20);

        // trimToSize()
        list.trimToSize();

        // for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // enhanced for loop
        System.out.println("Using for-each:");
        for (String s : list) {
            System.out.println(s);
        }

        // iterator()
        System.out.println("Using Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // clear()
        list.clear();
        System.out.println("After clear(): " + list);

        // isEmpty after clear
        System.out.println("isEmpty(): " + list.isEmpty());
    }
}