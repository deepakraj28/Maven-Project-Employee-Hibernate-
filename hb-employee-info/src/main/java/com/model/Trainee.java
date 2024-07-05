package com.model;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
@Entity
@DiscriminatorValue(value="Trainee")
public class Trainee extends Employee {
	float payperhour;
	String contractperiod;
	public Trainee(float payperhour, String contractperiod, String name) {
		super(name);
		this.payperhour = payperhour;
		this.contractperiod = contractperiod;
	}
	public float getPayperhour() {
		return payperhour;
	}
	public void setPayperhour(float payperhour) {
		this.payperhour = payperhour;
	}
	public String getContractperiod() {
		return contractperiod;
	}
	public void setContractperiod(String contractperiod) {
		this.contractperiod = contractperiod;
	}
	

}
