package practice;

import java.util.Iterator;

public class InvertedPyramid {

	public static void main(String[] args) {


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
