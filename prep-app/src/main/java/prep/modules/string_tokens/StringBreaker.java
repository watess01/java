package prep.modules.string_tokens;


public class StringBreaker {


    public String[] breakIt(String s) {
        s = s.replaceAll("[,!]", "");
        String[] words = s.split("[ !,?''._@]");
        // return count as string followed by words
        String[] result = new String[words.length + 1];
        result[0] = String.valueOf(words.length);
        System.arraycopy(words, 0, result, 1, words.length);
        return result;
    }
    public static void Run(String s, int expectedCount) {

        s = s.replaceAll("[,!]", "");


        String words[] = s.split("[ !,?''._@]");


        System.out.printf("%d\n", words.length);
        for (String word : words) {
            System.out.println(word);
        }
        System.out.printf("Word count %b\n", expectedCount == words.length);

    }
}

