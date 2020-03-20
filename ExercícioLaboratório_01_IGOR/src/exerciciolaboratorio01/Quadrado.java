package exerciciolaboratorio01;

public class Quadrado extends Poligono implements Diagonal{

	
	
	//Declaração das variáveis 
	private double diagonalQuadrado = 0;
	
	
	
	//Construtor vazio
		public Quadrado() {

		
		}

		//Construtor cheio
		public Quadrado(String nome, double area, double perimetro, double base, double altura,double diagonalQuadrado) {
			super(nome, area, perimetro, base, altura);
			this.diagonalQuadrado =  diagonalQuadrado;
		
		}
		
		

//		 Fórmula da diagonal quadrado
//       d2 = lado1² + lado²		
		 
		
//		 Método que calcula a diagonal do quadrado
	@Override
	public double calcularDiagonal(double lado1, double lado2) {
		
		double diagonalQuadradoParcial = Math.pow(lado1, 2) + Math.pow(lado2, 2);
		
		double diagonalQuadradoFinal = Math.sqrt(diagonalQuadradoParcial);
		
		return diagonalQuadradoFinal;
	}

	
	//Calcular área do quadrado
	@Override
	public double area(double base, double altura) {
		
		double areaQuadrado =  (base *  altura) ;
		
		return areaQuadrado;
	}
	
	
//	O perímetro do quadrado é calculado utilizando a fórmula:

//	    P = L + L + L + L
	
	public double perimetro(double base,double altura) {
		
		
		double perimetroQuadrado =  2 * (base +  altura);
		
		return perimetroQuadrado;
	}

	
	//Métodos get e set
	public double getDiagonalQuadrado() {
		return diagonalQuadrado;
	}

	public void setDiagonalQuadrado(double diagonalQuadrado) {
		this.diagonalQuadrado = diagonalQuadrado;
	}

	
	@Override
	public String toString() {
		
		return "Figura Geométrica:"+ super.getNome()+"\n"+"Área:"+super.getArea()+"\n"+ 
		"Perímetro:"+super.getPerimetro()+"\n"+"Diagonal:"+this.getDiagonalQuadrado();
	}

	

	

	

}
