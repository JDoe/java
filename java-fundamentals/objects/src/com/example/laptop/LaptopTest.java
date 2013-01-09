package com.example.laptop;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LaptopTest {

	@Test
	public void test() {
		
		//Memory[] mems = new Memory[2];
		//mems[0] = new Memory();
		//mems[1] = new Memory();
		//Memory[] mems2 = { new Memory(), new Memory() };
		//Memory m = new Memory();
		//Disk d = new Disk();
		
		// Create a laptop with useful properties
		
		Laptop lappy = new Laptop();
		//lappy.model = "Mac Pro";
		lappy.setModel("Mac Pro");
		//lappy.size = 15;
		lappy.setSize(15);
		
		Memory[] memory = {new Memory(), new Memory() }; //2 mem chips
		memory[0].size = 8; //GB
		memory[0].type = "DIMM";
		memory[1].size = 8; //GB
		memory[1].type = "DIMM";		
		lappy.setMemory(memory);
		
		Disk[] disks = {new Disk() };
		//disks[0].size = 521;
		disks[0].setSize(521);
		
		//disks[0].type = "SATA";
		disks[0].setType("SATA");
		lappy.setDisks(disks);
		
		lappy.turnOn();
		//lappy.on = true;
		
		LaptopBag bag = new LaptopBag();
		
		//bag.size=15;//made private..cannot access directly
		bag.setSize(15); //corresponds to the above
		//bag.getSize(); // there is no need for this
						// don't introduce the code you don't need
		
		//bag.laptop = lappy;//made private..cannot access directly
		bag.insertLaptop(lappy);
		
		System.out.println(bag);
		
		
	}
	
	
	
	

}
