enum Result {
    CORRECT,
    WRONG,
    NOT_ANSWERED
}

public class QuizGrader {

    public static void main(String[] args) {

        // Correct answers
        char[] correctAnswers = { 'C', 'A', 'B', 'D' };

        if (args.length != 4) {
            System.out.println("Please provide exactly 4 answers");
            return;
        }

        int correctCount = 0;
        int wrongCount = 0;
        int notAnsweredCount = 0;

        System.out.println("QUESTION\tSUBMITTED\tCORRECT\t\tRESULT");

        for (int i = 0; i < correctAnswers.length; i++) {

            char submitted = args[i].toUpperCase().charAt(0);
            Result result;

            if (submitted == 'X') {
                result = Result.NOT_ANSWERED;
                notAnsweredCount++;
            } 
            else if (submitted == correctAnswers[i]) {
                result = Result.CORRECT;
                correctCount++;
            } 
            else {
                result = Result.WRONG;
                wrongCount++;
            }

            System.out.println((i + 1) + "\t\t" + submitted + "\t\t" + correctAnswers[i] + "\t\t" + result);
        }

        System.out.println("\nNo. of correct answers: " + correctCount);
        System.out.println("No. of wrong answers: " + wrongCount);
        System.out.println("No. of not answered: " + notAnsweredCount);

        if (correctCount >= 2) {
            System.out.println("The candidate passed.");
        } else {
            System.out.println("The candidate failed.");
        }
    }
}