package exerciciolaboratorio01;

import java.math.BigDecimal;

public class Triangulo  extends Poligono{

	
	
	
	//Construtor
	public Triangulo() {
		
	}
		
	public Triangulo(String nome, double area, double perimetro, double base, double altura) {
		super(nome, area, perimetro, base, altura);

	}
	

	//Implementando m�todo da classe poligono que foi 
		//Herdado da classe M�E figura.
		
		
		//VAI TRE O SEU PR�PRIO M�TODO POIS 
		//PARA CLACULAR A �REA DE DIFERENTE DAS OUTRAS FIGURAS
	
	
	//Calculando a area do triangulo
	// FORMULA
	
	// �rea = (b * h) / 2 ;
	

	@Override
	public double area(double base,double altura) {
		
		
		double  areaTrianguloCalculada = (base *  altura) / 2;
		
		return areaTrianguloCalculada;
	}
	
	//Calculando Per�metro do Tri�ngulo
	//Formula P = L + L + L

	@Override
	public  double perimetro(double base,double altura) {
		
		double perimetroTriangulo = 2 * (base +  altura);
		
		
		return perimetroTriangulo;
	}
	
	
	//M�todos get e set
	
	
	@Override
	public String toString() {
		return "Figura Geom�trica: Triangulo \n"+"�rea:"+this.getArea()+"\n"+ 
				"Per�metro:"+this.getPerimetro();
	
	}

	
	
	
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//OBS: IMPORTANTE TRIANGULO N�O POSSUI (((((( DIAGONAL ))))))
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		
		//   ((((((((((((((((((((((  FIM  ))))))))))))))))))))))
	

	

	
	
	

	
}
