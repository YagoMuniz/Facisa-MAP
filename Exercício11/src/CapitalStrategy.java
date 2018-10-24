public abstract class CapitalStrategy {

    public abstract double capital(Loan loan);

    public double duration(Loan loan){
        return 1;
    }

    protected double riskFactorFor(Loan loan){
        return 1;
    }

    public double capitalTemplate(Loan loan){

        return capital(loan) * duration(loan) * riskFactorFor(loan);
    }


}
