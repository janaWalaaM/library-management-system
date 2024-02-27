package booklibrary;

public class Reviews {
    private String review;
    private int rating;

    public Reviews() {
    }

    public Reviews(String review, int rating) {
        this.review = review;
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Reviews{" + "review=" + review + ", rating=" + rating + '}';
    }
    
}
