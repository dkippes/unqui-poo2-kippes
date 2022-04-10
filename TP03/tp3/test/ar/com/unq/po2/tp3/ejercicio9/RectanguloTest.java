package ar.com.unq.po2.tp3.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.com.unq.po2.tp3.ejercicio8.Point;

public class RectanguloTest {
	
	Point point1;
	Point point2;
	Rectangulo rectangulo;
	
	@BeforeEach
	void setUp() {
		point1 = new Point(3, 3);
		point2 = new Point(2, 0);
		rectangulo = new Rectangulo(point1, point2);
	}
	
	@Test
	void shouldBeARectangule() {
		assertEquals(rectangulo.getPoint1().getX(), 3);
		assertEquals(rectangulo.getPoint1().getY(), 3);
		assertEquals(rectangulo.getPoint2().getX(), 2);
		assertEquals(rectangulo.getPoint2().getY(), 0);
	}
	
	@Test
	void shouldCalculateArea() {
		assertEquals(rectangulo.calculateAltura(), 3);
		assertEquals(rectangulo.calculateBase(), 1);
		assertEquals(rectangulo.calculateArea(), 3);
	}
	
	@Test
	void shouldCalculatePerimetro() {
		assertEquals(rectangulo.calculatePerimetro(), 8);
	}
	
	@Test
	void shouldKnowIfVerticalOrHorizontal() {
		assertEquals(rectangulo.getPosition(), "vertical");
	}
}
