package prep.modules.string_tokens;

import junit.framework.TestCase;

public class StringBreakerTest extends TestCase {
    
    public void testStringBreaker() {
        String input = "This is a test";
        String[] expected = {"4", "This", "is", "a", "test"};
        StringBreaker breaker = new StringBreaker();
        String[] actual = breaker.breakIt(input);
        assertEquals(actual.length, expected.length);
        for(int i=0;i< actual.length;i++) {
            assertEquals(actual[i], expected[i]);
        }
    }


}
