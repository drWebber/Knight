package task07.equipment;

import task07.equipment.armor.*;
import task07.equipment.weapon.*;

public class AxemanEquipment implements EquipmentFactory {
    @Override
    public final HeadArmor getHeadArmor() {
        return new LeathreHelmet();
    }

    @Override
    public final ChestArmor getChestArmor() {
        return new WoodSuit();
    }

    @Override
    public final Weapon getWeapon() {
        return new Axe();
    }
}
