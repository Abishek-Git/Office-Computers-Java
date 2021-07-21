package com.java.office;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

@SuppressWarnings("serial")
public class HardDisk extends  ComputerNotFoundException {
	private String brand = new String();
	private LocalDate mfgDate;
	private int capaciity;
	private static ArrayList<HardDisk> hardList = new ArrayList<>();
	
	public HardDisk(String brand, int capaciity) {
		super();
		this.brand = brand;
		this.mfgDate = LocalDate.now();
		this.capaciity = capaciity;
		hardList.add(this);
	}
	
	public static ArrayList<HardDisk> getHardList() {
		return hardList;
	}


	public HardDisk() {
		super();
	}

	public String getBrand() {
		return brand;
	}
	
	

	public LocalDate getMfgDate() {
		return mfgDate;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCapaciity() {
		return capaciity;
	}

	public void setCapaciity(int capaciity) {
		this.capaciity = capaciity;
	}

	@Override
	public String toString() {
		return "HardDisk [brand=" + brand + ", mfgDate=" + mfgDate + ", capaciity=" + capaciity + "]";
	}
	
	public static ArrayList<HardDisk> compareCapacity() {
		Comparator<HardDisk> comCapacity = new Comparator<HardDisk>() {
			public int compare(HardDisk o1, HardDisk o2) {
					if (o1.getCapaciity() > o2.getCapaciity())
						return 1;
					else
						return -1;
			}
		};
		Collections.sort(hardList, comCapacity);
		return hardList;
	}
	
	public static ArrayList<HardDisk> compareBrand() {
		Comparator<HardDisk> compareBrand = new Comparator<HardDisk>() {
			public int compare(HardDisk o1, HardDisk o2) {
					return o1.getBrand().compareTo(o2.getBrand());
			}
		};
		Collections.sort(hardList, compareBrand);
		return hardList;
	}
	
	public static ArrayList<HardDisk> compareDate() {
		Comparator<HardDisk> compareDate = new Comparator<HardDisk>() {
			public int compare(HardDisk o1, HardDisk o2) {
					return o1.getMfgDate().compareTo(o2.getMfgDate());
			}
		};
		Collections.sort(hardList, compareDate);
		return hardList;
	}

	
}
