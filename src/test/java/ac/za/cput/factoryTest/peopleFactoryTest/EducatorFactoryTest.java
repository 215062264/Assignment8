package ac.za.cput.factoryTest.peopleFactoryTest;

import ac.za.cput.domain.people.Educator;
import ac.za.cput.factory.peopleFactory.EducatorFactory;
import org.junit.Assert;
import org.junit.Test;

public class EducatorFactoryTest {

    @Test
    public void getEducator() {

        String fname = "Johnny";
        String lname = "Cage";
        String eId = "7";
        int eAge = 35;

        Educator c = EducatorFactory.getEducator(fname,lname,eId,eAge);
        System.out.println(c);
        Assert.assertNotNull(c.getEducatorFirstName()+"\n"+c.getEducatorLastName()+"\n"+c.getEducatorId()+"\n"+c.getAge());
    }

}
