package task07.comparators;

import java.util.Comparator;
import task07.equipment.Equipment;

/**
 * Provides a comparison function, which imposes a 
 * total ordering on collection of equipment objects
 * @see task07.equipment.Equipment
 */
public class WeightComparator implements Comparator<Equipment> {
    @Override
    public final int compare(final Equipment e1, final Equipment e2) {
        return Double.compare(e1.getWeight(), e2.getWeight());
    }
}
