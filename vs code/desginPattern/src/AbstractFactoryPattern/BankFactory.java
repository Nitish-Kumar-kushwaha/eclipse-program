package AbstractFactoryPattern;

public class BankFactory extends AbstractFactory {
    

    @Override
    public Bank getBank(String bank) {
        // TODO

        if (bank == null)
            return null;
        if (bank.equalsIgnoreCase("HDFC")) {
            return new HDFC();
        }
        if (bank.equalsIgnoreCase("SBI")) {
            return new SBI();
        }
        if (bank.equalsIgnoreCase("ICICI")) {
            return new ICIC();
            }
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        // TODO
        return null;
    }
}
