public class StringAnalyzer {
    /** Returns a count of how many times smallStr occurs in largeStr, as
      * described in part (a)
      *
      * Precondition: largeStr is not null; smallStr is not null.
      *          The length of smallStr is less than the length of largeStr.
      */
     public static int countRepeat(String largeStr, String smallStr) {
        int count = 0;
        while (largeStr.indexOf(smallStr) != -1) {
            count++;
            largeStr = largeStr.substring(largeStr.indexOf(smallStr) + smallStr.length());
        }
        return count;
     }
  }
  