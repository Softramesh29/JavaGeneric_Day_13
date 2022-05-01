package com.bridgelabz.JavaGeneric;

public class FindMaximum_int_UC1 {
	public void findMax(int x, int y, int z) {
		int max = 0;
		if (x>=y && x>=z) {
			max = x;
			System.out.println(x+" "+y+" "+z+" "+"Maximum is : "+max);
		}	
		if (y>=x && y>=z) {
			max = y; 
			System.out.println(x+" "+y+" "+z+" "+"Maximum is : "+max);
		}
		else {
			max=z;
			System.out.println(x+" "+y+" "+z+" "+"Maximum is : "+max);
		}
	}
	public static void main(String [] args) {
		FindMaximum_int_UC1 findMaximum_int_UC1 = new FindMaximum_int_UC1();
		findMaximum_int_UC1.findMax(25, 65, 36);
	}
}

