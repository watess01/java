package prep.modules.Morse;


public class Morse {

    private static final String morseWordDelimiter = "   ";
    private static final String charDelimiter = " ";

     public static String code(boolean morseToEnglish, String textToTranslate) {
        String[] textWords = textToTranslate.split(morseToEnglish?morseWordDelimiter:charDelimiter);
        StringBuilder ret = new StringBuilder();

        for (String word : textWords) {
            if(ret.length() > 0) ret.append(!morseToEnglish?morseWordDelimiter:charDelimiter);
            String outWord = morseToEnglish?MorseWord.toText(word):MorseWord.toMorse(word); 
            ret.append(outWord);
        }
        
        return ret.toString();
    }

}
