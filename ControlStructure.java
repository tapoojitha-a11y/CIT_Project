import java.util.Scanner;

public class ControlStructure {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Entrer the age");
        // int age = sc.nextInt();
        // if (age >= 18)
        // System.out.println("Eligible for Voting");
        // else
        // System.out.println("Not Eligible for voting");

        // sc.close();
        // if-else
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b = sc.nextInt();
        if (a > b)
            System.out.println("First number is larger");
        else
            System.out.println("Second number is largest");

    }
}
