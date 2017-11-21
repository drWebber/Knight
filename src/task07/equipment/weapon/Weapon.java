package task07.equipment.weapon;

import task07.equipment.Equipment;

/**
 * An abstract class of all knight related weapon
 * @see task07.equipment.Equipment
 */
public abstract class Weapon extends Equipment {
    private double damage;

    public double getDamage() {
        return damage;
    }

    public final void setDamage(final double damage) {
        this.damage = damage;
    }
}
