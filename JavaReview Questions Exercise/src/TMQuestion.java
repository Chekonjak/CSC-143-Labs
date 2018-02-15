import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TMQuestion {
    // question number
    private int number;
    // text of the question
    // each line is an element of the array
    private String[] text;
    // possible answers
    private Map<String, Integer> answers;

    // private constructor (the client muse use the static factory method (another style: constructor takes Scanner object)
    private TMQuestion() {    }

    /**
     * Creates a question given a Scanner that reads the question file
     * @param scan Scanner object that tells between Strings and Integers (ints?)
     * @return TMQuestion object
     */
    public static TMQuestion readQuestion(Scanner scan) {
        // When there's a constructor in a class, constructor must have same name as class.
        // Can't play with name to explain more of what you're doing. Static constructor (FACTORY METHOD) can be more descriptive HMMMMMMMMMMMM TODO: BRING THIS TO BEAR IN HW4
        TMQuestion q = new TMQuestion();
        q.number = scan.nextInt();
        // skip the new line after the number
        scan.nextLine();
        // text of the question
        ArrayList<String> text = new ArrayList<String>();
        String line;
        while (!(line = scan.nextLine()).trim().equals("-----")) { // Cool, you can assign variables within the conditional statement!
            text.add(line);
        }
        q.text = text.toArray(new String[text.size()]);
        // answers
        q.answers = new HashMap<String, Integer>();

        while (scan.hasNextLine() && (line = scan.nextLine().trim()).length() > 0) {
            String[] parts = line.split(":\\s*"); // split the line on a : followed by 0 or more spaces
            q.answers.put(parts[0], Integer.parseInt(parts[1]));
        }
        return q;

    }

    /**
     * returns the number of this question
     *
     */
    public int getNumber() { return number; }

    /**
     * returns the text of the question
     */
    public String getText() {
        String s = text[0];
        for (int i = 1; i < text.length; i++) {
            s += "\n" + text[i];
        }
        return s;
    }

    /**
     * Returns the full description of the question
     */
    @Override
    public String toString() {
        String s = getNumber() + "\n" + getText() + "\n-----\n";
        for (String ans : answers.keySet()) { // keySet lets you step through the set of keys for the map
            s += ans + ": " + answers.get(ans) + "\n";
        }
        return s;
    }

    /**
     * equals override method
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != this.getClass() ) {
            return false;
        } else {
            TMQuestion question = (TMQuestion)o;
            return (question.number == number && question.text ==text && question.answers == answers); // TODO: DO THIS WITHOUT SIMPLE DOUBLE EQUALS
        }
    }

    /**
     * Returns the next question number or null if there is no such answer
     * @param ans the answer to the question
     */
    public Integer getNextQuestionNumber(String ans) {
        ans = ans.trim().toLowerCase();
        if (answers.containsKey(ans)) {
            return answers.get(ans);
        } else {
            return null;
        }
    }
}
