package ProductManagement;

public class Review {
    private Rating rating;
    private Review comments;



    public Rating getRating() {
        return rating;
    }

 

    public Review getComments() {
        return comments;
    }

    public Review(Rating rating, Review comments) {
        this.rating = rating;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Review [comments=" + comments + ", rating=" + rating + "]";
    }



}
