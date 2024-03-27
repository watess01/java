package prep.modules;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import prep.interfaces.IAnagramFinder;

public class AnagramFinder implements IAnagramFinder {

    public AnagramFinder() {
        // constructor
        System.out.println("Demo - AnagramFinder...");
    }

    class CharCount{
        char c;
        int count;
    }
    private class CharCountList extends ArrayList<CharCount> {
        public void sortbyChar() {
            sort((a, b) -> a.c - b.c);  
        }
        public CharCountList(HashMap<Character, Integer> map) {
            map.forEach((ch, count) ->{
                CharCount cc = new CharCount();
                cc.c = ch;
                cc.count = count;
                add(cc);
            });            
        }

    }

    public boolean compareCharCounts(CharCountList mapA, CharCountList mapB) {
        if(mapA.size() != mapB.size()) {
            return false;
        }
        for(int i=0;i<mapA.size();i++){
            CharCount a = mapA.get(i);
            CharCount b = mapB.get(i);

            if(a.c != b.c || a.count!=b.count) {
                return false;
            }
        }
        return true;
    }


    @Override
    public boolean isAnagram(String a, String b) {

    // sort the into a list of characters with the count of each character
        CharCountList mapA = getWordHashMap(a);
        CharCountList mapB = getWordHashMap(b);
        return compareCharCounts(mapA, mapB);
    }

    /**
     * InnerAnagramFinder
     */
    public interface InnerAnagramFinder {
    
        
    }
    public CharCountList getWordHashMap(String word) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        String lword = word.toLowerCase();
        for (int i = 0; i < lword.length(); i++) {
            char c = lword.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        // convert map to a list
        CharCountList list = new CharCountList(map);        

        // sort the list
        list.sortbyChar(); 

        return list;
    }

    public void test(String a, String b) {
  
        System.out.printf("Anagram ('%s', '%s') is %s\n", a, b, isAnagram(a, b));
    }

    public static void Run() {
        AnagramFinder finder = new AnagramFinder();
        finder.test("abc", "Cba");
        finder.test("abc", "cba");
        finder.test("abc", "Cbsa");
    }


}
