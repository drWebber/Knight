package equipment;

import equipment.armor.*;
import equipment.weapon.*;

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
