package ProductManagement;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {

    private int id;

    private String name;

    private BigDecimal price;

    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

    private Rating rating ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
       if (price != null) {
        this.price = price; 
       }
       else
        this.price = BigDecimal.ONE;

        
    }

    public BigDecimal getDiscount()
    {
        return price.multiply(DISCOUNT_RATE).setScale(2,RoundingMode.HALF_DOWN);
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product(int id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = Rating.NOT_RATED;
    }

    public Product() {

         this.id = 0;
        this.name = "no Value";
        this.price = BigDecimal.valueOf(0);
        this.rating = Rating.NOT_RATED;
    }

}
