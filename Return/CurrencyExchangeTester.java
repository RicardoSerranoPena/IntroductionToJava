import java.util.Scanner;

/**
 * A class to test the Currency class
 */
public class CurrencyExchangeTester {

    //Use of constants to avoid using magic numbers
    public static final int FROMVNDTOUSD = 1;
    public static final int FROMUSDTOVND = 2; 

    //use of variables
    private int currencyToExchange;
    private double amountToConvert;
    
    /**
     * Method to print the select currency to exchange from menu
     */
    public void selectCurrencyMenu(Scanner keyboard) {
        System.out.println("Select which currency to exchange from: ");
        System.out.println("1: From VND to USD");
        System.out.println("2: From USD to VND");
        currencyToExchange = keyboard.nextInt();
    }

    /**
     * Method to print how much money they want to exchange
     */
    public void amountOfMoney(Scanner keyboard) {
        System.out.println("How much money do you want to exchange?");
        amountToConvert = keyboard.nextInt();
    }

    public void convertMoney(CurrencyExchange newCurrencyExchange) {
        if (currencyToExchange == FROMVNDTOUSD) {
            double amountConverted = newCurrencyExchange.exchangeFromVND(amountToConvert);
            System.out.printf("%6.2f", amountConverted);
            System.out.println(" USD");
        } else if (currencyToExchange == FROMUSDTOVND) {
            double amountConverted = newCurrencyExchange.exchangeFromUSD(amountToConvert);
            System.out.printf("%6.2f", amountConverted);
            System.out.println(" VND"); 
        } else {
            return;
        }
    }

    public static void main (String[] args) {

        //Making new objects/instances of classes
        CurrencyExchangeTester newCurrencyExchangeTest = new CurrencyExchangeTester();
        CurrencyExchange newCurrencyExchange = new CurrencyExchange();
        Scanner keyboard = new Scanner(System.in);

        //prints currency menu and grabs the appropiate conversion from user
        newCurrencyExchangeTest.selectCurrencyMenu(keyboard);
        //prints how much money they would like to convert and grabs the amount of money they would like to convert
        newCurrencyExchangeTest.amountOfMoney(keyboard);
        //makes the conversion
        newCurrencyExchangeTest.convertMoney(newCurrencyExchange);
     }
     
}
