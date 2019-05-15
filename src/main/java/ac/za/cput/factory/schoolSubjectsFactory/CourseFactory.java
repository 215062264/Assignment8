package ac.za.cput.factory.schoolSubjectsFactory;

import ac.za.cput.domain.schoolSubjects.Course;

public class CourseFactory {

    public static Course getCourse(String courseName, String courseID) {
        return new Course.Builder()
                .courseId(courseID)
                .courseName(courseName)
                .build();
    }

}
