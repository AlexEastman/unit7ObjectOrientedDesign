import java.util.GregorianCalendar;

public class DriverLicense extends Card {
    private int expirationYear;
    
    public DriverLicense(String n, int expirationYear) {
        super(n);
        this.expirationYear = expirationYear;
    }
    
    public String format() {
        return super.format() + " Expiration Year:" + this.expirationYear;
    }
    
    public boolean isExpired() {
        GregorianCalendar calendar = new GregorianCalendar();
        return (this.expirationYear < calendar.get(calendar.YEAR));
    }
}