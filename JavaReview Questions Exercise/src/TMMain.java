import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class TMMain {
    public static void main(String[] args) throws Exception { // throws MalformedURLException e throws java.IOException e
        URL url = new URL("http://faculty.seattlecentral.edu/flepeint/java143/ClassExamples/JavaReview.txt");
        InputStream in = url.openStream();
        Scanner scan = new Scanner(in);
        TMCourse course = TMCourse.readCourse(scan);
        System.out.println(course);
        scan.close();
    }
}
