import java.io.*;
import java.util.Scanner;

public class StreamsAndRecursion {
    public static void main(String[] args) throws IOException {
        // using scanner
        Scanner scan = new Scanner(new File("./src/TextFile.txt"));
        printEveryOtherInReverse(scan);

        // or using a Reader and Writer
        BufferedReader in = new BufferedReader(new FileReader("./src/StreamsandRecursion.java"));
        PrintWriter out = new PrintWriter(new File("everyOther.java"));
        pEvOtInReToFile(in, out);
        in.close();
        out.close();
    }

    public static void printReverse(Scanner scan) {
        // just reverse order
        if (scan.hasNextLine()) {
            String line = scan.nextLine();
            printReverse(scan);
            System.out.println(line);
        }
    }

    /**
     * Write a method that prints every other line of this file in reverse order
     * use recursion in your solution
     * For example if the file contains One/Two/Three, then print
     * Three/One
     * @param scan
     */
    public static boolean printEveryOtherInReverse(Scanner scan) {

        // From the Scanner class
        // hasNextLine() returns true if there is a line to read
        // hasNextLine() returns the line that was just read


//        String line;
//        if (!scan.hasNextLine()) {
//            System.out.println(line);
//        } else {
//            line = scan.nextLine();
//            printEveryOtherInReverse(scan);
//            System.out.println(line);
//        }
        if (scan.hasNextLine()) {
            String line = scan.nextLine();
            boolean print = printEveryOtherInReverse(scan);
            if (print) {
                System.out.println(line);
            }
            return !print;
        } else {
            return true;
        }
    }

    /**
     * Write a method that prints every other line of this file in reverse order
     * use recursion in your solution
     * For example if the file contains One/Two/Three, then print
     * Three/One
     * @param
     */
    public static boolean pEvOtInReToFile(BufferedReader in, PrintWriter out) throws IOException { // There is also a BufferedWriter, FileWriter, and OutputStreamer
        // From the reader and writer classes
        // readLine() returns null if there is no line to read, or the line if there is a line to read
        String line;
        if ((line = in.readLine()) != null) {
            boolean print = pEvOtInReToFile(in, out);
            if (print) {
                out.println(line);
            }
            return !print;
        } else {
            return true;
        }
    }
}
