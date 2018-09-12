package com.afrianpasa.abstractfactorypattern.models;

import com.afrianpasa.abstractfactorypattern.interfaces.Color;

public class Green implements Color{

	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}

}
