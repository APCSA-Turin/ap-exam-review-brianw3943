public class GameSpinner {
	private int currentRun = 0;
    private int sectors;
    private int previousVal = -1;
    private int currentVal;
    public GameSpinner(int sectors) {
    	this.sectors = sectors;
    }
    public int spin() {
    	int randomSpin = (int)(Math.random() * sectors) + 1;
        if (currentRun == 0) {
        	currentRun = 1;
        }
        currentVal = randomSpin;
        if (previousVal == currentVal) {
        	currentRun++;
        }
        previousVal = randomSpin;
        return randomSpin;
    }
    public int currentRun() {
        return currentRun;
    }
}