package exerciciolaboratorio01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Quadrado_Test {
	
	
	
	//Declaração de variáveis
	Quadrado quadrado ;
	
	
	@BeforeEach
	
	void preparacao() {
		
		quadrado =  new Quadrado("Quadrado", 10, 10, 10, 10, 10);
		
		
	}

	//Test área do quadrado
	@Test
	void testAreaQuadrado() {
		
		double resultadoAreaQuadrado =  quadrado.area(10.5, 10.5);
		System.out.println(resultadoAreaQuadrado);
		assertEquals(110.25, resultadoAreaQuadrado);
	
	}
	
	//Testando o perimetro quadrado
	@Test
	void testPerimetroQuadrado() {
		
		double resultadoPerimetroQuadrado = quadrado.perimetro(10, 10);
		System.out.println(resultadoPerimetroQuadrado);
		assertEquals(40, resultadoPerimetroQuadrado);
	}

}
