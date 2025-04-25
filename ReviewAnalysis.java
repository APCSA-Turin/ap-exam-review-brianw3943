import java.util.ArrayList;

public class ReviewAnalysis {
    private Review[] allReviews;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public ReviewAnalysis(Review[] reviews) {
        allReviews = reviews;
    }

public double getAverageRating() {
		double rating = 0;
		for (int i = 0; i < allReviews.length; i++) {
	rating += allReviews[i].getRating();
}
rating = rating / allReviews.length;
return rating;
}


public ArrayList<String> collectComments() {
		ArrayList<String> comments = new ArrayList<String>();
		for (int i = 0; i < allReviews.length; i++) {
	String comment = allReviews[i].getComment();
	if (comment.indexOf("!") != -1) {
	String last = comment.substring(comment.length() - 1);
	if (!last.equals("!") && !last.equals(".")) {
	comment += ".";
}
comments.add(i + "-" + comment);
}
}
return comments;
}
}
