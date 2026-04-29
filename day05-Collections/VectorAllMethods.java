import java.util.*;

public class VectorAllMethods {
    public static void main(String[] args) {

        // Create Vector
        Vector<String> v = new Vector<>();

        // add()
        v.add("Java");
        v.add("Python");
        v.add("C++");
        System.out.println("add(): " + v);

        // addElement()
        v.addElement("Spring");
        System.out.println("addElement(): " + v);

        // insertElementAt()
        v.insertElementAt("HTML", 1);
        System.out.println("insertElementAt(): " + v);

        // add(index, element)
        v.add(2, "CSS");
        System.out.println("add(index,element): " + v);

        // get()
        System.out.println("get(2): " + v.get(2));

        // firstElement()
        System.out.println("firstElement(): " + v.firstElement());

        // lastElement()
        System.out.println("lastElement(): " + v.lastElement());

        // set()
        v.set(1, "Java Core");
        System.out.println("set(): " + v);

        // setElementAt()
        v.setElementAt("React", 2);
        System.out.println("setElementAt(): " + v);

        // capacity()
        System.out.println("capacity(): " + v.capacity());

        // size()
        System.out.println("size(): " + v.size());

        // contains()
        System.out.println("contains(Java): " + v.contains("Java"));

        // indexOf()
        System.out.println("indexOf(Java): " + v.indexOf("Java"));

        // lastIndexOf()
        v.add("Java");
        System.out.println("lastIndexOf(Java): " + v.lastIndexOf("Java"));

        // remove(index)
        v.remove(1);
        System.out.println("remove(index): " + v);

        // remove(object)
        v.remove("React");
        System.out.println("remove(object): " + v);

        // removeElement()
        v.removeElement("Java");
        System.out.println("removeElement(): " + v);

        // removeElementAt()
        v.removeElementAt(1);
        System.out.println("removeElementAt(): " + v);

        // copyInto()
        Object arr[] = new Object[v.size()];
        v.copyInto(arr);
        System.out.println("copyInto():");
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // trimToSize()
        v.trimToSize();

        // ensureCapacity()
        v.ensureCapacity(10);

        // Enumeration
        System.out.println("Enumeration:");
        Enumeration<String> e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        // Iterator
        System.out.println("Iterator:");
        Iterator<String> it = v.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // clone()
        Vector<String> copy = (Vector<String>) v.clone();
        System.out.println("clone(): " + copy);

        // clear()
        v.clear();
        System.out.println("clear(): " + v);

        // isEmpty()
        System.out.println("isEmpty(): " + v.isEmpty());
    }
}