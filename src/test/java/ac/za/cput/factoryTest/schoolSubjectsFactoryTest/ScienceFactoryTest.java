package ac.za.cput.factoryTest.schoolSubjectsFactoryTest;

import ac.za.cput.domain.schoolSubjects.Science;
import ac.za.cput.factory.schoolSubjectsFactory.ScienceFactory;
import org.junit.Assert;
import org.junit.Test;

public class ScienceFactoryTest {

    @Test
    public void getScience() {

        String code = "SCI";
        Double pmark = 84.5;

        Science c = ScienceFactory.getScience(code,pmark);
        System.out.println(c);
        Assert.assertNotNull(c.getSubjectCode()+"\n"+c.getMark());
    }

}
