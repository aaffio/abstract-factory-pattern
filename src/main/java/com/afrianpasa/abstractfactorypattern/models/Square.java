package com.afrianpasa.abstractfactorypattern.models;

import com.afrianpasa.abstractfactorypattern.interfaces.Shape;

public class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Square::draw mehtod");
		
	}
	
}
