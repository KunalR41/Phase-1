package com.calculator1.Implemention;

import com.calculator1.interfaces.EvenOdd;

public class EvenOddImpl implements EvenOdd {
	@Override
	public void evenOdd(int a) {
		if (a%2==0) {
			System.out.println(a+ " is Even Number");
		}else {
			System.out.println(a+" is Odd Number");
		}
	}

}
