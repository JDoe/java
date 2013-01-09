package com.example.laptop;
public class LaptopBag {
	private int size;
	private Laptop laptop; //private makes laptop local so that the field cannot be accessed directly
	
	void insertLaptop(Laptop laptop) {
		//TODO: check
		//	- laptop isn't too big
		//	- bag doesn't contain a laptop		
	
		if (laptop.getSize() > size) {
			throw new IllegalArgumentException("laptop is too big");
		}
		
		
		if (this.laptop !=null) {
			throw new IllegalStateException("bag already contains laptop");
		}
		
		this.laptop = laptop;
		
		
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the laptop
	 */
	public Laptop getLaptop() {
		return laptop;
	}

	/**
	 * @param laptop the laptop to set
	 */
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
}