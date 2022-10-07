package com.example.smartphone;


/**
 * BillCalculator
*/
public class BillCalculator {
	
	public static int getBillPerMonth(Option... option) {
		int bill = 0;
    if (option.length == 3) {
      bill = 1000;
    } else {
      for (Option op : option) {
        bill += op.getBillPerMonth();
      }
    }
    return bill;
  }
}
