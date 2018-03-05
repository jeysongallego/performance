package com.acme.services;

import com.acme.services.utilities.NumericUtilities;

public class DivideService {
	public int divide (int numberA, int numberB) throws Exception {
		
		if (!NumericUtilities.isZero(numberB)) {
			return 0;
		} else {
			throw new Exception("Can't divide by zero");
		}
	}
}
