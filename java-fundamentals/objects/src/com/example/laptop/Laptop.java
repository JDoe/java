package com.example.laptop;

import java.util.List;
import java.util.Set;

public class Laptop {
	
	private final String model;
	private final int size;
	//array of memory
	//private Memory[] memory;
	//array of disks
	//private Disk[] disks;
	/* replace with collections
	 * 
	 */
	//private Storage[] storage;
	private List<Storage> storage;
	//private String[] applications;
	private Set<String> applications;
	private boolean on;
	
	
	/**
	 * @param model
	 * @param size
	 */
	public Laptop(String model, int size, List<Storage> storage) {
		this.model = model;
		this.size = size;
		this.storage = storage;
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


	public List<Storage> getStorage() {
		return storage;
	}



	public void setStorage(List<Storage> storage) {
		this.storage = storage;
	}



	/**
	 * @return the applications
	 */
	public Set<String> getApplications() {
		return applications;
	}

	/**
	 * @param applications the applications to set
	 */
	public void setApplications(Set<String> applications) {
		this.applications = applications;
	}
	
	void turnOn() {
		on = true;
	}
	
	void turnOff() {
		on = false;
		//this.on = false; //to disambiguate
	}

    //compute total storage
	public int totalStorage() {
		int sum = 0;
		for (Storage s : storage) {
			sum += s.getSize();
		}
		return sum;
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
