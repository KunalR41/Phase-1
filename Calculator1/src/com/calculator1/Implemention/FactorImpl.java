package com.calculator1.Implemention;

import com.calculator1.interfaces.Factors;

public class FactorImpl implements Factors{

	@Override
	public void factor(int a) {
		
			for (int i=1;i<=a;i++) {
				if (a%i==0) {
					System.out.println("Factors of " + a + ":>> "+ i);
				}
			}
	}

}
