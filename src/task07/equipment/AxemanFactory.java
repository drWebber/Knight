package task07.equipment;

import task07.equipment.armor.*;
import task07.equipment.weapon.*;

public class AxemanFactory implements KnightFactory {
    @Override
    public HeadArmor getHeadArmor() {
        return new LeathreHelmet();
    }

    @Override
    public ChestArmor getChestArmor() {
        return new WoodSuit();
    }

    @Override
    public Weapon getWeapon() {
        return new Axe();
    }
}
