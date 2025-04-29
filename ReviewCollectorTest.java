import java.util.ArrayList;
import java.util.Arrays;

public class ReviewCollectorTest {
    public static void main(String[] args) {
        ProductReview p1 = new ProductReview("apple pie", "this is the best");
        ProductReview p2 = new ProductReview("pizza", "love this stuff");
        ProductReview p3 = new ProductReview("apple pie", "best apple pie");
        ProductReview p4 = new ProductReview("cake", "BEST cake in the world");
        ProductReview p5 = new ProductReview("hamburger", "They Have The Best Burger");
        ProductReview p6 = new ProductReview("pizza", "it tastes like asbestos");
        ProductReview p7 = new ProductReview("coffee", "me and java are besties");
        ProductReview p8 = new ProductReview("cake", "The best cake in town");
        ProductReview p9 = new ProductReview("pizza", "slice is the best");
        ProductReview p10 = new ProductReview("apple pie", "absolutelythebest!");
        ArrayList<ProductReview> reviews = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));
        ReviewCollector rc = new ReviewCollector();

        System.out.println("------ Testing part (a): addReview ------");
        for (ProductReview p : reviews) {
            rc.addReview(p);
        }
        if (rc.reviewList.contains(p1) && rc.reviewList.contains(p2) && rc.reviewList.contains(p3)
                && rc.reviewList.contains(p4) && rc.reviewList.contains(p5) && rc.reviewList.contains(p6)
                && rc.reviewList.contains(p7) && rc.reviewList.contains(p8) && rc.reviewList.contains(p9)
                && rc.reviewList.contains(p10) && rc.reviewList.size() == 10) {
            System.out.println("PART A TEST 1 PASSED");
        } else {
            System.out.println("!!!!!! PART A TEST 1 FAILED: reviewList should contain each of the 10 ProductReview objects in the test code");
            System.exit(0);
        }

        if (rc.productList.size() == 5 && rc.productList.contains("apple pie") && rc.productList.contains("pizza")
                && rc.productList.contains("cake") && rc.productList.contains("hamburger") && rc.productList.contains("coffee")) {
            System.out.println("PART A TEST 2 PASSED");
        } else {
            System.out.println("!!!!!! PART A TEST 2 FAILED: productList should contain 5 strings: [apple pie ,pizza, cake, hamburger, coffee] in any order");
            System.out.println("                             your productList contains: " + rc.productList);
            System.exit(0);
        }
        System.out.println("\n------ Testing part (b): getNumGoodReviews ------");
        int goodReviews1 = rc.getNumGoodReviews("apple pie");
        if (goodReviews1 == 3) {
            System.out.println("PART B TEST 1 PASSED");
        } else {
            System.out.println("!!!!!! PART B TEST 1 FAILED: getNumGoodReviews for 'apple pie' should return 3, your method returns " + goodReviews1);
            System.exit(0);
        }
        int goodReviews2 = rc.getNumGoodReviews("pizza");
        if (goodReviews2 == 2) {
            System.out.println("PART B TEST 2 PASSED");
        } else {
            System.out.println("!!!!!! PART B TEST 2 FAILED: getNumGoodReviews for 'pizza' should return 2, your method returns " + goodReviews2);
            System.exit(0);
        }
        int goodReviews3 = rc.getNumGoodReviews("cake");
        if (goodReviews3 == 1) {
            System.out.println("PART B TEST 3 PASSED");
        } else {
            System.out.println("!!!!!! PART B TEST 3 FAILED: getNumGoodReviews for 'cake' should return 1, your method returns " + goodReviews3);
            System.exit(0);
        }
        int goodReviews4 = rc.getNumGoodReviews("hamburger");
        if (goodReviews4 == 0) {
            System.out.println("PART B TEST 4 PASSED");
        } else {
            System.out.println("!!!!!! PART B TEST 4 FAILED: getNumGoodReviews for 'hamburger' should return 0, your method returns " + goodReviews4);
            System.exit(0);
        }
        int goodReviews5 = rc.getNumGoodReviews("coffee");
        if (goodReviews5 == 1) {
            System.out.println("PART B TEST 5 PASSED");
        } else {
            System.out.println("!!!!!! PART B TEST 5 FAILED: getNumGoodReviews for 'coffee' should return 1, your method returns " + goodReviews5);
            System.exit(0);
        }
        int goodReviews6 = rc.getNumGoodReviews("fruit salad");
        if (goodReviews6 == 0) {
            System.out.println("PART B TEST 6 PASSED");
        } else {
            System.out.println("!!!!!! PART B TEST 6 FAILED: getNumGoodReviews for 'fruit salad' should return 0, your method returns " + goodReviews6);
            System.exit(0);
        }
    }
}
