package prep.modules.Morse;

public class MorseWord {
    private static final String charDelimiter = " ";

    public static String toMorse(String word) {
        StringBuilder ret = new StringBuilder();
        for (int i=0;i<word.length();i++) {
            char ch = word.charAt(i);
            if(ret.length() > 0) ret.append(charDelimiter);
            ret.append(MorseCharacter.getMorse(ch));
        }
        return ret.toString();
    }
    public static String toText(String word) {
        StringBuilder ret = new StringBuilder();
        for (String character : word.split(charDelimiter)) {
            ret.append(MorseCharacter.getText(character));
        }
        return ret.toString();
    }
}
