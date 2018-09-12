package com.afrianpasa.abstractfactorypattern.models;

import com.afrianpasa.abstractfactorypattern.interfaces.Shape;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw mehtod");
		
	}
	
}
