package se.kh.iv1350.pointofsale.integration.observer;

public abstract class ObserverTemplate {
    private int totalRevenue;
    // This is the method defined in the observer interface.
    public  void newSaleWasMade(int totalRevenue) {
        calculateTotalIncome(totalRevenue);

        showTotalIncome (this.totalRevenue);
        }

        private void showTotalIncome(int totalRevenue) {
        try {
            doShowTotalIncome (totalRevenue);
            } catch (Exception e) {
            handleErrors(e);
            }
        }

        protected abstract void doShowTotalIncome(int totalRevenue) throws Exception;

        protected abstract void handleErrors(Exception e);

        private void calculateTotalIncome(int totalRevenue)
        {
            this.totalRevenue = totalRevenue;
        }
}
