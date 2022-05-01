package com.bridgelabz.JavaGeneric;

public class FindMaximum_String_UC3 {
	public void findMax(String x, String y, String z) {
		String max;
		if (x.compareTo(y) > 0 && x.compareTo(z) > 0 ) {
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
	public static void main(String [] args) {
		FindMaximum_String_UC3 findMaximum_String_UC3 = new FindMaximum_String_UC3();
		findMaximum_String_UC3 .findMax("apple", "banana", "tomato");
	}
}
