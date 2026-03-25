public class UnaryOperator {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Original:" + x);
        System.out.println("Post increment:" + (x++));
        System.out.println("After increment:" + x);// 6
        System.out.println("Pre Increment:" + (++x));
        System.out.println("After pre increment" + x);
        System.out.println("Pre decrement:" + (--x));
        System.out.println("After pre decrement:" + x);

    }

}
