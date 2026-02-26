import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 23);
        map.put(3, 28);
        System.out.println(map);
        System.out.println(map.get(2));
        map.remove(1);
        System.out.println(map);
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue(20));

        
    
    }
}
