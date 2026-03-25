public class TypeCastingOperator {
    public static void main(String[] args) {
        double d = 9.78;
        int num = (int) d;
        System.out.println("Double value before conversion:" + d);
        System.out.println("After explicit type conversion:" + num);
        int i = 5;
        double x = i;
        System.out.println("Before implicit conversion:" + i);
        System.out.println("After Implicit conversion:" + x);

    }
}
