package prep.modules.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TopTrumps {

    private  static void addNewAeroplane(HashMap<String, Aeroplane> map, String name, double maxSpeed, double cost, double armour, double attack) {

            Aeroplane a = new Aeroplane(name, maxSpeed, cost, armour, attack);
            map.put(a.name, a);
        
        }

    private static HashMap<String, Aeroplane> sorter(HashMap<String, Aeroplane> map, Comparator<Aeroplane> c) {
                // Sort by armour
        return map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(c))
            .collect(Collectors.toMap(
                Map.Entry::getKey, 
                Map.Entry::getValue, 
                (oldValue, newValue) -> oldValue, 
                LinkedHashMap::new
            ));
    }

    private static void printMap(String title, HashMap<String, Aeroplane> map) {
        System.out.printf("Sort by %s: ", title);
        // iterate through map values
        map.forEach((key, value) -> System.out.printf("%s...", value.name));
        System.out.print("\n");
    }

    public static void runit() {

        HashMap<String, Aeroplane> map = new HashMap<String, Aeroplane>();
        addNewAeroplane(map, "F16", 1100, 16000000, 10, 60);
        addNewAeroplane(map, "Su25", 600, 10000000, 60, 30);
        addNewAeroplane(map, "F22", 1500, 150000000, 5, 70);
        addNewAeroplane(map, "C152", 130, 100000, 1, 1);


        printMap("Name", sorter(map, Aeroplane.compareName));
        printMap("Armour Reversed", sorter(map, Aeroplane.compareArmourReversed));
        printMap("Cost", sorter(map, Aeroplane.compareCost));
        printMap("Attack", sorter(map, Aeroplane.compareAttack));
        printMap("MaxSpeed", sorter(map, Aeroplane.compareMaxSpeed));


    }
}
