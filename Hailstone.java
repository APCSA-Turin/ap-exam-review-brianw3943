public class Hailstone {
    /**
     Returns the length of a hailstone sequence that starts with n as described in part (a).
     Precondition: n > 0
     */
    public static int hailstoneLength(int n) {
        if (n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return 1 + hailstoneLength(n / 2);
        } else {
            return 1 + hailstoneLength(3 * n + 1);
        }
    }

    /**
     Returns true if the hailstone sequence that starts with n is considered long and false otherwise, as described in part (b).
     Precondition: n > 0
     */
    public static boolean isLongSeq(int n) {
        if (hailstoneLength(n) > n) {
            return true;
        }
        return false;
    }

    /** Returns the proportion of the first n hailstone sequences
     that are considered long, as described in part (c).
     Precondition: n > 0
     */
    public static double propLong(int n) {
        double result = 0;
        for (int i = 1; i <= n; i++) {
            if (isLongSeq(n) == true) {
                result += 1;
            }
        }
        result = result / n;
        return result;
    }
}

