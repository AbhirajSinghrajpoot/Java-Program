import java.util.Scanner;
// public class array {
    
//     public static void main(String[] args) {

//         int[] marks = { 10, 20, 30, 40, 50 };
//         int[][] finalMarks = {{10, 20, 30, 40, 50}, {60, 70, 80, 90, 100}};
        
//         System.out.println(finalMarks[1][3]);


        // System.out.println("Hello, World!");

        // array
        // int[] arr = new int[5];
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // arr[3] = 4;
        // arr[4] = 5;

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        // array of strings
        // String[] names = new String[5];
        // names[0] = "john";
        // names[1] = "doe";
        // names[2] = "jane";
        // names[3] = "smith";
        // names[4] = "johnson";

        // for (int i = 0; i < names.length; i++) {
        //     System.out.println(names[i]);
        // }
    //}
    class array{
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of students: ");
            int n = sc.nextInt();
            int[] arry = new int[n];
            for(int i = 0; i < n; i++) {
                arry[i] = sc.nextInt();
            }
            for (int j= 0; j < n; j++) {
                System.out.println(arry[j]);
            }
        }
    }


