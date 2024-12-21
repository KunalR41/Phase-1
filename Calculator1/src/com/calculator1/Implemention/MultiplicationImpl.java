package com.calculator1.Implemention;

import com.calculator1.interfaces.Multiplication;

public class MultiplicationImpl implements Multiplication{
	public void multiply(int a, int b) {
		int result;
		result=a*b;
		System.out.println("Multiplication of Numbers is :>>" + result);
	}
}
