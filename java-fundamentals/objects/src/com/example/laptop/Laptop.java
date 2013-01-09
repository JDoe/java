package com.example.laptop;

public class Laptop {
	
	private final String model;
	private final int size;
	//array of memory
	private Memory[] memory;
	//array of disks
	private Disk[] disks;
	private String[] applications;
	private boolean on;
	
	
	
	/**
	 * @param model
	 * @param size
	 */
	public Laptop(String model, int size) {
		this.model = model;
		this.size = size;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}


	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
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
	
	void turnOn() {
		on = true;
	}
	
	void turnOff() {
		on = false;
		//this.on = false; //to disambiguate
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + size;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (size != other.size)
			return false;
		return true;
	}
	
	

}
