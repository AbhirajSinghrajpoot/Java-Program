import java.util.*;

public class ElementMixing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Agar input khali ho toh handle karne ke liye
        if (!sc.hasNextInt()) return; 
        
        int n = sc.nextInt();
        
        // 1-based indexing ke liye n+1 size ki matrix banayenge
        int[][] A = new int[n + 1][n + 1];
        
        // Input read karke lower triangular matrix fill karna
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        
        // Initial element 1 se start karte hain
        int ans = 1;
        
        // 1 se N tak saare elements ke sath combine karna
        for (int i = 1; i <= n; i++) {
            int row = Math.max(ans, i);
            int col = Math.min(ans, i);
            ans = A[row][col]; // Result ko update kar diya
        }
        
        // Final element print karna
        System.out.println(ans);
        
        sc.close();
    }
}