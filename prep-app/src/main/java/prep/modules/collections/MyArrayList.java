package prep.modules.collections;


import java.util.ArrayList;
import java.util.Comparator;

public class MyArrayList {

    public void runit(){
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Chicken");
        animals.add("Fox");
        animals.add("Rabbit");

        for(String item :animals) {
            System.out.printf("%s...", item);
        }
        // sort animals
        animals.sort(comparator);

        System.out.println("\nSorted:");
        for(String item :animals) {
            System.out.printf("%s...", item);
        }
    }
    // comparator that sorts by string length then alphabetically
    Comparator<String> comparator =
            (s1, s2) ->
            {
                if (s1.length() > s2.length()) {
                    return -1;
                } else if (s1.length() < s2.length()) {
                    return 1;
                } else {
                    return s1.compareTo(s2);
                }
            }
        ;
}
