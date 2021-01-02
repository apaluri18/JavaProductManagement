package ProductManagement;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.text.NumberFormatter;

public class ProductManager {

    private Review review;
    private Product product;
    private ResourceBundle resources;
    private Locale locale;;
    private DateTimeFormatter dateFormat;
    private NumberFormat moneyFormat;
    private StringBuilder append;
    private static final String FILENAME = "/Users/anirudhpaluri/Documents/Java11/ProductManagement/data/resources.properties";


    public Product CreateProduct(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
        return new Food(id, name, price, rating, bestBefore);
    }

    public Product CreateProduct(int id, String name, BigDecimal price, Rating rating) {
        return new Drink(id, name, price, rating);
    }

    public Product reviewProduct(Product product, Rating rating, String comments) {
this.review = new Review(rating, comments);
        return product.applyRating(rating);

    }

    public ProductManager(Review review, Product product, ResourceBundle resources, Locale locale,
            DateTimeFormatter dateFormat, NumberFormat moneyFormat) {
        this.review = review;
        this.product = product;
        this.resources = resources;
        this.locale = locale;
        this.dateFormat = dateFormat;
        this.moneyFormat = moneyFormat;
    }

    public void PrintProductReport() {
        StringBuilder txt = new StringBuilder();
        if (review != null) {
            txt.append(MessageFormat.format(resources.getString("review"), review.getRating().getStars(),
                    review.getComments()));

        }

        else {

            append = txt.append(resources.getString("no.review"));
        }

        txt.append('\n');

        System.out.println(txt);
    }

    public ProductManager(Locale locale) {
        this.locale = locale;
      try {
          
        resources = ResourceBundle.getBundle("ProductManagement.data.resources", locale);
      } catch (Exception e) {
          //TODO: handle exception
          e.printStackTrace();
      }
        
       // System.out.println( resources.getBaseBundleName().isEmpty());
        dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
        moneyFormat = NumberFormat.getCurrencyInstance(locale);
    }

}
