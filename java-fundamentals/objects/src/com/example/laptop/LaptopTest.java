package com.example.laptop;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LaptopTest {

	@Test
	public void test() {

		//Memory[] memory = {new Memory(8, "DIMM"), new Memory(8, "DIMM") }; //2 mem chips
		Memory m1 = new Memory(8, "DIMM"), m2 = new Memory(8, "DIMM");
		assertFalse(m1 == m2);
		assertTrue(m1.equals(m2));

		Memory[] memory = {m1 , m2};


		Disk[] disks = {new Disk(512, "SATA") };
		
		
		Laptop lappy = new Laptop("Mac Pro", 15);

		//needed because these are made mutable for a laptop
		lappy.setMemory(memory);
		lappy.setDisks(disks);
		
		lappy.turnOn();

		LaptopBag bag = new LaptopBag(15);
		
		bag.insertLaptop(lappy);
		
		System.out.println(bag);
		

		
		//Memory[] mems = new Memory[2];
		//mems[0] = new Memory();
		//mems[1] = new Memory();
		//Memory[] mems2 = { new Memory(), new Memory() };
		//Memory m = new Memory();
		//Disk d = new Disk();
		
		// Create a laptop with useful properties
		
		////Laptop lappy = new Laptop("Mac Pro", 15);
		//lappy.model = "Mac Pro";
		//lappy.setModel("Mac Pro");
		//lappy.size = 15;
		//lappy.setSize(15);
		
		////Memory[] memory = {new Memory(8, "DIMM"), new Memory(8, "DIMM") }; //2 mem chips
		//memory[0].setSize(8); //GB
		//memory[0].setType("DIMM");
		//memory[1].setSize(8); //GB
		//memory[1].setType("DIMM");	
		//memory[1].size = 8; //GB
		//memory[1].type = "DIMM";
		////lappy.setMemory(memory);
		
		////Disk[] disks = {new Disk(512, "SATA") };
		//disks[0].size = 521;
		//disks[0].setSize(521);
		
		//disks[0].type = "SATA";
		//disks[0].setType("SATA");
		////lappy.setDisks(disks);
		
		////lappy.turnOn();
		//lappy.on = true;
		
		////LaptopBag bag = new LaptopBag(15);
		
		//bag.size=15;//made private..cannot access directly
		//bag.setSize(15); //corresponds to the above
		//bag.getSize(); // there is no need for this
						// don't introduce the code you don't need
		
		//bag.laptop = lappy;//made private..cannot access directly
		////bag.insertLaptop(lappy);
		
		////System.out.println(bag);
		
		
	}
	
	
	
	

}
