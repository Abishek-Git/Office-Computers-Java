package com.java.office;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Office extends Computer {
	private ArrayList<Computer> officeComputers;
	private int totalEmployees;
	private String officeName;
	private String city;
	
	
	public Office(ArrayList<Computer> officeComputers, int totalEmployees, String officeName, String city) {
		super();
		this.officeComputers = officeComputers;
		this.totalEmployees = totalEmployees;
		this.officeName = officeName;
		this.city = city;
	}

	public Office() {
		super();
	}

	public ArrayList<Computer> getOfficeComputers() {
		return officeComputers;
	}

	public void setOfficeComputers(ArrayList<Computer> officeComputers) {
		this.officeComputers = officeComputers;
	}

	public int getTotalEmployees() {
		return totalEmployees;
	}

	public void setTotalEmployees(int totalEmployees) {
		this.totalEmployees = totalEmployees;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Office [officeComputers=" + officeComputers + ", totalEmployees=" + totalEmployees + ", officeName="
				+ officeName + ", city=" + city + "]";
	}
	
	
	
	
}
