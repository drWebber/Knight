package task07.equipment;

import task07.equipment.armor.*;
import task07.equipment.weapon.*;

public class SwordsmanEquipment implements EquipmentFactory {
    @Override
    public final HeadArmor getHeadArmor() {
        return new MetalHelmet();
    }

    @Override
    public final ChestArmor getChestArmor() {
        return new ChainArmor();
    }

    @Override
    public final Weapon getWeapon() {
        return new Sword();
    }
}
