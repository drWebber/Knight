package task07.logic;

import task07.equipment.Equipment;

/**
 * Used to decide which equipment corresponds to a price range.
 */
public class CostFilter implements Filter {
    private final double minCost;
    private final double maxCost;

    public CostFilter(final double minCost, final double maxCost) {
        if ((minCost <= 0) || (minCost >= maxCost)) {
            throw new RuntimeException("Cost filter arguments are wrong");
        }
        this.minCost = minCost;
        this.maxCost = maxCost;
    }

    @Override
    public final boolean isSatisty(final Equipment eq) {
        double eqCost = eq.getCost();
        return ((minCost <= eqCost) && (eqCost <= maxCost));
    }
}
