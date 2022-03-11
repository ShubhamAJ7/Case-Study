package com.pizzamanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PizaAStore")
public class Pizza {
	
	@Id
	private int pizzaNo;
    private int pizzaPrice;
	@Column(length=15)
	private String pizzaType;
	@Column(length=15)
	private String DileveryAdd;
	 /**
     * @return int return the pizzaNo
     */
    public int getpizzaNo() {
        return pizzaNo;
    }

    /**
     * @param pizzaNo the pizzaNo to set
     */
    public void setpizzaNo(int pizzaNo) {
        this.pizzaNo = pizzaNo;
    }

    /**
     * @return int return the pizzaPtice
     */
    public int getPizzaPtice() {
        return pizzaPrice;
    }

    /**
     * @param pizzaPtice the pizzaPtice to set
     */
    public void setPizzaPtice(int pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    /**
     * @return String return the pizzaType
     */
    public String getPizzaType() {
        return pizzaType;
    }

    /**
     * @param pizzaType the pizzaType to set
     */
    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    /**
     * @return String return the DileveryAdd
     */
    public String getDileveryAdd() {
        return DileveryAdd;
    }

    /**
     * @param DileveryAdd the DileveryAdd to set
     */
    public void setDileveryAdd(String DileveryAdd) {
        this.DileveryAdd = DileveryAdd;
    }

	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	public Pizza(int pizzaNo, String pizzaType, int pizzaPrice, String DileveryAdd) {
		super();
		this.pizzaNo = pizzaNo;
		this.pizzaType = pizzaType;
		this.pizzaPrice = pizzaPrice;
		this.DileveryAdd = DileveryAdd;
	}
	@Override
	public String toString() {
		return "Employee [pizzaNo=" + pizzaNo + ", pizzaType=" + pizzaType + ", pizzaPrice=" + pizzaPrice + ", DileveryAdd=" + DileveryAdd + "]";
	}
	
	


}
	