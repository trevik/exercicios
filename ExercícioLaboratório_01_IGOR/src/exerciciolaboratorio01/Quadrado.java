package exerciciolaboratorio01;

public class Quadrado extends Poligono implements Diagonal{

	
	
	//Declara��o das vari�veis 
	private double diagonalQuadrado = 0;
	
	
	
	//Construtor vazio
		public Quadrado() {

		
		}

		//Construtor cheio
		public Quadrado(String nome, double area, double perimetro, double base, double altura,double diagonalQuadrado) {
			super(nome, area, perimetro, base, altura);
			this.diagonalQuadrado =  diagonalQuadrado;
		
		}
		
		

//		 F�rmula da diagonal quadrado
//       d2 = lado1� + lado�		
		 
		
//		 M�todo que calcula a diagonal do quadrado
	@Override
	public double calcularDiagonal(double lado1, double lado2) {
		
		double diagonalQuadradoParcial = Math.pow(lado1, 2) + Math.pow(lado2, 2);
		
		double diagonalQuadradoFinal = Math.sqrt(diagonalQuadradoParcial);
		
		return diagonalQuadradoFinal;
	}

	
	//Calcular �rea do quadrado
	@Override
	public double area(double base, double altura) {
		
		double areaQuadrado =  (base *  altura) ;
		
		return areaQuadrado;
	}
	
	
//	O per�metro do quadrado � calculado utilizando a f�rmula:

//	    P = L + L + L + L
	
	public double perimetro(double base,double altura) {
		
		
		double perimetroQuadrado =  2 * (base +  altura);
		
		return perimetroQuadrado;
	}

	
	//M�todos get e set
	public double getDiagonalQuadrado() {
		return diagonalQuadrado;
	}

	public void setDiagonalQuadrado(double diagonalQuadrado) {
		this.diagonalQuadrado = diagonalQuadrado;
	}

	
	@Override
	public String toString() {
		
		return "Figura Geom�trica:"+ super.getNome()+"\n"+"�rea:"+super.getArea()+"\n"+ 
		"Per�metro:"+super.getPerimetro()+"\n"+"Diagonal:"+this.getDiagonalQuadrado();
	}

	

	

	

}
