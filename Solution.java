import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();

        if (L == 1 && R == 0) {
            System.out.println("Yes");
        } else if (L == 0 && R == 1) {
            System.out.println("No");
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}