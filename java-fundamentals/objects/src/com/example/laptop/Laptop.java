package com.example.laptop;

public class Laptop {

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
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
	 * @return the memory
	 */
	public Memory[] getMemory() {
		return memory;
	}

	/**
	 * @param memory the memory to set
	 */
	public void setMemory(Memory[] memory) {
		this.memory = memory;
	}

	/**
	 * @return the disks
	 */
	public Disk[] getDisks() {
		return disks;
	}

	/**
	 * @param disks the disks to set
	 */
	public void setDisks(Disk[] disks) {
		this.disks = disks;
	}

	/**
	 * @return the applications
	 */
	public String[] getApplications() {
		return applications;
	}

	/**
	 * @param applications the applications to set
	 */
	public void setApplications(String[] applications) {
		this.applications = applications;
	}

	private String model;
	private int size;
	private Memory[] memory;
	private Disk[] disks;
	private String[] applications;
	private boolean on;
	
	void turnOn() {
		on = true;
	}
	
	void turnOff() {
		on = false;
		//this.on = false; //to disambiguate
	}

}
