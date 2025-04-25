public class Data {
    public static final int MAX = 500; // THIS VALUE ADDED TO ENABLE TESTING
    private int[][] grid;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public Data(int[][] g) {
        grid = g;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public int[][] getGrid() {
        return grid;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public void setGrid(int[][] newGrid) {
        grid = newGrid;
    }

public void repopulate() {
		for (int i = 0; i < grid.length; i++) {
	for (int j = 0; j < grid[i].length; j++) {
	int val = (int)(Math.random() * MAX) + 1;
	while (val % 10 != 0 || val % 100 == 0) {
	val = (int)(Math.random() * MAX) + 1;
}
grid[i][j] = val;
}
}
}

public int countIncreasingCols() {
		int count = 0;
		for (int i = 0; i < grid[0].length; i++) {
	boolean ordered = true;
	for (int j = 1; j < grid.length; j++) {
	if (grid[j][i] < grid[j - 1][i]) {
	ordered = false;
}
}
if (ordered == true) {
	count++;
}
}
return count;
}
}
