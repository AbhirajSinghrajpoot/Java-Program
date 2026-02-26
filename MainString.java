
import java.util.ArrayList;

public class MainString {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(1, 20);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(16));
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    
}
