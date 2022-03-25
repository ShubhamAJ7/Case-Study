package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sbrestjpa")
public class Mobile {

	@Id
	@Column(name = "eid", length = 10)
	private int mobId;
	@Column(name = "ename", length = 15)
	private String mobName;
	@Column(name = "esal", length = 10)
	private int mobPrice;
	@Column(name = "eadd", length = 15)
	private String mobType;

	public int getMobId() {
		return mobId;
	}

	public void setMobId(int mobId) {
		this.mobId = mobId;
	}

	public String getMobName() {
		return mobName;
	}

	public void setMobName(String mobName) {
		this.mobName = mobName;
	}

	public int getMobPrice() {
		return mobPrice;
	}

	public void setMobPrice(int mobPrice) {
		this.mobPrice = mobPrice;
	}

	public String getMobType() {
		return mobType;
	}

	public voidsetMobType(String mobType) {
		this.mobType = mobType;
	}

	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public Mobile(int mobId, String mobName, int mobPrice, String mobType) {
		super();
		this.mobId = mobId;
		this.mobName = mobName;
		this.mobPrice = mobPrice;
		this.mobType = mobType;
	}

	@Override
	public String toString() {
		return "Mobile [mobId=" + mobId + ", mobName=" + mobName + ", mobPrice=" + mobPrice + ", mobType=" + mobType + "]";
	}

}
