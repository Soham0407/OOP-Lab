public class QuizGrader {

    enum Result {
        CORRECT,
        WRONG,
        UNANSWERED
    }

    public static void main(String[] args) {
        char[] correctAnswers = { 'C', 'A', 'B', 'D', 'B', 'C', 'A', 'A' };

        char[] submittedAnswers = new char[8];

        if (args.length != 8) {
            System.out.println("Please provide exactly 8 answers.");
            return;
        }

        for (int i = 0; i < args.length; i++) {
            submittedAnswers[i] = args[i].charAt(0);
        }

        int correctCount = 0;
        int wrongCount = 0;
        int unansweredCount = 0;

        System.out.println("QUESTION\tSUBMITTED ANS\tCORRECT ANS\tRESULT");

        for (int i = 0; i < correctAnswers.length; i++) {
            char submittedAnswer = submittedAnswers[i];
            char correctAnswer = correctAnswers[i];
            Result result;

            if (submittedAnswer == 'X') {
                result = Result.UNANSWERED;
                unansweredCount++;
            } else if (submittedAnswer == correctAnswer) {
                result = Result.CORRECT;
                correctCount++;
            } else {
                result = Result.WRONG;
                wrongCount++;
            }

            System.out.printf("%d\t\t%c\t\t%c\t\t%s\n", i + 1, submittedAnswer, correctAnswer, result);
        }

        System.out.println("\nNo. of correct answers: " + correctCount);
        System.out.println("No. of wrong answers: " + wrongCount);
        System.out.println("No. of unanswered questions: " + unansweredCount);
    }
}
