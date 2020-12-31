package ProductManagement;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Food extends Product {
    LocalDate bestBefore;

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(LocalDate bestBefore) {
        this.bestBefore = bestBefore;
    }

    public Food(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
        super(id, name, price, rating);
        this.bestBefore = bestBefore;
    }

	@Override
	public String toString() {
		return super.toString()+ "Food [bestBefore=" + bestBefore + "]";
	}
}
