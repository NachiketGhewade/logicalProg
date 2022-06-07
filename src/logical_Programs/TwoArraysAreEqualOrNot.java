package logical_Programs;

import java.util.Arrays;

public class TwoArraysAreEqualOrNot {

	public static void main(String[] args) {

		int a1[]= {1,2,6,5,4};
		int a2[]= {1,2,6,5,4};
		
		boolean comp = Arrays.equals(a1, a2);
		
		if(comp==true) {
			System.out.println("both arrays are equal");
		}
		else {
			System.out.println("both arrays are not equal");
		}
	}

}
