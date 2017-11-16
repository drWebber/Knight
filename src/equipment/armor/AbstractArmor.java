package equipment.armor;

import equipment.Equipment;

public abstract class AbstractArmor extends Equipment {
    private int armor = 0;

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
