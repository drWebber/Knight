package task07.comparators;

import java.util.Comparator;
import task07.equipment.Equipment;

public class WeightComparator implements Comparator<Equipment> {
    @Override
    public int compare(Equipment e1, Equipment e2) {
        return Double.compare(e1.getWeight(), e2.getWeight());
    }
}