package AbstractFactoryPattern;

public abstract class Loan {
    protected double rateOfInterest;

    abstract void getRateOfInterest(double rate);

    public void CalculateEMI_Amoutn(double loanAmt, int years) {
        double EMI;
        int n;
        
        n = years * 12;
        rateOfInterest = rateOfInterest / 1200;
        
        EMI = (rateOfInterest * Math.pow((1 + rateOfInterest), n)) / ((Math.pow(1 + rateOfInterest, n)) - 1) * loanAmt;
        System.out.println("EMI Amoutn : " + EMI);
    }
}
