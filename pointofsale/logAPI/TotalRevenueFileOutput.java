package se.kh.iv1350.pointofsale.logAPI;

import se.kh.iv1350.pointofsale.integration.observer.ObserverTemplate;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * This is the class that writes out the total revenue to the text file
 */
public class TotalRevenueFileOutput extends ObserverTemplate{

    /**
     * Writes the total revenue to the text file made
     * @param totalRevenue the current total revenue
     */

    @Override
    protected void doShowTotalIncome(int totalRevenue) throws Exception{

            BufferedWriter writer = new BufferedWriter(new FileWriter("totalRevenueNew.txt"));
            writer.write("total Revenue " + totalRevenue);
            writer.write("\n Konungen Leif den Store" );
            writer.close();
    }

    @Override
    protected void handleErrors(Exception e) {
        e.printStackTrace();
        System.out.println("Observer error");
    }
}
