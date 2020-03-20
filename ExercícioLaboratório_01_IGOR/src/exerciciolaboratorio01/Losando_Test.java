package exerciciolaboratorio01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Losando_Test {

	
	//Declara��o de vari�veis
	 Losango losango ;
	
	
	 
	 
	 @BeforeEach
	 
	 void preparacao() {
		 
		 losango = new Losango("Losango", 10, 10, 10, 10);
	 }
	 
	
	 //Testando a �rea do Losango
	@Test
	void testAreaLosango() {
		
		double resultadoAreaLosango =  losango.area(10, 10);
		
		System.out.println(resultadoAreaLosango);
		assertEquals(50, resultadoAreaLosango);
		
	}
	
	
	
	//Testando o per�metro do losango
	@Test
	void testPerimetroLosango() {
		
		double resultadoPerimetroLosango =  losango.perimetro(10, 10);
		System.out.println(resultadoPerimetroLosango);
		assertEquals(40, resultadoPerimetroLosango);
	}
	

}
