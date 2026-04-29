import java.util.*;

public class LinkedListAllMethods {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // add()
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("add(): " + list);

        // addFirst()
        list.addFirst("HTML");
        System.out.println("addFirst(): " + list);

        // addLast()
        list.addLast("Spring");
        System.out.println("addLast(): " + list);

        // add(index, element)
        list.add(2, "CSS");
        System.out.println("add(index,element): " + list);

        // addAll()
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("SQL");
        list2.add("React");

        list.addAll(list2);
        System.out.println("addAll(): " + list);

        // get()
        System.out.println("get(2): " + list.get(2));

        // getFirst()
        System.out.println("getFirst(): " + list.getFirst());

        // getLast()
        System.out.println("getLast(): " + list.getLast());

        // set()
        list.set(1, "Java Core");
        System.out.println("set(): " + list);

        // remove()
        list.remove();
        System.out.println("remove(): " + list);

        // remove(index)
        list.remove(2);
        System.out.println("remove(index): " + list);

        // remove(object)
        list.remove("SQL");
        System.out.println("remove(object): " + list);

        // removeFirst()
        list.removeFirst();
        System.out.println("removeFirst(): " + list);

        // removeLast()
        list.removeLast();
        System.out.println("removeLast(): " + list);

        // offer()
        list.offer("NodeJS");
        System.out.println("offer(): " + list);

        // offerFirst()
        list.offerFirst("Angular");
        System.out.println("offerFirst(): " + list);

        // offerLast()
        list.offerLast("MongoDB");
        System.out.println("offerLast(): " + list);

        // peek()
        System.out.println("peek(): " + list.peek());

        // peekFirst()
        System.out.println("peekFirst(): " + list.peekFirst());

        // peekLast()
        System.out.println("peekLast(): " + list.peekLast());

        // poll()
        System.out.println("poll(): " + list.poll());
        System.out.println(list);

        // pollFirst()
        System.out.println("pollFirst(): " + list.pollFirst());
        System.out.println(list);

        // pollLast()
        System.out.println("pollLast(): " + list.pollLast());
        System.out.println(list);

        // push()
        list.push("Git");
        System.out.println("push(): " + list);

        // pop()
        System.out.println("pop(): " + list.pop());
        System.out.println(list);

        // contains()
        System.out.println("contains(Java Core): " + list.contains("Java Core"));

        // indexOf()
        System.out.println("indexOf(Python): " + list.indexOf("Python"));

        // lastIndexOf()
        list.add("Python");
        System.out.println("lastIndexOf(Python): " + list.lastIndexOf("Python"));

        // size()
        System.out.println("size(): " + list.size());

        // isEmpty()
        System.out.println("isEmpty(): " + list.isEmpty());

        // clone()
        LinkedList<String> copy = (LinkedList<String>) list.clone();
        System.out.println("clone(): " + copy);

        // sort()
        Collections.sort(list);
        System.out.println("sort(): " + list);

        // reverse()
        Collections.reverse(list);
        System.out.println("reverse(): " + list);

        // iterator()
        System.out.println("Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // descendingIterator()
        System.out.println("descendingIterator:");
        Iterator<String> dit = list.descendingIterator();
        while (dit.hasNext()) {
            System.out.println(dit.next());
        }

        // clear()
        list.clear();
        System.out.println("clear(): " + list);

        // isEmpty after clear
        System.out.println("isEmpty(): " + list.isEmpty());
    }
}