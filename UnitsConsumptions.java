import java.util.Scanner;

public class UnitsConsumptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units;
        double bill;
        System.out.println("Enter the units from the user");
        units = sc.nextInt();
        if (units <= 150)
            bill = units * 1.5;
        else
            bill = units * 3;
        System.out.println("Final electricity bill=" + bill);
        sc.close();

    }
}
