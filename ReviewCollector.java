import java.util.ArrayList;

public class ReviewCollector {
    // NOTE: these instance variables were made public to enable test code
    public ArrayList<ProductReview> reviewList;
    public ArrayList<String> productList;

    /** Constructs a ReviewCollector object and initializes the instance variables. */
    public ReviewCollector() {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    }

    /** Adds a new review to the collection of reviews, as described in part (a). */
    public void addReview(ProductReview prodReview) {
        reviewList.add(prodReview);
        if (productList.contains(prodReview.getName()) == false) {
            productList.add(prodReview.getName());
        }
    }

    /** Returns the number of good reviews for a given product name, as described in part (b). */
    public int getNumGoodReviews(String prodName) {
        int count = 0;
        ArrayList<ProductReview> list = new ArrayList<ProductReview>();
        for (ProductReview review : reviewList) {
            if (review.getName().equals(prodName)) {
                list.add(review);
            }
            if (review.getReview().contains("best")) {
                count++;
            }
        }
        return count;
    }
}
