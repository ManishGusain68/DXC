package com.synchro;

public class Thread1 extends Thread {

	MatchUtils mu; // has-a relationship
	
	

	public Thread1(MatchUtils mu) {
		super();
		this.mu = mu;
	}



	public void run() {

		mu.getMultiples(5);

	}

}
