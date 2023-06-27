package AbstractFactoryPattern;

public class LoanFactory extends AbstractFactory{
    

    @Override
    public Bank getBank(String bank) {
        // TODO
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        // TODO

        if (loan == null)
            return null;
        if (loan.equalsIgnoreCase("HOME")) {
            return new HomeLoan();
        }
        if (loan.equalsIgnoreCase("Bussiness")) {
            return new BussinessLoan();
        }

        return null;
    }
}
