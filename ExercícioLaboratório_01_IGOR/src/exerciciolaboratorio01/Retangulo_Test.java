package exerciciolaboratorio01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Retangulo_Test {

	
	//Declaração das variáveis
	Retangulo retangulo;
	
	
	
	
	@BeforeEach
	
	void preparacao(){
		
		retangulo = new Retangulo("retangulo",10,10,10,10,10);
	}
	
	
	//Testando área do Retangulo
	@Test
	void testAreaRetangulo() {
		
		
		double resultadoAreaRetangulo = retangulo.area(10.7, 10.7);
		System.out.println(resultadoAreaRetangulo);
		assertEquals(114.49, resultadoAreaRetangulo,0.001);
		
		
		
	}
	//Testando perimetro retangulo
	@Test
	void testPerimetroRetangulo() {
		
		double resultadoperimetroRetangulo = retangulo.perimetro(20, 20);
		System.out.println(resultadoperimetroRetangulo);
		assertEquals(80, resultadoperimetroRetangulo);
		
	}

}
