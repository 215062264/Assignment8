package repository.impl.peopleRespositoryTest;

import ac.za.cput.domain.people.Lecture;
import ac.za.cput.factory.peopleFactory.LectureFactory;
import ac.za.cput.repository.LectureRepository;
import ac.za.cput.repository.impl.LectureRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LectureRepositoryImplTest {

    private LectureRepository repository;
    private Lecture lecture;

    private Lecture getSavedCourse() {
        Set<Lecture> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = LectureRepositoryImpl.getRepository();
        this.lecture = LectureFactory.getLecture("Moriarty",5);
    }

    @Test
    public void a_create() {
        Lecture created = this.repository.create(this.lecture);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.lecture);
    }

    @Test
    public void b_read() {
        Lecture savedCourse = getSavedCourse();
        System.out.println("In read, courseId = "+ savedCourse.getProfessor());
        Lecture read = this.repository.read(savedCourse.getProfessor());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedCourse, read);
    }

    @Test
    public void e_delete() {
        Lecture savedCourse = getSavedCourse();
        this.repository.delete(savedCourse.getProfessor());
        getAll();
    }

    @Test
    public void c_update() {
        String newCourseName = "John";
        int newage = 2;
        Lecture updated = new Lecture.Builder().copy(getSavedCourse()).professor(newCourseName)
                .hours(newage)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getProfessor());
    }

    @Test
    public void getAll() {
        Set<Lecture> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }
}
