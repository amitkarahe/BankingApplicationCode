package bankingmultiuser;

public class Transactions {
    
    protected String transactionType;
    protected double transactionAmount;
    
    public Transactions(String transactionType, double transactionAmount){
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
    }
}
