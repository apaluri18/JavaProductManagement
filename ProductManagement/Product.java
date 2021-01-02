package ProductManagement;

import java.math.BigDecimal;
import java.math.RoundingMode;

  public class  Product  implements Rateable<Product>{

    private final int id;

    private final String name;

    private final BigDecimal price;

    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

    private  Rating rating ;

    public int getId() {
        return id;
    }

   

    public String getName() {
        return name;
    }

   

    public BigDecimal getPrice() {
        return price;
    }

 

    public BigDecimal getDiscount()
    {
        return price.multiply(DISCOUNT_RATE).setScale(2,RoundingMode.HALF_DOWN);
    }

    @Override
    public Rating getRating() {
        return rating;
    }

  
@Override
   public Product applyRating(Rating newRating){
         this.rating=newRating;
         return new Product(id,name,price,newRating);
    }

@Override
public String toString() {

    return id + " " +name+ " "+price +" " +rating.getStars();
}

@Override
public boolean equals(Object obj) {

    return super.equals(obj);
}

@Override
public int hashCode() {
 
    return super.hashCode();
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
