import java.util.*;

public class StackAllMethods {
    public static void main(String[] args) {

        // Create Stack
        Stack<String> stack = new Stack<>();

        // push()
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        System.out.println("push(): " + stack);

        // add()
        stack.add("Spring");
        System.out.println("add(): " + stack);

        // peek()
        System.out.println("peek(): " + stack.peek());

        // pop()
        System.out.println("pop(): " + stack.pop());
        System.out.println("After pop(): " + stack);

        // search()
        System.out.println("search(Python): " + stack.search("Python"));

        // get()
        System.out.println("get(1): " + stack.get(1));

        // set()
        stack.set(1, "Java Core");
        System.out.println("set(): " + stack);

        // firstElement()
        System.out.println("firstElement(): " + stack.firstElement());

        // lastElement()
        System.out.println("lastElement(): " + stack.lastElement());

        // contains()
        System.out.println("contains(Java): " + stack.contains("Java"));

        // indexOf()
        System.out.println("indexOf(Java): " + stack.indexOf("Java"));

        // lastIndexOf()
        stack.push("Java");
        System.out.println("lastIndexOf(Java): " + stack.lastIndexOf("Java"));

        // size()
        System.out.println("size(): " + stack.size());

        // isEmpty()
        System.out.println("isEmpty(): " + stack.isEmpty());

        // clone()
        Stack<String> copy = (Stack<String>) stack.clone();
        System.out.println("clone(): " + copy);

        // iterator()
        System.out.println("Iterator:");
        Iterator<String> it = stack.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // for-each loop
        System.out.println("For-each:");
        for (String s : stack) {
            System.out.println(s);
        }

        // remove(index)
        stack.remove(1);
        System.out.println("remove(index): " + stack);

        // remove(object)
        stack.remove("Java");
        System.out.println("remove(object): " + stack);

        // clear()
        stack.clear();
        System.out.println("clear(): " + stack);

        // isEmpty after clear
        System.out.println("isEmpty(): " + stack.isEmpty());
    }
}