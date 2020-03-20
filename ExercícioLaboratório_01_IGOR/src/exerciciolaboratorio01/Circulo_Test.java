package exerciciolaboratorio01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Circulo_Test {

	
	
	Circulo circulo ;
	
	
	@BeforeEach
	void preparacao() {
		
		circulo = new Circulo("Circulo",10,11,12,15);
	}
	
	
	
	//Testando a área o Circulo
	@Test
	void testAreaCirculo() {
		
		double resultadoAreaCirculo =  circulo.area(3.14, 10);
		System.out.println(resultadoAreaCirculo);
		assertEquals(314, resultadoAreaCirculo);
		
	}
	
	//Testando Perímetro Circulo
	@Test
	void testPerimetroCirculo() {
		
		double resultadoPerimetroCirculo =  circulo.perimetro(3.14, 20.0);
		System.out.println(resultadoPerimetroCirculo);
		assertEquals(125.6, resultadoPerimetroCirculo,0.001);
	}

}
