package equipment;

import equipment.armor.*;
import equipment.weapon.Weapon;

public interface KnightFactory {
    HeadArmor getHeadArmor();
    ChestArmor getChestArmor();
    Weapon getWeapon();
}
