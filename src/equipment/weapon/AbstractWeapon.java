package equipment.weapon;

import equipment.Equipment;

public abstract class AbstractWeapon extends Equipment {
    private double damage = 0;

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
