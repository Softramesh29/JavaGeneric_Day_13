package com.bridgelabz.JavaGeneric;

public class Refactor1_GenericMethod {
	public <T extends Comparable<T>> void findMax(T x, T y, T z) {
		T max;
		if ( x.compareTo(y) > 0 && x.compareTo(z) > 0 ) {
			max = x;
			System.out.println(x+" "+y+" "+z+" "+"Maximum is : "+max);
		}	
		if (y.compareTo(x) > 0 && y.compareTo(z) > 0) {
			max = y;
			System.out.println(x+" "+y+" "+z+" "+"Maximum is : "+max);
		}
		else {
			System.out.println(x+" "+y+" "+z+" "+"Maximum is : "+z);
		}
	}
	public static void main(String[] args) {
		Refactor1_GenericMethod input = new Refactor1_GenericMethod();
		input.findMax((int) 5, (int) 8, (int) 9);
		input.findMax((float) 45.2545, (float) 6.458, (float) 78.258);
		input.findMax((String) "Apple", (String) "Banana", (String) "Tomato");
	}
}	
