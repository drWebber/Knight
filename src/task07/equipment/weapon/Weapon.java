package task07.equipment.weapon;

import task07.equipment.Equipment;

public abstract class Weapon extends Equipment {
    private double damage = 0;

    public double getDamage() {
        return damage;
    }

    public final void setDamage(final double damage) {
        this.damage = damage;
    }
}
