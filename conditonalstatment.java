import java.util.Scanner;

public class conditonalstatment {
    public static void main(String[] args) {
        boolean isSunUp = true;
        if(isSunUp) {
            System.out.println("Good Morning");
        }
        else {
            System.out.println("Good Night");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(age<18)
        {
            System.out.println("You are a minor.");
        }
        else if(age>=18 && age<60)
        {
            System.out.println("You are an adult.");
        }
        else
        {
            System.out.println("You are a senior citizen.");
        }

        // switch case
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7: ");
        int day = sc1.nextInt();

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}