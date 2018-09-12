package com.afrianpasa.abstractfactorypattern.factory;

import com.afrianpasa.abstractfactorypattern.interfaces.Color;
import com.afrianpasa.abstractfactorypattern.interfaces.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
}
