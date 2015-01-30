public class BillFold {
    private Card card1, card2;
    
    public BillFold() {
        this.card1 = null;
        this.card2 = null;
    }
    
    public void addCards(Card newCard1, Card newCard2) {
        if (card1 == null) {
            card1 = newCard1;
        }
        if (card2 == null) {
            card2 = newCard2;
        }
    }
    
    public String formatCards() {
        return "[" + card1.format() + "|" + card2.format() + "]";
    }
    
    public int getExpiredCardCount()
    {
        
    }
}