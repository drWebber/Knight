package task07.equipment;

import task07.equipment.armor.*;
import task07.equipment.weapon.Weapon;

public interface EquipmentFactory {
    HeadArmor getHeadArmor();
    ChestArmor getChestArmor();
    Weapon getWeapon();
}
