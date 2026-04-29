import java.util.*;

public class ArrayDequeAllMethods {
    public static void main(String[] args) {

        // Create ArrayDeque
        ArrayDeque<String> dq = new ArrayDeque<>();

        // add()
        dq.add("Java");
        dq.add("Python");
        dq.add("C++");
        System.out.println("add(): " + dq);

        // addFirst()
        dq.addFirst("HTML");
        System.out.println("addFirst(): " + dq);

        // addLast()
        dq.addLast("Spring");
        System.out.println("addLast(): " + dq);

        // offer()
        dq.offer("SQL");
        System.out.println("offer(): " + dq);

        // offerFirst()
        dq.offerFirst("React");
        System.out.println("offerFirst(): " + dq);

        // offerLast()
        dq.offerLast("NodeJS");
        System.out.println("offerLast(): " + dq);

        // getFirst()
        System.out.println("getFirst(): " + dq.getFirst());

        // getLast()
        System.out.println("getLast(): " + dq.getLast());

        // peek()
        System.out.println("peek(): " + dq.peek());

        // peekFirst()
        System.out.println("peekFirst(): " + dq.peekFirst());

        // peekLast()
        System.out.println("peekLast(): " + dq.peekLast());

        // remove()
        System.out.println("remove(): " + dq.remove());
        System.out.println(dq);

        // removeFirst()
        System.out.println("removeFirst(): " + dq.removeFirst());
        System.out.println(dq);

        // removeLast()
        System.out.println("removeLast(): " + dq.removeLast());
        System.out.println(dq);

        // poll()
        System.out.println("poll(): " + dq.poll());
        System.out.println(dq);

        // pollFirst()
        System.out.println("pollFirst(): " + dq.pollFirst());
        System.out.println(dq);

        // pollLast()
        System.out.println("pollLast(): " + dq.pollLast());
        System.out.println(dq);

        // add again
        dq.add("Java");
        dq.add("Python");
        dq.add("C++");

        // push()
        dq.push("Git");
        System.out.println("push(): " + dq);

        // pop()
        System.out.println("pop(): " + dq.pop());
        System.out.println(dq);

        // contains()
        System.out.println("contains(Java): " + dq.contains("Java"));

        // size()
        System.out.println("size(): " + dq.size());

        // isEmpty()
        System.out.println("isEmpty(): " + dq.isEmpty());

        // iterator()
        System.out.println("Iterator:");
        Iterator<String> it = dq.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // descendingIterator()
        System.out.println("Descending Iterator:");
        Iterator<String> dit = dq.descendingIterator();
        while (dit.hasNext()) {
            System.out.println(dit.next());
        }

        // toArray()
        Object arr[] = dq.toArray();
        System.out.println("toArray():");
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // clear()
        dq.clear();
        System.out.println("clear(): " + dq);

        // isEmpty after clear
        System.out.println("isEmpty(): " + dq.isEmpty());
    }
}