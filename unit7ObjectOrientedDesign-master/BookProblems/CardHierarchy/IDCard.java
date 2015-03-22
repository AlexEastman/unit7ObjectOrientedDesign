public class IDCard extends Card {
    private String id;
    
    public IDCard(String n, String id) {
        super(n);
        this.id = id;
    }
    
    public String format() {
        return super.format() + " ID:" + this.id;
    }
}