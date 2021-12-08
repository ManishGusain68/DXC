package com.synchro;

public class MatchUtils {
	int i;

	void getMultiples(int n) {
		//synchronized (this) {
			for (i = 1; i <= n; i++) {
				System.out.println(n * i);
				System.out.println(Thread.currentThread().getName());
		//	}
		}
	}

}
