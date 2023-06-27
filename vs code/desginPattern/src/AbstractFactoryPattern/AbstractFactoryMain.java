package AbstractFactoryPattern;

import java.util.Scanner;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name of Bank where u need to take loan");
        String bankName = sc.next();

        System.out.println("type of Loan (Home/Busniness) : ");
        String lname = sc.next();

        AbstractFactory bankFactory = FactoryCreate.geFactory("Bank");
        Bank b = bankFactory.getBank(bankName);

        
        
        System.out.println("Entre Loan Amount : ");
        double loanAmount = sc.nextDouble();

        System.out.println("No of Years to pay:");
        int years = sc.nextInt();

        System.out.println("Entre the rate of intrest from Bank : " + b.getBankName());
        double roi = sc.nextDouble();

        AbstractFactory loanFactory = FactoryCreate.geFactory("loan");
        Loan l = loanFactory.getLoan(lname);

        l.getRateOfInterest(roi);
        l.CalculateEMI_Amoutn(loanAmount, years);
        
    }
}
