package com.java.office;


import java.util.ArrayList;

@SuppressWarnings("serial")
public class Computer extends HardDisk implements IOfficeServiceProvider {
	private  static long serialTempNo = 1082793790;
	private long serialNo;
	private String brand = new String();
	private String series = new String();
	private int storage;
	private String os = new String();
	private HardDisk cpuManufacturer;
	private static ArrayList<Computer> computerList = new ArrayList<>();
	private static ArrayList<Computer> findComputerList = new ArrayList<>();;
	private static Computer findComputer;
	
	public Computer(String brand, String series, int storage, String os,
			HardDisk cpuManufacturer) {
		super();
		this.serialNo = serialTempNo++;
		this.brand = brand;
		this.series = series;
		this.storage = storage;
		this.os = os;
		this.cpuManufacturer = cpuManufacturer;
		computerList.add(this);
	}
	
	public Computer() {
		super();
	}

	
	
	public long getSerialNo() {
		return serialNo;
	}

	public static ArrayList<Computer> getComputerList() {
		return computerList;
	}

	public static void setComputerList(ArrayList<Computer> computerList) {
		Computer.computerList = computerList;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}

	public int getStorage() {
		return storage;
	}
	public void setRam(int ram) {
		this.storage = ram;
	}

	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}

	public HardDisk getCpuManufacturer() {
		return cpuManufacturer;
	}
	public void setCpuManufacturer(HardDisk cpuManufacturer) {
		this.cpuManufacturer = cpuManufacturer;
	}
	
	public static Computer searchComputer(long serialNo) throws ComputerNotFoundException {
		findComputer = null;
		String msg;
		boolean boolfindCompFlag = false;
		for(Computer comp:computerList) {
			if(comp.serialNo == serialNo) {
				findComputer = comp;
				boolfindCompFlag = true;
			}
		}
		if(boolfindCompFlag)
			return findComputer;
		else {
			msg = "Serial No: " + serialNo + " is not found";
			throw new ComputerNotFoundException(msg);
		}
	}
	
	public static ArrayList<Computer> searchComputer(String brand) throws ComputerNotFoundException {
		findComputerList.clear();
		String msg;
		boolean boolfindCompBrandFlag = false;
		for(Computer comp1:computerList) {
			if(comp1.brand == brand) {
				findComputerList.add(comp1);
				boolfindCompBrandFlag = true;
			}
		}
		if(boolfindCompBrandFlag) {
			return findComputerList;
		}
		else {
			msg = "Brand: " + brand + " is not found";
			throw new ComputerNotFoundException(msg);
		}		
	}
	
//	public static String updateComputer(long serialNo, Computer updateComp) throws ComputerNotFoundException {
//		findComputer = null;
//		String msg;
//		boolean boolfindCompFlag = false;
//		for(Computer comp:computerList) {
//			if(comp.serialNo == serialNo) {
//				findComputer = comp;
//				boolfindCompFlag = true;
//				computerList.remove(comp);
//				break;
//			}
//		}
//		if(boolfindCompFlag) {
//			computerList.add(updateComp);
//			return "computer added sucessfully";
//		}
//		else {
//			msg = "Serial No: " + serialNo + " is not found";
//			throw new ComputerNotFoundException(msg);
//		}
//	}
	
	
		
		public static String deleteComputer(long serialNo) throws ComputerNotFoundException {
			String msg;
			boolean boolfindCompFlag = false;
			for(Computer comp:computerList) {
				if(comp.serialNo == serialNo) {
					boolfindCompFlag = true;
					computerList.remove(comp);
					break;
				}
			}
			if(boolfindCompFlag) {
				return "computer Removed sucessfully";
				
			}
			else {
				msg = "Serial No: " + serialNo + " is not found";
				throw new ComputerNotFoundException(msg);
			}
		}	

	@Override
	public String toString() {
		return "Computer [serialNo=" + serialNo + ", brand=" + brand + ", series=" + series + ", storage=" + storage
				+ ", os=" + os + ", cpuManufacturer=" + cpuManufacturer + "]";
	}
}
