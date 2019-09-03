package a1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);


		int count = scan.nextInt();
		
		/*
		 * create catalog lists
		 * */
		String[] catalogName = new String[count];
		double[] catalogPrice = new double[count];
		for(int i = 0; i<count; i++) {
			catalogName[i] = scan.next();
			catalogPrice[i] = scan.nextDouble();
		}
		/* 
		 * customer info 
		 * */
		int custNum = scan.nextInt();
		
		int itemNum;
		String itemName;
		int itemCount;
		
		int[] catalogCount = new int[count];
		int[] custCount = new int[count];
		int[] custItemCount = new int[count];
		for(int i = 0; i < count; i++) {
			catalogCount[i]=0;
			custCount[i]=0;
		}
		
		/* scan in specific customer info*/
		for(int i = 0; i < custNum; i++) {
			
			scan.next(); scan.next();
			
			itemNum = scan.nextInt();
			for(int j = 0; j<count; j++) {
			custItemCount[j]=0;
			}
			
			for(int j = 0; j<itemNum; j++) {
				
				itemCount = scan.nextInt();
				itemName = scan.next();
				for(int k = 0; k<count; k++) {
					
					if(itemName.equals(catalogName[k])) {
						custItemCount[k] ++;
						catalogCount[k] += itemCount;
					}
				}
				
			}
			for(int k = 0; k<count; k++) {
				if(custItemCount[k]>=1)
					custCount[k]++;
			}
		}
		
		for (int i = 0; i < count; i++) {
			if (custCount[i] ==0)
				System.out.println("No customers bought " + catalogName[i]);
			else
				System.out.println(custCount[i] + " customers bought " + catalogCount[i] + " " + catalogName[i]);
			
		}
		
	}
}
