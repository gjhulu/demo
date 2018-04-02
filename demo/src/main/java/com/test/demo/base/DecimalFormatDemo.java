package com.test.demo.base;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalFormatDemo {
	public static void main(String[] args) {
		double d = 12345678901.15555;
		double d2 = 0.0095;
		DecimalFormat fmt = new DecimalFormat("###,###.000");
		fmt.setRoundingMode(RoundingMode.FLOOR);
		System.out.println(">>>>>>>>>>>>>>>" + fmt.format(d));
		DecimalFormat fmt2 = new DecimalFormat("0.00%");
		System.out.println(">>>>>>>>>>>>>>>" + fmt2.format(d2));
		
		int j = 100;
		Test test = new Test();
		test.i = j;
		System.out.println(">>>>>>>>>>>test.i = " + test.i);
		
	}
}

class Test{
	Integer i;
	
}
