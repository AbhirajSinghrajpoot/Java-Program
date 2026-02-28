
import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        // String str = "hello";
        // HashMap<Integer, String> map = new HashMap<>();
        // map.put(1, "l");
        // map.put(2, "h");
        // map.put(3, "e");
        // map.put(4, "l");
        // System.out.println(map);
        // System.out.println(map.get(2));
        // // map.remove(1);
        // System.out.println(map);
        // System.out.println(map.containsKey(3));
        // System.out.println(map.containsValue("java"));
        // System.out.println(Collections.frequency(map.values(), "l"));

        int arrr[] = {1, 2, 3, 4, 5 };
        int target = 6;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arrr.length; i++) {
            int diff = target - arrr[i];
            if (map.containsKey(diff)) {
                System.out.println(map.get(diff) + " " + i);
                return;

            }
            map.put(arrr[i], i);  

        }

        // HashMap<Character, Integer> map = new HashMap<>();
        // for (int i = 0; i <str.length(); i++) {
        //     char ch = str.charAt(i);
        //     map.put(ch, map.getOrDefault(ch, 0) + 1);
        // }  
        // for (char ch : str.toCharArray()) {
        //     if(map.get(ch) == 1) {
        //         System.out.println(ch);
        //         break;
        //     }
        // System.out.println(map);
        // }
    }
}
