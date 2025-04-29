public class TheaterTest {
    public static void main(String[] args) {
        System.out.println("------ Testing part (a): Theater constructor ------");
        Theater t1 = new Theater(8, 5, 15);
        Seat[][] t1Seats = t1.theaterSeats;
        if (t1Seats.length == 20 && t1Seats[0].length == 8) {
            System.out.println("PART A TEST 1 PASSED");
        } else {
            System.out.println("!!!!!! PART A TEST 1 FAILED: theaterSeats should have 20 rows and 8 columns; yours has " + t1Seats.length + " rows and " + t1Seats[0].length + " columns");
            System.exit(0);
        }
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 8; c++) {
                if (!t1Seats[r][c].isAvailable() || t1Seats[r][c].getTier() != 1) {
                    System.out.println("!!!!!! PART A TEST 2 FAILED: row 0 through row 4 of theaterSeats should have been initialized to Seat objects with availability 'true' and tier '1'");
                    System.exit(0);
                }
            }
        }
        System.out.println("PART A TEST 2 PASSED");
        for (int r = 5; r < 20; r++) {
            for (int c = 0; c < 8; c++) {
                if (!t1Seats[r][c].isAvailable() || t1Seats[r][c].getTier() != 2) {
                    System.out.println("!!!!!! PART A TEST 3 FAILED: row 5 through row 19 of theaterSeats should have been initialized to Seat objects with availability 'true' and tier '2'");
                    System.exit(0);
                }
            }
        }
        System.out.println("PART A TEST 3 PASSED");

        Theater t2 = new Theater(10, 16, 0);
        Seat[][] t2Seats = t2.theaterSeats;
        if (t2Seats.length == 16 && t2Seats[0].length == 10) {
            System.out.println("PART A TEST 4 PASSED");
        } else {
            System.out.println("!!!!!! PART A TEST 4 FAILED: theaterSeats should have 16 rows and 10 columns; yours has " + t2Seats.length + " rows and " + t2Seats[0].length + " columns");
            System.exit(0);
        }
        for (int r = 0; r < 16; r++) {
            for (int c = 0; c < 10; c++) {
                if (!t2Seats[r][c].isAvailable() || t2Seats[r][c].getTier() != 1) {
                    System.out.println("!!!!!! PART A TEST 5 FAILED: all rows of theaterSeats should have been initialized to Seat objects with availability 'true' and tier '1'");
                    System.exit(0);
                }
            }
        }
        System.out.println("PART A TEST 5 PASSED");

        System.out.println("\n------ Testing part (b): reassignSeat ------");
        Theater t3 = new Theater(3, 3, 4);
        Seat[][] t3Seats = t3.theaterSeats;
        for (int r = 0; r < t3Seats.length; r++) {
            for (int c = 0; c < t3Seats[0].length; c++) {
                t3Seats[r][c].setAvailability(true); // not necessary but added anyway
            }
        }
        t3Seats[1][0].setAvailability(false);
        t3Seats[2][1].setAvailability(false);
        t3Seats[4][2].setAvailability(false);
        t3Seats[6][0].setAvailability(false);
        t3Seats[0][2].setAvailability(false);
        t3Seats[1][1].setAvailability(false);
        t3Seats[3][0].setAvailability(false);
        t3Seats[5][1].setAvailability(false);
        boolean move1 = t3.reassignSeat(0, 2, 2, 0);
        if (move1 && t3Seats[0][2].isAvailable() && !t3Seats[2][0].isAvailable()) {
            System.out.println("PART B TEST 1 PASSED");
        } else {
            System.out.println("!!!!!! PART B TEST 1 FAILED (moving from Tier 1 seat to an available Tier 1 seat)");
            System.out.println("       the method should return true and yours returned " + move1);
            System.out.println("       the availability of Tier 1 source seat at [0][2] should now be true and yours is " + t3Seats[0][2].isAvailable());
            System.out.println("       the availability of Tier 1 destination seat at [2][0] should now be false and yours is " + t3Seats[2][0].isAvailable());
            System.exit(0);
        }
        t3Seats[0][2].setAvailability(false);
        boolean move3 = t3.reassignSeat(0, 2, 4, 1);
        if (move3 && t3Seats[0][2].isAvailable() && !t3Seats[4][1].isAvailable()) {
            System.out.println("PART B TEST 2 PASSED");
        } else {
            System.out.println("!!!!!! PART B TEST 2 FAILED (moving from Tier 1 seat to an available Tier 2 seat)");
            System.out.println("       the method should return true and yours returned " + move3);
            System.out.println("       the availability of Tier 1 source seat at [0][2] should now be true and yours is " + t3Seats[0][2].isAvailable());
            System.out.println("       the availability of Tier 2 destination seat at [4][1] should now be false and yours is " + t3Seats[2][0].isAvailable());
            System.exit(0);
        }
        boolean move2 = t3.reassignSeat(1, 1, 2, 1);
        if (!move2 && !t3Seats[1][1].isAvailable() && !t3Seats[2][1].isAvailable()) {
            System.out.println("PART B TEST 3 PASSED");
        } else {
            System.out.println("!!!!!! PART B TEST 3 FAILED (attempting to move from Tier 1 seat to an unavailable Tier 1 seat)");
            System.out.println("       the method should return false and yours returned " + move2);
            System.out.println("       the availability of Tier 1 source seat at [1][1] should remain false and yours is " + t3Seats[1][1].isAvailable());
            System.out.println("       the availability of Tier 1 destination seat at [2][1] should remain false and yours is " + t3Seats[2][1].isAvailable());
            System.exit(0);
        }
        boolean move4 = t3.reassignSeat(1, 1, 6, 0);
        if (!move4 && !t3Seats[1][1].isAvailable() && !t3Seats[6][0].isAvailable()) {
            System.out.println("PART B TEST 4 PASSED");
        } else {
            System.out.println("!!!!!! PART B TEST 4 FAILED (attempting to move from Tier 1 seat to an unavailable Tier 2 seat)");
            System.out.println("       the method should return false and yours returned " + move4);
            System.out.println("       the availability of Tier 1 source seat at [1][1] should remain false and yours is " + t3Seats[1][1].isAvailable());
            System.out.println("       the availability of Tier 2 destination seat at [6][0] should remain false and yours is " + t3Seats[6][0].isAvailable());
            System.exit(0);
        }

        boolean move5 = t3.reassignSeat(3, 0, 0, 1);
        if (!move5 && !t3Seats[3][0].isAvailable() && t3Seats[0][1].isAvailable()) {
            System.out.println("PART B TEST 5 PASSED");
        } else {
            System.out.println("!!!!!! PART B TEST 5 FAILED (attempting to move from Tier 2 seat to an available Tier 1 seat)");
            System.out.println("       the method should return false and yours returned " + move5);
            System.out.println("       the availability of Tier 2 source seat at [3][0] should remain false and yours is " + t3Seats[3][0].isAvailable());
            System.out.println("       the availability of Tier 1 destination seat at [0][1] should remain true and yours is " + t3Seats[0][1].isAvailable());
            System.exit(0);
        }
        boolean move6 = t3.reassignSeat(3, 0, 5, 2);
        if (move6 && t3Seats[3][0].isAvailable() && !t3Seats[5][2].isAvailable()) {
            System.out.println("PART B TEST 6 PASSED");
        } else {
            System.out.println("!!!!!! PART B TEST 6 FAILED (moving from Tier 2 seat to an available Tier 2 seat)");
            System.out.println("       the method should return true and yours returned " + move6);
            System.out.println("       the availability of Tier 2 source seat at [3][0] should now be true and yours is " + t3Seats[3][0].isAvailable());
            System.out.println("       the availability of Tier 2 destination seat at [5][2] should now be false and yours is " + t3Seats[5][2].isAvailable());
            System.exit(0);
        }
        boolean move7 = t3.reassignSeat(5, 1, 2, 1);
        if (!move7 && !t3Seats[5][1].isAvailable() && !t3Seats[2][1].isAvailable()) {
            System.out.println("PART B TEST 7 PASSED");
        } else {
            System.out.println("!!!!!! PART B TEST 7 FAILED (attempting to move from Tier 2 seat to an unavailable Tier 1 seat)");
            System.out.println("       the method should return false and yours returned " + move7);
            System.out.println("       the availability of Tier 2 source seat at [5][1] should remain false and yours is " + t3Seats[5][1].isAvailable());
            System.out.println("       the availability of Tier 1 destination seat at [2][1] should remain false and yours is " + t3Seats[2][1].isAvailable());
            System.exit(0);
        }
        boolean move8 = t3.reassignSeat(5, 1, 4, 2);
        if (!move8 && !t3Seats[5][1].isAvailable() && !t3Seats[4][2].isAvailable()) {
            System.out.println("PART B TEST 8 PASSED");
        } else {
            System.out.println("!!!!!! PART B TEST 8 FAILED (attempting to move from Tier 2 seat to an unavailable Tier 2 seat)");
            System.out.println("       the method should return false and yours returned " + move8);
            System.out.println("       the availability of Tier 2 source seat at [5][1] should remain false and yours is " + t3Seats[5][1].isAvailable());
            System.out.println("       the availability of Tier 2 destination seat at [4][2] should remain false and yours is " + t3Seats[4][2].isAvailable());
            System.exit(0);
        }
    }
}
