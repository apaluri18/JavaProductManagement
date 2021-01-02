package shop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale;

import ProductManagement.Product;
import ProductManagement.ProductManager;
import ProductManagement.Rating;

public class Shop {
    

    public static void main(String args[]){

        ProductManager pm1 = new ProductManager(Locale.UK);
        
       Product p1 = pm1.CreateProduct(101,"Tea",BigDecimal.valueOf(1.99),Rating.NOT_RATED);
       pm1.PrintProductReport();
        /*Product p2 = pm1.CreateProduct(102,"Coffee",BigDecimal.valueOf(2.99),Rating.FOUR_STAR);
        Product p3 = pm1.CreateProduct(103,"Cake",BigDecimal.valueOf(3.99),Rating.FIVE_STAR,LocalDate.now().plusDays(4));

        Product p4 = new Product();
        Product p5 = p3.applyRating(Rating.THREE_STAR);
        Product p6 = pm1.CreateProduct(104,"Chocolate",BigDecimal.valueOf(2.99),Rating.FOUR_STAR);
        Product p7 = pm1.CreateProduct(104,"Chocolate",BigDecimal.valueOf(2.99),Rating.FIVE_STAR,LocalDate.now().plusDays(4));


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        System.out.println(p7);
        System.out.println(p6.equals(p7));*/
  
 
    }
}
