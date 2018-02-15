public class bigOh2 {
    public static int n = 100;
    public static void main(String[] args) {

    }
    public static void foo() {
        int sum = 0;
        for (int i = 1; i <= n *2; i++) {
            for (int j = 1; j <= n; j++) { // what if n here is replaced by i?
                sum++;
            }
        }
        for (int j = 1; j < 100; j++) {
            sum++;
            sum++;
        }
    }
    public static void bar() {
        int sum = 0;
        for (int j = 1; j < n; j++) {
            sum++;
            if (j % 2 == 0) {
                sum++;
            }
        }
    }
    public static void fake() {
        int sum = 0;
        int j = 1;
        while (j <= n) {
            sum++;
            j = j * 2; // if 2 is replaced by n then it takes constant time? TODO: Find out what that is
        }
    }
}
