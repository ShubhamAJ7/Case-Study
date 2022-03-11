package com.pizzamanagement.Dao;
import javax.persistence.EntityManager;

import com.pizzamanagement.model.Pizza;

public class PizzaDaoImpl implements PizzaDao {

	private EntityManager entityManager;

	public PizzaDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Pizza getPizzaByNo(int id) {
		Pizza Pizza = entityManager.find(Pizza.class, id);
		return Pizza;
	}

	@Override
	public void addPizza(Pizza Pizza) {
	
		entityManager.persist(Pizza);
		
	}

	@Override
	public void updatePizza(Pizza Pizza) {
		entityManager.merge(Pizza);

	}

	@Override
	public void deletePizza(Pizza Pizza) {
		entityManager.remove(Pizza);

	}

	@Override
	public void commitTransaction() {
	entityManager.getTransaction().commit();
	}

	@Override
	public void beginTransaction() {
	entityManager.getTransaction().begin();
	}

}