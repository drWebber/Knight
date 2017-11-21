package task07.logic;

import task07.equipment.Equipment;

/**
 * Defines the interface for classes that know how to filter the equipment.
 */
public interface Filter {
    boolean isSatisty(Equipment eq);
}
