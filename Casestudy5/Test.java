package com.pizzamanagement.Ui;

import com.pizzamanagement.model.Pizza;
import com.pizzamanagement.service.PizzaService;
import com.pizzamanagement.service.PizzaServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		PizzaService service= new PizzaServiceImpl();
		
		Pizza Pizza= new Pizza(13, "VEG", 500, "Dominoz");
//		
	service.addPizza(Pizza);
	
		
		//added one record to the table
		
		Pizza=service.findPizzaByNo(13);	System.out.println("id:" +Pizza.getpizzaNo());
		System.out.println("name :"+Pizza.getPizzaType());
	System.out.println("salary :"+Pizza.getPizzaPtice());
		
//update
		
//		Pizza.setEname("tarun");
//		Pizza.setEadd("hyd");
//		Pizza.setEsal(20000);
//		
//		service.updatePizza(Pizza);
//		
//		 Pizza=service.findPizzaByNo(111);
//		System.out.println("updated id:"+Pizza.getEname());
//		System.out.println("updated id:"+Pizza.getEadd());
//		System.out.println("updated id:"+Pizza.getEsal());
		
		
//delete
//		service.deletePizza(Pizza);
//	System.out.println("end of program");
		
	}
}