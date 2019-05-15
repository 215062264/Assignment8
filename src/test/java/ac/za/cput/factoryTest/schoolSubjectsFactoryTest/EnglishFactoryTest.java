package ac.za.cput.factoryTest.schoolSubjectsFactoryTest;

import ac.za.cput.domain.schoolSubjects.English;
import ac.za.cput.factory.schoolSubjectsFactory.EnglishFactory;
import org.junit.Assert;
import org.junit.Test;

public class EnglishFactoryTest {

    @Test
    public void getEnglish() {

        String code = "ENG";
        Double pmark = 92.4;

        English c = EnglishFactory.getEnglish(code,pmark);
        System.out.println(c);
        Assert.assertNotNull(c.getSubjectCode()+"\n"+c.getMark());
    }

}
