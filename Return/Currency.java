public class Currency { 

    private double valueOfUSD = 23177.83;
    private double valueOfVND = 0.000043;

    public double exchangeFromVND (double amountInVND) {
        return (amountInVND * valueOfVND);
    }

    public double exchangeFromUSD (double amountInUSD) {
        return (amountInUSD * valueOfUSD);
    }
}
