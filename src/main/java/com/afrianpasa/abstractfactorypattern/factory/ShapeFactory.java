package com.afrianpasa.abstractfactorypattern.factory;

import com.afrianpasa.abstractfactorypattern.interfaces.Color;
import com.afrianpasa.abstractfactorypattern.interfaces.Shape;
import com.afrianpasa.abstractfactorypattern.models.Circle;
import com.afrianpasa.abstractfactorypattern.models.Rectangle;
import com.afrianpasa.abstractfactorypattern.models.Square;

public class ShapeFactory extends AbstractFactory{
	public Shape getShape(String shape) {
		if(shape==null)
			return null;
		if(shape.equalsIgnoreCase("circle")) {
			return new Circle();
		}else if(shape.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}else if(shape.equalsIgnoreCase("square")) {
			return new Square();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}
}
