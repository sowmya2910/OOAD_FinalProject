
/**
* @author Abhinav Gupta/Divya Athoopallil
*/


/*
* Class for bill calculation
*/

package com.OOAD.order;

public class CalculateBill {
	
	public int calculateBill(int quantity1, int quantity2, int quantity3, int quantity4, int quantity5, int quantity6, 
			int quantity7, int quantity8,int quantity9, int quantity10, int quantity11,int quantity12) {
		
		int bill = (int) (6*quantity1 + 6*quantity2 + 7*quantity3 + 8*quantity4 + 8*quantity5 + 9*quantity6 + 5*quantity7 + 8*quantity8 + 
				4*quantity9 + 6*quantity10 + 5*quantity11 + 4*quantity12);
		return bill;
	}

}
