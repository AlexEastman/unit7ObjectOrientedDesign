public class ComboLock {

    private int secret1, secret2, secret3, currentNumber;
    private int progress;
    private boolean open;


    public ComboLock( int secret1, int secret2, int secret3 ) {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
        this.currentNumber = 0;
        this.progress = 0;
        this.open = false;
    }

    public void reset() {
        this.currentNumber = 0;
    }

    public void turnLeft( int ticks ) {
        this.currentNumber -= (ticks-40);
        this.currentNumber %= 40;
        if (this.progress == 1 && this.currentNumber == this.secret2) {
            ++this.progress;
        } else if (this.progress == 2) {
            this.progress = 0;
        }
    }

    public void turnRight( int ticks ) {
        this.currentNumber += ticks;
        this.currentNumber %= 40;
        if (this.progress == 0 && this.currentNumber == this.secret1) {
            ++this.progress;
        } else if (this.progress == 2 && this.currentNumber == this.secret3) {
            ++this.progress;
        } else if (this.progress == 1 || this.progress == 3) {
            this.progress = 0;
        }
    }

    public boolean open() {
        this.open = (this.progress == 3);
        return open;
    }
}
