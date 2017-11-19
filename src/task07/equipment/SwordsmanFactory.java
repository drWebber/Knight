package task07.equipment;

import task07.equipment.armor.*;
import task07.equipment.weapon.*;

public class SwordsmanFactory implements KnightFactory {
    @Override
    public HeadArmor getHeadArmor() {
        return new MetalHelmet();
    }

    @Override
    public ChestArmor getChestArmor() {
        return new ChainArmor();
    }

    @Override
    public Weapon getWeapon() {
        return new Sword();
    }
}
