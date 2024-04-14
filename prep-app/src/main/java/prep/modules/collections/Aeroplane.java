package prep.modules.collections;

import java.util.Comparator;

class Aeroplane {
    String name;
    double maxSpeed;
    double cost;
    double armour;
    double attack;

    Aeroplane(String name, double maxSpeed, double cost, double armour, double attack) {
        this.armour = armour;
        this.name = name;
        this.attack = attack;
        this.maxSpeed = maxSpeed;
        this.cost = cost;
    }
    static Comparator<Aeroplane> compareArmour = Comparator.comparingDouble(p -> p.armour);
    // reversed comparator
    static Comparator<Aeroplane> compareArmourReversed = compareArmour.reversed();

    static Comparator<Aeroplane> compareMaxSpeed = Comparator.comparingDouble(p -> p.maxSpeed);
    static Comparator<Aeroplane> compareCost = Comparator.comparingDouble(p -> p.cost);
    static Comparator<Aeroplane> compareAttack = Comparator.comparingDouble(p -> p.attack);
    static Comparator<Aeroplane> compareName = Comparator.comparing(p -> p.name);
    


}
