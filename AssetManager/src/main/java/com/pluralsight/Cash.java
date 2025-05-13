package com.pluralsight;

public class Cash extends Asset{

    public Cash(String dateAcquired, double originalCost) {
        super("Cash", dateAcquired, originalCost);
    }

    @Override
    public double getValue() {
        return super.getOriginalCost();
    }
}
