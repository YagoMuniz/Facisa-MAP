public class CapitalStrategyRevolver extends CapitalStrategy {

    public double unusedRiskFactor(Loan loan) {
        return 1;
    }

    @Override
    public double capital(Loan loan) {
        return loan.outstandingRiskAmount()
                + (loan.unusedRiskAmount() * duration(loan) * unusedRiskFactor(loan));
    }
}
