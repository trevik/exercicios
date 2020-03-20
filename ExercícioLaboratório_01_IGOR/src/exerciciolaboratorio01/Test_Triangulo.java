package exerciciolaboratorio01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test_Triangulo {

	// Declarando vari�vel de tese
	Triangulo triangulo;

	// � executado antes de cada m�todo de teste da classe.

	@BeforeEach
	void preparacao() {

		triangulo = new Triangulo("Triangulo", 10, 10, 10, 10);
	}

	// Test �rea do triangulo
	@Test
	void testAreaTriangulo() {

		double resultadoAreaTriangulo = triangulo.area(10, 10);
		System.out.println(resultadoAreaTriangulo);
		assertEquals(50, resultadoAreaTriangulo);

	}

	// Test Per�metro do Triangulo

	@Test
	void testPerimetroTriangulo() {

		double resultadoPerimetroTriangulo = triangulo.perimetro(10, 10);

		assertEquals(40, resultadoPerimetroTriangulo);

	}

}
