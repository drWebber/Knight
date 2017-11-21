package task07.equipment.armor;

import task07.equipment.*;

/**
 * An abstract class of all knight related armor
 * @see task07.equipment.Equipment
 */
public abstract class AbstractArmor extends Equipment {
    private double armor;

    public double getArmor() {
        return armor;
    }

    public final void setArmor(final double armor) {
        this.armor = armor;
    }
}
