package task07.equipment.armor;

import task07.equipment.*;;

public abstract class AbstractArmor extends Equipment {
    private double armor = 0;

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }
}
