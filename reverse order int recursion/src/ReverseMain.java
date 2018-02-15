public class ReverseMain {
    public static void main(String[] args) {
//
        int testNo = 123000;
        System.out.println("Reverse result for " + testNo + " is:");
        reverse(testNo);
    }

//    /**
//     *
//     * @param n integer to be reversed with leading zeros
//     */
//    public static int reverseMax(int n) { // Keep discarding inputs until a non-zero number is found
//        if (n < 10) {
////            System.out.println(n);
//            return n;
//        } else {
//            return n % 10 * (int) Math.pow(10, (int) Math.log10(n)) + reverse(n / 10);
////            System.out.print("a");
////            System.out.print(n % 10);
////            System.out.print("b");
////            reverse(n / 10);
//        }
//    }

    public static void reverse(int n) {
        printReverse(n, false);
    }
    /**
     *
     */
    public static void printReverse(int n, boolean print) {
        if (n < 10) {
            System.out.print(n);
        } else {
            int digit = n % 10;
            if (digit > 0 || print) {
                System.out.print(digit);
            }
            printReverse(n / 10, print || digit > 0);
        }
    }

    /**
     *
     * @param n integer to be reversed without leading zeros
     * @return whether or not there are leading zeros
     */
    public static void reverseWithLeadingZeros(int n) {
        if (n < 10) {
            System.out.print(n);
        } else {
            System.out.print(n % 10);
            reverse(n/10);
        }

    }
}
