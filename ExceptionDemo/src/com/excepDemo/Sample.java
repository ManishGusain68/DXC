package com.excepDemo;

//Java program to illustrate exception propagation
//in checked exceptions  and it can be propagated
//by throws keyword ONLY
import java.io.IOException;

class Sample {

	// exception propagated to n()
	void m() throws IOException {
		// checked exception occurred
		throw new IOException("device error");
	}

	// exception propagated to p()
	void n() throws IOException {
		m();
	}

	void p() throws IOException {
		
			n();
		
	}

	public static void main(String args[])  {
		Sample obj = new Sample();
		try {
			obj.p();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("exception handled");
		}
		System.out.println("normal flow...");
	}
}
