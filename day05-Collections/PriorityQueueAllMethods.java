import java.util.*;

public class PriorityQueueAllMethods {
    public static void main(String[] args) {

        // Create PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // add()
        pq.add(50);
        pq.add(20);
        pq.add(10);
        pq.add(40);
        pq.add(30);
        System.out.println("add(): " + pq);

        // offer()
        pq.offer(60);
        pq.offer(70);
        System.out.println("offer(): " + pq);

        // peek()
        System.out.println("peek(): " + pq.peek());

        // element()
        System.out.println("element(): " + pq.element());

        // size()
        System.out.println("size(): " + pq.size());

        // isEmpty()
        System.out.println("isEmpty(): " + pq.isEmpty());

        // contains()
        System.out.println("contains(40): " + pq.contains(40));

        // iterator()
        System.out.println("Iterator:");
        Iterator<Integer> it = pq.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // poll()
        System.out.println("poll(): " + pq.poll());
        System.out.println("After poll(): " + pq);

        // remove()
        System.out.println("remove(): " + pq.remove());
        System.out.println("After remove(): " + pq);

        // remove(object)
        pq.remove(40);
        System.out.println("remove(40): " + pq);

        // addAll()
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.add(5);
        pq2.add(15);

        pq.addAll(pq2);
        System.out.println("addAll(): " + pq);

        // toArray()
        Object arr[] = pq.toArray();
        System.out.println("toArray():");
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // clear()
        pq.clear();
        System.out.println("clear(): " + pq);

        // isEmpty after clear
        System.out.println("isEmpty(): " + pq.isEmpty());
    }
}