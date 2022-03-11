package com.pizzamanagement.service;



import com.pizzamanagement.Dao.PizzaDao;
import com.pizzamanagement.Dao.PizzaDaoImpl;
import com.pizzamanagement.model.Pizza;



public class PizzaServiceImpl implements PizzaService {

	
	private PizzaDao dao;
	 
	public PizzaServiceImpl()
	{
		dao= new PizzaDaoImpl();
	}
	 
	@Override
	public void addPizza(Pizza Pizza) {
		
		   dao.beginTransaction();
            dao.addPizza(Pizza);
            dao.commitTransaction();
		
	}

	@Override
	public void updatePizza(Pizza Pizza) {
		dao.beginTransaction();
		dao.updatePizza(Pizza);
		dao.commitTransaction();
		
	}

	@Override
	public void deletePizza(Pizza Pizza) {
	dao.beginTransaction();
	dao.deletePizza(Pizza);
	dao.commitTransaction();
		
	}

	@Override
	public Pizza findPizzaByNo(int id) {
		//no need of transaction, it read option only
		Pizza Pizza=dao.getPizzaByNo(id);
		return Pizza;
	}

   

}