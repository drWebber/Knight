package task07.equipment;

/**
 * An abstract class of all knight related equipment
 */
public abstract class Equipment {
    private double cost;
    private double weight;

    public double getCost() {
        return cost;
    }

    public void setCost(final double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(final double weight) {
        this.weight = weight;
    }

    public abstract String getType();
}
