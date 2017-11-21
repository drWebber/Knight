package task07.equipment;

import task07.equipment.armor.*;
import task07.equipment.weapon.*;

/**
 * A concrete factory to make families of axeman equipment
 * @see task07.equipment.EquipmentFactory
 */
public class AxemanEquipment implements EquipmentFactory {
    @Override
    public final AbstractArmor getHeadArmor() {
        return new LeathreHelmet();
    }

    @Override
    public final AbstractArmor getChestArmor() {
        return new WoodSuit();
    }

    @Override
    public final Weapon getWeapon() {
        return new Axe();
    }
}
