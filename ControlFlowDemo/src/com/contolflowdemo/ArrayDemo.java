package com.contolflowdemo;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 3 }; // 1D array

		// System.out.println(arr[2]);

		int arr1[][] = { { 2, 4, 3 }, { 4, 1, 6 }, { 7, 8, 3 } }; // 2D array

		

//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr1.length; j++) {
//				System.out.print(arr1[i][j]+ " ");
//			}
//			System.out.println();
//		}
		
		for(int[] i:arr1){
			for(int j:i){
				System.out.print(j+" ");
			}
			System.out.println();
		}

		
		
		
		int arr2[][][] = { { { 2, 4, 3 }, { 4, 1, 6 }, { 7, 8, 3 } }, { { 5, 1, 0 }, { 4, 1, 1 }, { 9, 2, 7 } } };

		

	}

}
