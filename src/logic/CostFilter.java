package logic;

import equipment.Equipment;

public class CostFilter implements Filter {
    private double minCost;
    private double maxCost;
    
    public CostFilter(final double minCost, final double maxCost) {
	if (minCost <= 0 || minCost >= maxCost) {
	    throw new RuntimeException("Cost filter arguments are wrong");   
	}
	this.minCost = minCost;
	this.maxCost = maxCost;
    }
    
    @Override
    public boolean isSatisty(Equipment eq) {
	double eqCost = eq.getCost();
	return (minCost <= eqCost && eqCost <= maxCost);
    }

}
