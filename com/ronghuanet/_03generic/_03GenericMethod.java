package com.ronghuanet._03generic;

public class _03GenericMethod {
	/**
	 * 	将2个数组融合
	 */
	public static <T> void merge(T[] a,T[] b) {
		
	}
	public static void main(String[] args) {
		Integer[] a = new Integer[] {1,2,3};
		Integer[] b = new Integer[] {1,2,3};
		// The method merge(T[], T[]) 
		// in the type _03GenericMethod is 
		// not applicable for the arguments (int[], int[])
		_03GenericMethod.merge(a, b);
		
		String[] a1 = new String[3] ;
		String[] b1 = new String[3] ;
		
		_03GenericMethod.merge(a1, b1);
	}
}
