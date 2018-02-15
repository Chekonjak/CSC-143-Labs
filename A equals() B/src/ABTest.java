public class ABTest {
    public static void main(String[] args) {
        A[] a1 = new A[10], a2 = new A[10], a3 = new A[11];
        for (int i = 1; i <= 10; i++) {
            a1[i-1] = new A(i);
            a2[i-1] = new A(i);
            a3[i-1] = new A(i);
        }
        a3[10] = new A(11);
        B b1 = new B(a1);
        B b2 = new B(a2);
        B b3 = new B(a3);

        // false true true false
        System.out.println("b1.equals(null) is " + b1.equals(null));
        System.out.println("b1.equals(b1) is " + b1.equals(b1));
        System.out.println("b1.equals(b2) is " + b1.equals(b2));
        System.out.println("b1.equals(b3) is " + b1.equals(b3));

        a1[5] = new A(0);
        b1 = new B(a1);
        // false
        System.out.println();
        System.out.println("b1.equals(b2) is " + b1.equals(b2));

    }
}
