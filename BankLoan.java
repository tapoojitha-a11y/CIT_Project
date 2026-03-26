import java.util.Scanner;

public class BankLoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        int sal;
        System.out.println("Enter the age of the person");
        age = sc.nextInt();
        System.out.println("Enter the salary of the user");
        sal = sc.nextInt();
        if (age >= 21 && sal >= 21000)
            System.out.println("Eligible to get the loan");
        else
            System.out.println("Not eligible ");
        sc.close();

    }
}
