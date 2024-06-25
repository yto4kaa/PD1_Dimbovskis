package pd1_dimbovskis;

/**
 *
 * @author Vadims Dimbovskis
 */
public class Student extends User {

    private int qestionsCount = 0;
    private int rightAnswers = 0;
    private int totalPoints = 0;
    private int grade = 0;

    public void getAnswer(Question question, int answers) {

    }

    public void clear() {

    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public int getGrade() {
        return grade;
    }
}
