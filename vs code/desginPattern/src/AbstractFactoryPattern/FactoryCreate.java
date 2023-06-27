package AbstractFactoryPattern;

public class FactoryCreate {
    public static AbstractFactory geFactory(String choice) {
        if (choice.equalsIgnoreCase("BANK")) {
            return new BankFactory();
        }
        if(choice.equalsIgnoreCase("LOAN")){
            return new LoanFactory();
        }
        return null;
    }
}
