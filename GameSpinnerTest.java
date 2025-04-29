public class GameSpinnerTest {
    public static void main(String[] args) {
        GameSpinner g = new GameSpinner(4);
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (int i = 0; i < 10000; i++) {
            int spin = g.spin();
            if (spin == 1) {
                count1++;
            }
            if (spin == 2) {
                count2++;
            }
            if (spin == 3) {
                count3++;
            }
            if (spin == 4) {
                count4++;
            }
            if (spin < 1 || spin > 4) {
                System.out.println("!!!!!! TEST 1 FAILED: spin should return 1 through 4, inclusive, when spinner has 4 sectors; your spin method returned " + spin);
                System.exit(0);
            }
        }
        System.out.println("TEST 1 PASSED");
        if (count1 == 0 || count2 == 0 || count3 == 0 || count4 == 0) {
            System.out.println("!!!!!! TEST 2 FAILED: spin should return 1 through 4, inclusive, when spinner has 4 sectors; your spin method did not return all possible values");
            System.exit(0);
        }
        System.out.println("TEST 2 PASSED");

        GameSpinner g2 = new GameSpinner(6);
        count1 = 0;
        count2 = 0;
        count3 = 0;
        count4 = 0;
        int count5 = 0;
        int count6 = 0;
        for (int i = 0; i < 10000; i++) {
            int spin = g2.spin();
            if (spin == 1) {
                count1++;
            }
            if (spin == 2) {
                count2++;
            }
            if (spin == 3) {
                count3++;
            }
            if (spin == 4) {
                count4++;
            }
            if (spin == 5) {
                count5++;
            }
            if (spin == 6) {
                count6++;
            }
            if (spin < 1 || spin > 6) {
                System.out.println("!!!!!! TEST 3 FAILED: spin should return 1 through 6, inclusive, when spinner has 6 sectors; your spin method returned " + spin);
                System.exit(0);
            }
        }
        System.out.println("TEST 3 PASSED");
        if (count1 == 0 || count2 == 0 || count3 == 0 || count4 == 0 || count5 == 0 || count6 == 0) {
            System.out.println("!!!!!! TEST 4 FAILED: spin should return 1 through 6, inclusive, when spinner has 4 sectors; your spin method did not return all possible values");
            System.exit(0);
        }
        System.out.println("TEST 4 PASSED");

        GameSpinner g3 = new GameSpinner(4);
        int current = g3.currentRun();
        if (current == 0) {
            System.out.println("TEST 5 PASSED");
        } else {
            System.out.println("!!!!!! TEST 5 FAILED: currentRun should initially return 0 before spin is called; your currentRun method returns " + current);
            System.exit(0);
        }
        int prevSpin = g3.spin();
        current = g3.currentRun();
        if (current == 1) {
            System.out.println("TEST 6 PASSED");
        } else {
            System.out.println("!!!!!! TEST 6 FAILED: currentRun should return 1 after a single spin; your currentRun method returns " + current);
            System.exit(0);
        }
        int runLength = 1;
        for (int i = 0; i < 100000; i++) {
            int spin = g3.spin();
            if (spin == prevSpin) {
                runLength++;
                if (runLength != g3.currentRun()) {
                    System.out.println("!!!!!! TEST 7 FAILED: currentRun doesn't return the correct value when multiple spins in a row produce the same number");
                    System.exit(0);
                }
            } else {
                runLength = 1;
                prevSpin = spin;
                if (runLength != g3.currentRun()) {
                    System.out.println("!!!!!! TEST 8 FAILED: currentRun doesn't reset back to 1 when spin produces a different number than the previous spin");
                    System.exit(0);
                }
            }
        }
        System.out.println("TESTS 7 & 8 PASSED");
    }
}

