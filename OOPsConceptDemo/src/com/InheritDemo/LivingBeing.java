package com.InheritDemo;

public class LivingBeing {

	private int numberOfLegs;
	private String name;
	private int batchNr;

	LivingBeing(int numberOfLegs, String name, int batchNr) {

		this.numberOfLegs = numberOfLegs;
		this.name = name;
		this.batchNr = batchNr;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBatchNr() {
		return batchNr;
	}

	public void setBatchNr(int batchNr) {
		this.batchNr = batchNr;
	}

}
