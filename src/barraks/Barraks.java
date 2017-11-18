package barraks;

import java.text.DecimalFormat;
import java.util.List;
import comparators.WeightComparator;
import equipment.*;
import logic.CostFilter;

public class Barraks {
    public static void main(String[] args) {
	KnightFactory kf = getFactoryByName("swordsman");
	Knight knight = new Knight(kf);

	DecimalFormat df = new DecimalFormat("0.00");

	System.out.print("Total knight's equipment cost is ");
	System.out.println(df.format(knight.getEquipmentsCost()));

	knight.sort(new WeightComparator());
	List<Equipment> equipment = knight.getEquipment();
	for (Equipment item : equipment) {
	    System.out.print(item.getType() + "'s cost is ");
	    System.out.print(df.format(item.getCost()));
	    System.out.print(", it weight's ");
	    System.out.println(df.format(item.getWeight()));
	}
	
	System.out.println("------------------------");
	List<Equipment> satyisfied = knight.find(new CostFilter(70.0, 200.0));
	for (Equipment item : satyisfied) {
	    System.out.println(item.getType());
	}
    }    

    private static KnightFactory getFactoryByName(String name) {
	switch (name) {
	case "swordsman":
	    return new SwordsmanFactory();
	case "axeman":
	    return new AxemanFactory();
	default:
	    throw new RuntimeException("Unsupported knight factory: " + name);
	}
    }
}
