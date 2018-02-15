import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Representation of a course made of questions
 * @author CSC 143
 */
public class TMCourse {
    private String title;
    private SortedMap<Integer, TMQuestion> questions =
            new TreeMap<Integer, TMQuestion>();

    // the constructor is off-limits to any client
    private TMCourse() {}

    /**
     * Reads a course given a Scanner to a course file
     */
    public static TMCourse readCourse(Scanner scan) {
        TMCourse course = new TMCourse();
        // title
        course.title = scan.nextLine();
        // questions
        while (scan.hasNextInt()) {
            TMQuestion q = TMQuestion.readQuestion(scan);
            course.questions.put(q.getNumber(), q);
        }
        return course;
    }

    /**
     * Returns the full description of the course
     */
    @Override
    public String toString() {
        String s = title + "\n";
        for (Integer i : questions.keySet()) {
            s += questions.get(i) + "\n";
        }
        return s;
    }

    /**
     * Runs this course
     */
    public void run() {
        Scanner scan = new Scanner(System.in);
        TMQuestion current = questions.get(questions.firstKey());
        do {
            System.out.println(current.getText());
            String answer = scan.nextLine();
            Integer next = current.getNextQuestionNumber(answer);
            if (next != null && next != 0) {
                current = questions.get(next);
            } else if (next == 0) {
                break;
            }
        } while (true);
        scan.close();
    }
}
