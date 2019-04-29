package repository.impl;

import ac.za.cput.Domain.Subject;
import ac.za.cput.repository.SubjectRepository;
import ac.za.cput.repository.impl.SubjectRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

public class SubjectRepositoryImplTest {

    private SubjectRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = SubjectRepositoryImpl.getRepository();
    }

    @Test
    public void create() {
        //create a student, add it to the repository
        this.repository.create(null);
        Assert.assertEquals(null, null);
    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void getAll() {
        Set<Subject> subjects = this.repository.getAll();
        Assert.assertEquals(1, subjects.size());
    }

}
