package com.synchro;

public class Thread2 extends Thread{
	
	MatchUtils mu;
	
	public void run(){
		mu.getMultiples(10);
	}

	public Thread2(MatchUtils mu) {
		super();
		this.mu = mu;
	}

}
