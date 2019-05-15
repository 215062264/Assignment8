package ac.za.cput.factoryTest.schoolSubjectsFactoryTest;

import ac.za.cput.domain.schoolSubjects.History;
import ac.za.cput.factory.schoolSubjectsFactory.HistoryFactory;
import org.junit.Assert;
import org.junit.Test;

public class HistoryFactoryTest {

    @Test
    public void getHistory() {

        String code = "HIST";
        Double pmark = 87.5;

        History c = HistoryFactory.getHistory(code,pmark);
        System.out.println(c);
        Assert.assertNotNull(c.getSubjectCode()+"\n"+c.getMark());
    }

}
