package equipment;

import equipment.armor.*;
import equipment.weapon.*;

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
