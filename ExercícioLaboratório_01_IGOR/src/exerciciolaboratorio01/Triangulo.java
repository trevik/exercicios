package exerciciolaboratorio01;

import java.math.BigDecimal;

public class Triangulo  extends Poligono{

	
	
	
	//Construtor
	public Triangulo() {
		
	}
		
	public Triangulo(String nome, double area, double perimetro, double base, double altura) {
		super(nome, area, perimetro, base, altura);

	}
	

	//Implementando método da classe poligono que foi 
		//Herdado da classe MÂE figura.
		
		
		//VAI TRE O SEU PRÓPRIO MÉTODO POIS 
		//PARA CLACULAR A ÁREA DE DIFERENTE DAS OUTRAS FIGURAS
	
	
	//Calculando a area do triangulo
	// FORMULA
	
	// área = (b * h) / 2 ;
	

	@Override
	public double area(double base,double altura) {
		
		
		double  areaTrianguloCalculada = (base *  altura) / 2;
		
		return areaTrianguloCalculada;
	}
	
	//Calculando Perímetro do Triângulo
	//Formula P = L + L + L

	@Override
	public  double perimetro(double base,double altura) {
		
		double perimetroTriangulo = 2 * (base +  altura);
		
		
		return perimetroTriangulo;
	}
	
	
	//Métodos get e set
	
	
	@Override
	public String toString() {
		return "Figura Geométrica: Triangulo \n"+"Área:"+this.getArea()+"\n"+ 
				"Perímetro:"+this.getPerimetro();
	
	}

	
	
	
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//OBS: IMPORTANTE TRIANGULO NÃO POSSUI (((((( DIAGONAL ))))))
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		
		//   ((((((((((((((((((((((  FIM  ))))))))))))))))))))))
	

	

	
	
	

	
}
