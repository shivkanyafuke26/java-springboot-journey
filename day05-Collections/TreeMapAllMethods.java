import java.util.*;

public class TreeMapAllMethods {
    public static void main(String[] args) {

        // Create TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // put()
        map.put(103, "C++");
        map.put(101, "Java");
        map.put(102, "Python");
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

        // firstKey()
        System.out.println("firstKey(): " + map.firstKey());

        // lastKey()
        System.out.println("lastKey(): " + map.lastKey());

        // firstEntry()
        System.out.println("firstEntry(): " + map.firstEntry());

        // lastEntry()
        System.out.println("lastEntry(): " + map.lastEntry());

        // higherKey()
        System.out.println("higherKey(102): " + map.higherKey(102));

        // lowerKey()
        System.out.println("lowerKey(102): " + map.lowerKey(102));

        // ceilingKey()
        System.out.println("ceilingKey(102): " + map.ceilingKey(102));

        // floorKey()
        System.out.println("floorKey(102): " + map.floorKey(102));

        // containsKey()
        System.out.println("containsKey(101): "
                + map.containsKey(101));

        // containsValue()
        System.out.println("containsValue(Java): "
                + map.containsValue("Java"));

        // size()
        System.out.println("size(): " + map.size());

        // keySet()
        System.out.println("keySet(): " + map.keySet());

        // values()
        System.out.println("values(): " + map.values());

        // entrySet()
        System.out.println("entrySet(): " + map.entrySet());

        // subMap()
        System.out.println("subMap(101,104): "
                + map.subMap(101, 104));

        // headMap()
        System.out.println("headMap(103): "
                + map.headMap(103));

        // tailMap()
        System.out.println("tailMap(102): "
                + map.tailMap(102));

        // replace()
        map.replace(103, "React");
        System.out.println("replace(): " + map);

        // remove()
        map.remove(104);
        System.out.println("remove(104): " + map);

        // pollFirstEntry()
        System.out.println("pollFirstEntry(): "
                + map.pollFirstEntry());
        System.out.println(map);

        // pollLastEntry()
        System.out.println("pollLastEntry(): "
                + map.pollLastEntry());
        System.out.println(map);

        // putAll()
        TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.put(201, "SQL");
        map2.put(202, "MongoDB");

        map.putAll(map2);
        System.out.println("putAll(): " + map);

        // descendingMap()
        System.out.println("descendingMap(): "
                + map.descendingMap());

        // forEach()
        System.out.println("forEach():");
        map.forEach((k, v) ->
                System.out.println(k + " = " + v));

        // clone()
        TreeMap<Integer, String> copy =
                (TreeMap<Integer, String>) map.clone();
        System.out.println("clone(): " + copy);

        // clear()
        map.clear();
        System.out.println("clear(): " + map);

        // isEmpty()
        System.out.println("isEmpty(): " + map.isEmpty());
    }
}