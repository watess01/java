package prep.modules.Morse;

import org.junit.Test;

public class MorseTest {
    @Test
    public void testCode() {
        String text = "HELLO WORLD";
        String morse = Morse.code(false, text);
        String text2 = Morse.code(true, morse);
        assert text.equals(text2);
    }
}
