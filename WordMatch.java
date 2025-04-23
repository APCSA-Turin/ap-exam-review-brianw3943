public class WordMatch {

    private String secret;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public WordMatch(String word) {
        secret = word;
    }

    public int scoreGuess(String guess) {
        // TYPE UP YOUR PART A CODE HERE
        // then test with WordMatchTester
	    int count = 0;
	    for (int i = 0; i <= secret.length() - guess.length(); i++) {
		    String temp = secret.substring(i, i + guess.length());
		    if (temp.equals(guess)) {
	            count++;
            }
        }
        return count * guess.length() * guess.length();
    }

    public String findBetterGuess(String guess1, String guess2) {
        // TYPE UP YOUR PART B CODE HERE
        // then test with WordMatchTester
        if (scoreGuess(guess1) > scoreGuess(guess2)) {
            return guess1;
        } else if (scoreGuess(guess2) > scoreGuess(guess1)) {
            return guess2;
        } else if (guess1.compareTo(guess2) > 0) {
            return guess1;
        } else {
            return guess2;
        }
    }
}
