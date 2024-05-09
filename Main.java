 
public class Main {
    public static void main(String[] args) {
        Question question = new Question("Question example");
        try {
            question.saisirScore();
           
        } catch (InvalidScoreException e) {
            System.out.println("Invalid score: " + e.getMessage());
        }
    }
}

