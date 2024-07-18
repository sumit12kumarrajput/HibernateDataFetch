package com.sr.fetchHibernateData;

import java.util.jar.Attributes.Name;

import javax.persistence.Embeddable;
import javax.persistence.Id;


@Embeddable
public class Student {
	@Id
	private int id;
	private String Sec;
	private String name;
	private Laptop laptop;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSec() {
		return Sec;
	}
	public void setSec(String sec) {
		Sec = sec;
	}
	
	
	
}
