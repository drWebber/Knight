package task07.equipment;

import task07.equipment.armor.*;
import task07.equipment.weapon.*;

/**
 * A concrete factory to make families of swordsman equipment.
 * @see task07.equipment.EquipmentFactory
 */
public class SwordsmanEquipment implements EquipmentFactory {
    @Override
    public final AbstractArmor getHeadArmor() {
        return new MetalHelmet();
    }

    @Override
    public final AbstractArmor getChestArmor() {
        return new ChainArmor();
    }

    @Override
    public final Weapon getWeapon() {
        return new Sword();
    }
}
