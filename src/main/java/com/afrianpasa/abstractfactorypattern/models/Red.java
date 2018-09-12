package com.afrianpasa.abstractfactorypattern.models;

import com.afrianpasa.abstractfactorypattern.interfaces.Color;

public class Red implements Color{

	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}

}
