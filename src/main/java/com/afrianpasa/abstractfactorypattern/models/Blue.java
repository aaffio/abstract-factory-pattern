package com.afrianpasa.abstractfactorypattern.models;

import com.afrianpasa.abstractfactorypattern.interfaces.Color;

public class Blue implements Color{

	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}

}
