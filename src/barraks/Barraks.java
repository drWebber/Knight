package barraks;

import java.util.ArrayList;
import java.util.List;

import equipment.Equipment;
import equipment.KnightFactory;
import equipment.SwordsmanFactory;
import equipment.armor.ChestArmor;
import equipment.armor.HeadArmor;

public class Barraks {

    public static void main(String[] args) {
        KnightFactory kf = new SwordsmanFactory();
        Knight knight = newKnight(kf);
    }
    public static Knight newKnight(KnightFactory kf, double helmetCost, 
            double helmetWeight, double chestCost, double chestWeight, 
            double weaponCost, double weaponWeight) {
        
        Knight knight = new Knight();
        List<Equipment> equipment = new ArrayList<Equipment>();
        
        HeadArmor helmet = kf.getHeadArmor();
        helmet.setCost(helmetCost);
        helmet.setWeight(helmetWeight);
        
        ChestArmor chestArmor = kf.getChestArmor();
        chestArmor.setCost(chestCost);
        chestArmor.setWeight(chestWeight);
        
        equipment.add(helmet);
        equipment.add(chestArmor);
        equipment.add(kf.getWeapon());
        knight.setEquipment(equipment);
        
        return knight;        
    }
}
