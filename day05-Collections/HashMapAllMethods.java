import java.util.*;

public class HashMapAllMethods {
    public static void main(String[] args) {

        // Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // put()
        map.put(101, "Java");
        map.put(102, "Python");
        map.put(103, "C++");
        System.out.println("put(): " + map);

        // putIfAbsent()
        map.putIfAbsent(104, "Spring");
        map.putIfAbsent(101, "HTML");
        System.out.println("putIfAbsent(): " + map);

        // get()
        System.out.println("get(102): " + map.get(102));

        // getOrDefault()
        System.out.println("getOrDefault(105): "
                + map.getOrDefault(105, "Not Found"));

        // containsKey()
        System.out.println("containsKey(101): "
                + map.containsKey(101));

        // containsValue()
        System.out.println("containsValue(Java): "
                + map.containsValue("Java"));

        // size()
        System.out.println("size(): " + map.size());

        // isEmpty()
        System.out.println("isEmpty(): " + map.isEmpty());

        // keySet()
        System.out.println("keySet(): " + map.keySet());

        // values()
        System.out.println("values(): " + map.values());

        // entrySet()
        System.out.println("entrySet(): " + map.entrySet());

        // replace(key,value)
        map.replace(103, "React");
        System.out.println("replace(): " + map);

        // replace(key,old,new)
        map.replace(102, "Python", "NodeJS");
        System.out.println("replace(old,new): " + map);

        // remove(key)
        map.remove(104);
        System.out.println("remove(key): " + map);

        // remove(key,value)
        map.remove(103, "React");
        System.out.println("remove(key,value): " + map);

        // putAll()
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(201, "SQL");
        map2.put(202, "MongoDB");

        map.putAll(map2);
        System.out.println("putAll(): " + map);

        // forEach()
        System.out.println("forEach():");
        map.forEach((k, v) -> System.out.println(k + " = " + v));

        // clone()
        HashMap<Integer, String> copy =
                (HashMap<Integer, String>) map.clone();
        System.out.println("clone(): " + copy);

        // equals()
        System.out.println("equals(copy): " + map.equals(copy));

        // hashCode()
        System.out.println("hashCode(): " + map.hashCode());

        // clear()
        map.clear();
        System.out.println("clear(): " + map);

        // isEmpty after clear
        System.out.println("isEmpty(): " + map.isEmpty());
    }
}