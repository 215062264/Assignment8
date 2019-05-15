package ac.za.cput.factory.academicsResultsFactory;

import ac.za.cput.domain.academicResults.Quiz;

public class QuizFactory {

    public static Quiz getQuiz(String dueDate, String studentNum, double mark) {
        return new Quiz.Builder()
                .dueDate(dueDate)
                .studentNum(studentNum)
                .mark(mark)
                .build();
    }

}
