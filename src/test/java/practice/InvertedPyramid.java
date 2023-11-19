package practice;

import java.util.Iterator;

public class InvertedPyramid {

	public static void main(String[] args) {
		
		System.out.println("Made changes in Asia");
		System.out.println("Made changes in Asia 2nd time");


		int k=1;
		for (int i=1;i<5;i++) {
			
			System.out.println("");
			
			for (int j = 0; j < i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
				
			}
			
		}

	}

}
