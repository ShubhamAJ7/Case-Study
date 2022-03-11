package  com.pizzamanagement.Dao;

import com.pizzamanagement.model.Pizza;

public interface PizzaDao {
	
	Pizza getPizzaByNo(int id);
	
	void addPizza(Pizza Pizza);
	
	void updatePizza(Pizza Pizza);
	
	void deletePizza(Pizza Pizza);
	
	void commitTransaction();
	
	void beginTransaction();
	
	

}