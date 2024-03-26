import java.util.ArrayList;

public class AnagramFinder implements IAnagramFinder {

    public AnagramFinder() {
        // constructor
        System.out.println("Demo - AnagramFinder...");
    }

    @Override
    public boolean isAnagram(String a, String B) {




        return false;
    }

    public static void Run() {
        AnagramFinder finder = new AnagramFinder();
        System.out.printf("Anagram is %s\n", finder.isAnagram("abc", "Cba"));



    }


}
