
 package com.pizzamanagement.service;

import com.pizzamanagement.model.Pizza;

public interface PizzaService {
	
	void addPizza(Pizza Pizza);
	
	void updatePizza(Pizza Pizza);
	
	void deletePizza(Pizza Pizza);
	
	Pizza findPizzaByNo(int id);

}

    
