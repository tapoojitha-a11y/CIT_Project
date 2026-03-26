import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        // int age;
        int age = sc.nextInt();
        if (age >= 18) {
            if (age >= 65) {
                System.out.println("Eligible to vote and avail govrernment fund");
            } else
                System.out.println(" Eligible to vote and not eligible to avail government scheme");
        } else
            System.out.println(" Not Eligible to vote and not eligible to avail");
    }
}
