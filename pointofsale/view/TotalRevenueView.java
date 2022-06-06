package se.kh.iv1350.pointofsale.view;

import se.kh.iv1350.pointofsale.integration.observer.ObserverTemplate;

/**
 * This is the class that writes out the total revenue to the console, (the user)
 */

public class TotalRevenueView extends ObserverTemplate{
    /**
     * Prints the total revenue to the user
     * @param totalRevenue the current total revenue
     */

    @Override
    protected void doShowTotalIncome(int totalRevenue) throws Exception {
        System.out.println("the current total revenue is " + totalRevenue);
    }

    @Override
    protected void handleErrors(Exception e) {
        e.printStackTrace();
    }
}
