public class CallingCard extends Card {
    private int cardNumber, PIN;
    
    public CallingCard(String n, int cardNumber, int PIN) {
        super(n);
        this.cardNumber = cardNumber;
        this.PIN = PIN;
    }
    
    public String formar() {
        return super.format() + " Card Number:" + this.cardNumber + " PIN:" + this.PIN;
    }
}