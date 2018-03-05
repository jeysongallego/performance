package com.acme.services;

import com.acme.services.utilities.NumericUtilities;

public class AddService {
	public int add (int numberA, int numberB) {
		NumericUtilities.giveMeABreak(2000);
		return numberA + numberB;
	}
}