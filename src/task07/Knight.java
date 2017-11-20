package task07;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;
import task07.equipment.*;
import task07.equipment.armor.*;
import task07.equipment.weapon.*;
import task07.logic.*;

public class Knight {
    private List<Equipment> equipment;

    public Knight() {};

    public Knight(final EquipmentFactory kf) {
        List<Equipment> equipment = new ArrayList<Equipment>();

        ThreadLocalRandom random = ThreadLocalRandom.current();

        HeadArmor helmet = kf.getHeadArmor();
        helmet.setCost(random.nextDouble(10.0, 100.0));
        helmet.setWeight(random.nextDouble(3.0, 10.0));

        ChestArmor chestArmor = kf.getChestArmor();
        chestArmor.setCost(random.nextDouble(100.0, 300.0));
        chestArmor.setWeight(random.nextDouble(10.0, 30.0));

        Weapon weapon = kf.getWeapon();
        weapon.setCost(random.nextDouble(50.0, 200.0));
        weapon.setWeight(random.nextDouble(3.0, 10.0));

        equipment.add(helmet);
        equipment.add(chestArmor);
        equipment.add(weapon);
        setEquipment(equipment);
    }

    final public List<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(final List<Equipment> equipment) {
        this.equipment = equipment;
    }

    public final List<Equipment> find(final Filter filter) {
        List<Equipment> result = new ArrayList<Equipment>();

        for (Equipment item : equipment) {
            if (filter.isSatisty(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public final void sort(final Comparator<Equipment> comparator) {
        equipment.sort(comparator);
    }

    public final double getEquipmentsCost() {
        double sum = 0;

        for (Equipment item : equipment) {
            sum += item.getCost();
        }
        return sum;
    }
}
