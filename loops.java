import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // for loop
        
        for(int i = 100; i>0; i--){
            System.out.println(i);
        }

        // while loop

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int i = sc.nextInt();
            while(i<100){
                i++;
                System.out.println(i);
            }
        }

    }

    public static class math {
        public static void main(String[] args) {
            // loops.math

             System.out.println((int)(Math.random() * 100));
        }
    }
}