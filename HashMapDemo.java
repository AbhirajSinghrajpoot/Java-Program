import java.util.Collections;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        String str = "hello";
        map.put(1, "l");
        map.put(2, "h");
        map.put(3, "e");
        map.put(4, "l");
        System.out.println(map);
        System.out.println(map.get(2));
        // map.remove(1);
        System.out.println(map);
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("java"));
        System.out.println(Collections.frequency(map.values(), "l"));

        
    
    }
}
