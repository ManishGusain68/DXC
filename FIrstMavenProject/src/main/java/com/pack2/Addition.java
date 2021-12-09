package com.pack2;

public class Addition {

	private int x;
	private int y;

	public Addition(double x, double y) {
		super();
		this.x = (int) x;
		this.y = (int) y;
		System.out.println("double double constructor");
	}

	public Addition(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("int int constructor");
	}

	public Addition(String x, String y) {
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);

		System.out.println("Stirng String constructor");
	}

	public void add() {
		System.out.println(x + y);
	}

}
