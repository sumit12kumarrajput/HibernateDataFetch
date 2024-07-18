package com.sr.fetchHibernateData;

import javax.persistence.Embeddable;

@Embeddable
public class Laptop {
	private int Lid;
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	@Override
	public String toString() {
		return "Laptop [Lid=" + Lid + ", Lname=" + Lname + "]";
	}
	private String Lname;

}
