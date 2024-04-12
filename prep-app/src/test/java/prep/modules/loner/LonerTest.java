package prep.modules.loner;
import org.junit.Assert;
import org.junit.Test;


public class LonerTest {
    @Test
    public void exampleTestCase() {
        int [] input = {5,3,2,2,3,5,4,6,9,6,4,12,8,9,12};
        int expected = 8;
        int actual = Loner.findLoner(input);
        Assert.assertEquals(expected, actual);
    }
}