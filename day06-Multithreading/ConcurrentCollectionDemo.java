import java.util.concurrent.ConcurrentHashMap;

class ConcurrentCollectionDemo {
    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1, "A");
        map.put(2, "B");

        map.forEach((k,v) -> System.out.println(k + " " + v));
    }
}