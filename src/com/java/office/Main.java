package com.java.office;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		HardDisk amd = new HardDisk("AMD", 8);
		HardDisk intel = new HardDisk("Intel", 16);
		HardDisk evga = new HardDisk("EVGA", 4);
		HardDisk corsair = new HardDisk("Corsair", 8);
		System.out.println(HardDisk.compareDate());
		
		
		ArrayList<HardDisk> capacity = new ArrayList<>();
		capacity = HardDisk.compareCapacity();
		for(HardDisk a:capacity) {
			System.out.println(a.getBrand() + "\t" + a.getCapaciity() + "\t" + a.getMfgDate() );
		}
		
		System.out.println("--------------------------------------------------------------");
		
		
		ArrayList<HardDisk> brandName = new ArrayList<>();
		brandName = HardDisk.compareBrand();
		for(HardDisk a:brandName) {
			System.out.println(a.getBrand() + "\t" + a.getCapaciity() + "\t" + a.getMfgDate() );
		}

		
		new Computer("HP", "HP Horizon 11", 1000, "Windows 11", intel);
		new Computer("HP", "HP turbo", 1024, "Windows 10", amd);
		new Computer("Avita", "Avita book-2", 512, "Windows 8", evga);
		new Computer("Rog", "ROG extreme", 2048, "Windows 10", corsair);
		
		
		try {
			System.out.println(Computer.searchComputer(1082793790));
		} catch (ComputerNotFoundException e) {
			System.out.println(e.getMsg());
		}
		
		
	
		try {
			ArrayList<Computer> tempList = Computer.searchComputer("Microsoft");
			for(Computer b: tempList)
				System.out.println(b.getSerialNo() + "\t" + b.getBrand() + "\t" + b.getSeries() + "\t" + b.getStorage() + "\t" + b.getOs() + "\t" + b.getCpuManufacturer().getBrand());
		} catch (ComputerNotFoundException e) {
			System.out.println(e.getMsg());
		}
		
		
		try {
			ArrayList<Computer> tempList = Computer.searchComputer("HP");
			for(Computer b: tempList)
				System.out.println(b.getSerialNo() + "\t" + b.getBrand() + "\t" + b.getSeries() + "\t" + b.getStorage() + "\t" + b.getOs() + "\t" + b.getCpuManufacturer().getBrand());
		} catch (ComputerNotFoundException e) {
			System.out.println(e.getMsg());
		}
		
		
		try {
			System.out.println(Computer.searchComputer(108279370));
		} catch (ComputerNotFoundException e) {
			System.out.println(e.getMsg());
		}
		
//		Update operation
		
		
		Computer updateCom;
		try {
			updateCom = Computer.searchComputer(1082793791);
			updateCom.setSeries("HP turbo +");
			updateCom.setCpuManufacturer(evga);
		} catch (ComputerNotFoundException e) {
			System.out.println(e.getMsg());
		}
		
	
		
		System.out.println("-----------------After updated----------------------------");
		
		
		try {
			ArrayList<Computer> tempList = Computer.searchComputer("HP");
			for(Computer b: tempList)
				System.out.println(b.getSerialNo() + "\t" + b.getBrand() + "\t" + b.getSeries() + "\t" + b.getStorage() + "\t" + b.getOs() + "\t" + b.getCpuManufacturer().getBrand());
		} catch (ComputerNotFoundException e) {
			System.out.println(e.getMsg());
		}
		
		System.out.println("------------------------All computers----------------------------------------");
		
	
			ArrayList<Computer> totalList = Computer.getComputerList();
			for(Computer b: totalList)
				System.out.println(b.getSerialNo() + "\t" + b.getBrand() + "\t" + b.getSeries() + "\t" + b.getStorage() + "\t" + b.getOs() + "\t" + b.getCpuManufacturer().getBrand());
	
//		Delete operation
		
		try {
			System.out.println(Computer.deleteComputer(1082793793));
		} catch (ComputerNotFoundException e) {
			System.out.println(e.getMsg());
		}
		
//		Adding computers to office
		
		Office css= new Office(Computer.getComputerList(), 20, "CSS Corp", "Chennai");
		System.out.println(css.toString());
		


	}
}
