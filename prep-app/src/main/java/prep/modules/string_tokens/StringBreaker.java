package prep.modules.string_tokens;

import java.io.*;
import java.util.*;
public class StringBreaker {

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

