import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnswerTest {
    private Answer answer;

    @Before
    public void setUp() {
        answer = new Answer();
    }

    @Ignore
    @Test
    public void test() {
     //   assertFalse(answer.total_labs(10));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testRnaTranscriptionOfGuanineIsCytosine() {
        Assert.assertEquals(0, answer.total_labs(10));
    }
}
