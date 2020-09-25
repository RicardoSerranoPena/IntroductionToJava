/**
 * A class to convert money from USD to VND and vice versa
 */
public class CurrencyExchange { 

    //Attributres set to private so they can't be modified
    private double valueOfUSD = 23177.83;
    private double valueOfVND = 0.000043;

    /**
     * A method that converts from VND to USD
     * @param amountInVND
     * @return The amount of VND converted into USD
     */
    public double exchangeFromVND (double amountInVND) {
        return (amountInVND * valueOfVND);
    }

    /**
     * A method that converts from USD to VND
     * @param amountInUSD
     * @return The amount of USD converted into VND
     */
    public double exchangeFromUSD (double amountInUSD) {
        return (amountInUSD * valueOfUSD);
    }
}
