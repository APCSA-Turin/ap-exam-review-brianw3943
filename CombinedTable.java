public class CombinedTable {
	private SingleTable tableOne;
	private SingleTable tableTwo;
	public CombinedTable(SingleTable tableOne, SingleTable tableTwo) {
		this.tableOne = tableOne;
		this.tableTwo = tableTwo;
    }
    public boolean canSeat (int num) {
        int totalAvailable = tableOne.getNumSeats() + tableTwo.getNumSeats() - 2;
        if (totalAvailable >= num) {
            return true;
        } else {
            return false;
        }
    }
    public double getDesirability() {
        double averageView = (tableOne.getViewQuality() + tableTwo.getViewQuality()) / 2;
        if (tableOne.getHeight() == tableTwo.getHeight()) {
            return averageView;
        } else {
            return averageView - 10;
        }
    }
}
