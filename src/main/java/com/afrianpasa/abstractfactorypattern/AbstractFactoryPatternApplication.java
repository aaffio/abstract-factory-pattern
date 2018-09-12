package com.afrianpasa.abstractfactorypattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.afrianpasa.abstractfactorypattern.factory.AbstractFactory;
import com.afrianpasa.abstractfactorypattern.factory.FactoryProducer;
import com.afrianpasa.abstractfactorypattern.interfaces.Color;
import com.afrianpasa.abstractfactorypattern.interfaces.Shape;

@SpringBootApplication
public class AbstractFactoryPatternApplication {
	public static void main(String[] args) {
		SpringApplication.run(AbstractFactoryPatternApplication.class, args);
		
	      AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

	      Shape shape1 = shapeFactory.getShape("CIRCLE");
	      shape1.draw();

	      Shape shape2 = shapeFactory.getShape("RECTANGLE");
	      shape2.draw();
	      
	      Shape shape3 = shapeFactory.getShape("SQUARE");
	      shape3.draw();

	      AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

	      Color color1 = colorFactory.getColor("RED");
	      color1.fill();

	      Color color2 = colorFactory.getColor("Green");
	      color2.fill();

	      Color color3 = colorFactory.getColor("BLUE");
	      color3.fill();
	}
}
