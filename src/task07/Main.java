package task07;

import java.text.DecimalFormat;
import java.util.List;
import task07.equipment.*;
import task07.comparators.WeightComparator;
import task07.logic.CostFilter;

/**
 * The main class of the application
 */
public class Main {
    private static final double MIN_COST = 70.0;
    private static final double MAX_COST = 200.0;

    public static void main(String[] args) {
        EquipmentFactory kf = getFactoryByName("swordsman");
        Knight knight = new Knight(kf);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Summary knight's equipment costs ");
        System.out.println(df.format(knight.getEquipmentsCost()));

        knight.sort(new WeightComparator());
        List<Equipment> equipment = knight.getEquipment();
        for (Equipment item : equipment) {
            System.out.print(item.getType() + " costs ");
            System.out.print(df.format(item.getCost()));
            System.out.print(", it weights ");
            System.out.println(df.format(item.getWeight()));
        }

        System.out.println("------------------------");
        System.out.print("Equipment that meets the selection criteria: ");
        List<Equipment> satyisfied = knight.find(new CostFilter(MIN_COST,
                MAX_COST));
        String items = "";
        for (Equipment item : satyisfied) {
            items += item.getType() + ", ";
        }
        System.out.println(items.substring(0, items.length() - 2));
    }

    private static EquipmentFactory getFactoryByName(final String name) {
        switch (name) {
        case "swordsman":
            return new SwordsmanEquipment();
        case "axeman":
            return new AxemanEquipment();
        default:
            throw new RuntimeException("Unsupported knight factory: " + name);
        }
    }
}
