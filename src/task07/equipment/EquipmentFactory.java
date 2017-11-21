package task07.equipment;

import task07.equipment.armor.*;
import task07.equipment.weapon.Weapon;

/**
 * An abstract factory interface has sets of methods
 * to make families of knight's equipment.
 * @see task07.equipment.Equipment
 */
public interface EquipmentFactory {
    AbstractArmor getHeadArmor();
    AbstractArmor getChestArmor();
    Weapon getWeapon();
}
