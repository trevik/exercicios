package exerciciolaboratorio01;

public class Retangulo extends Poligono implements Diagonal{

	
	//Declaração de variáveis
	private double diagonalRetangulo = 0;
	
	//Construtor vazio
		public Retangulo() {

		}


		//Construtor Cheio
		public Retangulo(String nome, double area, double perimetro, double base, double altura,double diagonalRetangulo) {
			super(nome, area, perimetro, base, altura);
			
			this.diagonalRetangulo  = diagonalRetangulo;
			

		}
	
	
	
	//Implementando método da classe poligono que foi 
		//Herdado da classe MÂE figura.
	
	
	
	//MÉTODO QUE CALCULA A DIAGONAL RETANGULO
	@Override
	public double calcularDiagonal(double lado1, double lado2) {
		
		double calcularDiagonalRetanguloParcial = Math.pow(lado1, 2) + Math.pow(lado2, 2);
		
		double valorFinalDiagonalRetangulo = Math.sqrt(calcularDiagonalRetanguloParcial);
		
		
		
		return valorFinalDiagonalRetangulo;
	}

	
	// Fórmula da Área do Retângulo
	// Para calcularmos a área do retângulo, utilizamos a seguinte fórmula:

	// A = b . h
	@Override
	public double area(double base, double altura) {
		
		double calcularAreaRetangulo = (base * altura);
		
		return calcularAreaRetangulo;
	}
	
//	   Perímetro: valor encontrado quando se soma os quatro lados da figura. É expresso pela fórmula:

//	   2(b + h).Assim, ele corresponde a soma de duas vezes a base e a altura (2b + 2h).

	@Override
	public double perimetro(double base,double altura) {
		
		double perimetroTotal = 2 *  (base +  altura) ;
		
		return perimetroTotal;
	}


	
	//Método get e set
	public double getDiagonalRetangulo() {
		return diagonalRetangulo;
	}


	public void setDiagonalRetangulo(double diagonalRetangulo) {
		this.diagonalRetangulo = diagonalRetangulo;
	}
	
	//Método toString
	@Override
	public String toString() {
		return "Figura Geométrica:" + super.getNome()+ "\n"+"Área:"+this.getArea()+"\n"+ 
				"Perímetro:"+this.getPerimetro()+"\n"+"Diagonal:"+this.getDiagonalRetangulo();
	
	}
	


}
