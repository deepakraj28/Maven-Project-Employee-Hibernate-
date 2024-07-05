package com.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.persistence.Inheritance;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;


@Entity
@Table(name="EmpData")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="category", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="general")

public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	public Employee()
	{
		
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(String name) {
		super();
	this.name=name;
	}
}

