
package pd1_dimbovskis;

/**
 *
 * @author Vadims Dimbovskis
 */
public class Question {
    private String text;
    private String[] answers;
    private int tightAnswer;
    public void Question(String text, String[] answers, int right) {
        
    }
    public String getText() {
        return text;
        
    }
    public String[] getAnswers() {
        return answers;
    }
    public boolean isCorrect(int answer){
        return true;
    }
}
