package barraks;

import java.util.Comparator;
import java.util.List;

import equipment.Equipment;

public class Knight {
    private List<Equipment> equipment;
    
    public Knight(){};

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }
    
    public List<Equipment> find(int minWeight, int maxWeight) {
        return null;
    }
    
    public void sort(Comparator<Equipment> comparator) {
        equipment.sort(comparator);
    }
}
