package se.kh.iv1350.pointofsale.integration;
import se.kh.iv1350.pointofsale.integration.observer.ObserverTemplate;
import se.kh.iv1350.pointofsale.logAPI.TotalRevenueFileOutput;
import se.kh.iv1350.pointofsale.model.Sale;
import se.kh.iv1350.pointofsale.view.TotalRevenueView;

/**
 * Class that makes call to an external accounting system,
 * for this application subsequent information will be hardcoded.
 */
public class AccountingSystem {
    private int amountOfMoneyInSystem;
    private ObserverTemplate obsView = new TotalRevenueView();
    private ObserverTemplate obsFile = new TotalRevenueFileOutput();

    /**
     * Updates all the observers
     */
    private void notifyAllObservers(){
        obsView.newSaleWasMade(amountOfMoneyInSystem);
        obsFile.newSaleWasMade(amountOfMoneyInSystem);
    }

    /**
     * Gets amount of money in the system
     * @return amount of money
     */

    public int getAmountOfMoneyInSystem() {
        return amountOfMoneyInSystem;
    }
    /**
     * Updates our made-up accounting system
     * @param sale the current sale
     */
    public void updateAccountingSystem(Sale sale, int paymentAmount){
        if (paymentAmount >= sale.getTotalPriceAndTaxForEntirePurchase())
        {
            amountOfMoneyInSystem += sale.getTotalPrice() + sale.getTaxForEntirePurchase();
            notifyAllObservers();
        }
    }
}
