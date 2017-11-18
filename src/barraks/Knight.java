package barraks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import equipment.*;
import equipment.armor.*;
import equipment.weapon.*;
import logic.Filter;

public class Knight {
    private List<Equipment> equipment;

    public Knight(){};
    public Knight(KnightFactory kf) {        
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

    public List<Equipment> getEquipment() {
	return equipment;
    }

    public void setEquipment(List<Equipment> equipment) {
	this.equipment = equipment;
    }

    public List<Equipment> find(Filter filter) {
	List<Equipment> result = new ArrayList<Equipment>();
	for (Equipment item : equipment) {
	    if (filter.isSatisty(item)) {
		result.add(item);		
	    }
	}
	return result;
    }

    public void sort(Comparator<Equipment> comparator) {
	equipment.sort(comparator);
    }

    public double getEquipmentsCost() {
	double sum = 0;

	for (Equipment item : equipment) {
	    sum += item.getCost();
	}
	return sum;
    }
}
