package a1;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		
		/*
		 * create catalog map 
		 * */
		Map<String, Double> catalog = new HashMap<>();
		
		for(int i = 0; i < count; i++) {
			
			catalog.put(scan.next(), scan.nextDouble());
		}
		
		
		/* 
		 * customer info 
		 * */
		int custNum = scan.nextInt();
		
		String[] fName = new String[custNum];
		String[] lName = new String[custNum];
		int itemNum;
		
		double[] custTot = new double[custNum];
		double total = 0;
		
		
		/* scan in specific customer info*/
		for(int i = 0; i < custNum; i++) {
			
			fName[i] = scan.next();
			lName[i] = scan.next();
			itemNum = scan.nextInt();
			
			custTot[i] = 0;
			
			for(int j = 0; j < itemNum; j++) {
				custTot[i] += scan.nextInt() * catalog.get(scan.next()) * 1.00;
			}
			
			total += custTot[i];
		}
		
		/* 
		 * determine biggest purchase
		 */
		int indexBig = 0;
		for(int i = 1; i< custNum; i++) {
			if(custTot[i] > custTot[i-1]) {
				indexBig = i;
			}
		}
		
		/* 
		 * determine smallest purchase
		 */
		int indexSmall = 0;
		for(int i = 1; i< custNum; i++) {
			if(custTot[i] < custTot[i-1]) {
				indexSmall = i;
			}
		}
		
		System.out.println("Biggest: " + fName[indexBig] + " " + lName[indexBig] + 
				" (" + String.format("%.2f", custTot[indexBig]) + ")");
		
		System.out.println("Smallest: " + fName[indexSmall] + " " + lName[indexSmall] + 
				" (" + String.format("%.2f", custTot[indexSmall]) + ")");
		
		System.out.println("Average: " + String.format("%.2f", (total/custNum)));
		
	}
}
