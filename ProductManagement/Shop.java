package ProductManagement;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Shop {
    

    public static void main(String args[]){

        Product p1 = new Product(101,"Tea",BigDecimal.valueOf(1.99));
        Product p2 = new Drink(102,"Coffee",BigDecimal.valueOf(2.99),Rating.FOUR_STAR);
        Product p3 = new Food(103,"Cake",BigDecimal.valueOf(3.99),Rating.FIVE_STAR,LocalDate.now().plusDays(4));

        Product p4 = new Product();
        Product p5 = p3.applyRating(Rating.THREE_STAR);


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
  
 
    }
}
