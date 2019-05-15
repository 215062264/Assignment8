package ac.za.cput.factoryTest.schoolSubjectsFactoryTest;

import ac.za.cput.domain.schoolSubjects.Course;
import ac.za.cput.factory.schoolSubjectsFactory.CourseFactory;
import org.junit.Assert;
import org.junit.Test;

public class CourseFactoryTest {

    @Test
    public void getCourse() {

        String name = "Diploma in Information & Communication Technology";
        String id = "DIP ICT";

        Course c = CourseFactory.getCourse(name,id);
        System.out.println(c);
        Assert.assertNotNull(c.getCourseId()+"\n"+c.getCourseName());
    }

}
