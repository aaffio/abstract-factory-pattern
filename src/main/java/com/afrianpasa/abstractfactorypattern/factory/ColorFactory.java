package com.afrianpasa.abstractfactorypattern.factory;

import com.afrianpasa.abstractfactorypattern.interfaces.Color;
import com.afrianpasa.abstractfactorypattern.interfaces.Shape;
import com.afrianpasa.abstractfactorypattern.models.Blue;
import com.afrianpasa.abstractfactorypattern.models.Green;
import com.afrianpasa.abstractfactorypattern.models.Red;

public class ColorFactory extends AbstractFactory{
	public Color getColor(String shape) {
		if(shape==null)
			return null;
		if(shape.equalsIgnoreCase("blue")) {
			return new Blue();
		}else if(shape.equalsIgnoreCase("green")) {
			return new Green();
		}else if(shape.equalsIgnoreCase("red")) {
			return new Red();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}
}
