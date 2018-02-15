import java.io.*;

public class UsingFiles {
    public static void main(String[] args) {
        File source = new File("iconjava.gif");
        File sink = new File("copy.gif");
        copy(source, sink);

        try {
            File sink2 = new File("copy2.gif");
            copyWithArray(source, sink2);
        } catch (IOException e) {
            // TODO: FINISH FROM NOTES
        }
    }

    /**
     * Copies a source file to a sink file
     */
    public static void copy(File source, File sink) {
        // Open the streams
        InputStream in;
        try {
            in = new FileInputStream(source);
        } catch (FileNotFoundException e) {
            System.out.println(source.getName() + " doesn't seem to exist!");
            return;
        }

        OutputStream out;
        try {
            out = new FileOutputStream(source);
        } catch (FileNotFoundException e) {
            System.out.println(sink.getName() + " doesn't seem to exist!");
            return;
        }

        // read from the input stream and copy to the output stream
        int data;
        try {
            while ((data = in.read()) != -1) {
                out.write(data);
            }
        } catch (IOException e) {
            System.out.println("Couldn't do the copy!");
        }

        try {
            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println("Couldn't close the input and/or output streams!");
        }
        System.out.println(source.getName() + " has been copied to " + sink.getName());
    }

    public static void copyWithArray(File source, File sink) throws IOException {
        InputStream in = new FileInputStream(source);
        OutputStream out = new FileOutputStream(sink);

        byte[] data = new byte[512];
        // read returns the number of bytes read
        int nRead;
        while ((nRead = in.read(data)) != -1) {
            out.write(data, 0, nRead);
        }

        in.close();
        out.close();
    }
}
