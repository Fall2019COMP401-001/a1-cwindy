package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();
		
		
		String[] fName = new String[count];
		String[] lName = new String[count];
		double[] total = new double[count];
		
		int itemTot;
		int itemNum;
		String itemName;
		double itemCost;
		
		for(int i=0; i<count; i++) {
			
			fName[i] = scan.next();
			lName[i] = scan.next();
			total[i] = 0;
			itemTot = scan.nextInt();
			
			for(int j = 0; j<itemTot; j++) {
				itemNum = scan.nextInt();
				itemName = scan.next();
				itemCost = scan.nextDouble();
				total[i] += itemNum * itemCost;
				
			}
			
		}
		
		for(int i=0; i<count; i++) {
			
			System.out.println(fName[i].substring(0,1) + ". " +
					lName[i] + ": " + String.format("%.2f", total[i]));
			
		}
	}
}
