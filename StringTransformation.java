import java.util.*;

public class StringTransformation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNext()) {
            sc.close();
            return;
        }
        
        String sInput = sc.next();
        String tInput = sc.next();
        
        char[] S = sInput.toCharArray();
        char[] T = tInput.toCharArray();
        
        int len = S.length;
        int M = 0;
        
        for (int i = 0; i < len; i++) {
            if (S[i] != T[i]) {
                M++;
            }
        }
        
        System.out.println(M);
        
        for (int step = 0; step < M; step++) {
            boolean changed = false;
            
            for (int i = 0; i < len; i++) {
                if (S[i] > T[i]) {
                    S[i] = T[i];
                    System.out.println(new String(S));
                    changed = true;
                    break;
                }
            }
            
            if (!changed) {
                for (int i = len - 1; i >= 0; i--) {
                    if (S[i] < T[i]) {
                        S[i] = T[i];
                        System.out.println(new String(S));
                        break;
                    }
                }
            }
        }
        
        sc.close();
    }
}