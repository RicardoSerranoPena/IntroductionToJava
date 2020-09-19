import java.util.Scanner;

public class CurrencyTester {

    public static final int FROMVNDTOUSD = 1;
    public static final int FROMUSDTOVND = 2; 
    
    public void selectCurrency() {
        System.out.println("Select which currency to convert from: ");
        System.out.println("1: From VND to USD");
        System.out.println("2: From USD to VND");
    }

    public void amountOfMoney() {
        System.out.println("How much money do you want to exchange?");
    }

    public static void main (String[] args) {

        CurrencyTester newCurrencyTest = new CurrencyTester();
        Currency newConversion = new Currency();
        Scanner keyboard = new Scanner(System.in);

        //prints currency menu
        newCurrencyTest.selectCurrency();

        //grabs the appropiate conversion from user
        int currencyConversion = keyboard.nextInt();
        if (currencyConversion == FROMVNDTOUSD) {
            newCurrencyTest.amountOfMoney();
            double amountToConvert = keyboard.nextInt();
            double amountConverted = newConversion.exchangeFromVND(amountToConvert);
            System.out.printf("%10.2f", amountConverted);
            System.out.println(" USD");
        } else {
            newCurrencyTest.amountOfMoney();
            double amountToConvert = keyboard.nextInt();
            double amountConverted = newConversion.exchangeFromUSD(amountToConvert);
            System.out.printf("%10.2f", amountConverted);
            System.out.println(" VND");
        }
     }
     
}
