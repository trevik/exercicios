package exerciciolaboratorio01;

public class Retangulo extends Poligono implements Diagonal{

	
	//Declara��o de vari�veis
	private double diagonalRetangulo = 0;
	
	//Construtor vazio
		public Retangulo() {

		}


		//Construtor Cheio
		public Retangulo(String nome, double area, double perimetro, double base, double altura,double diagonalRetangulo) {
			super(nome, area, perimetro, base, altura);
			
			this.diagonalRetangulo  = diagonalRetangulo;
			

		}
	
	
	
	//Implementando m�todo da classe poligono que foi 
		//Herdado da classe M�E figura.
	
	
	
	//M�TODO QUE CALCULA A DIAGONAL RETANGULO
	@Override
	public double calcularDiagonal(double lado1, double lado2) {
		
		double calcularDiagonalRetanguloParcial = Math.pow(lado1, 2) + Math.pow(lado2, 2);
		
		double valorFinalDiagonalRetangulo = Math.sqrt(calcularDiagonalRetanguloParcial);
		
		
		
		return valorFinalDiagonalRetangulo;
	}

	
	// F�rmula da �rea do Ret�ngulo
	// Para calcularmos a �rea do ret�ngulo, utilizamos a seguinte f�rmula:

	// A = b . h
	@Override
	public double area(double base, double altura) {
		
		double calcularAreaRetangulo = (base * altura);
		
		return calcularAreaRetangulo;
	}
	
//	   Per�metro: valor encontrado quando se soma os quatro lados da figura. � expresso pela f�rmula:

//	   2(b + h).Assim, ele corresponde a soma de duas vezes a base e a altura (2b + 2h).

	@Override
	public double perimetro(double base,double altura) {
		
		double perimetroTotal = 2 *  (base +  altura) ;
		
		return perimetroTotal;
	}


	
	//M�todo get e set
	public double getDiagonalRetangulo() {
		return diagonalRetangulo;
	}


	public void setDiagonalRetangulo(double diagonalRetangulo) {
		this.diagonalRetangulo = diagonalRetangulo;
	}
	
	//M�todo toString
	@Override
	public String toString() {
		return "Figura Geom�trica:" + super.getNome()+ "\n"+"�rea:"+this.getArea()+"\n"+ 
				"Per�metro:"+this.getPerimetro()+"\n"+"Diagonal:"+this.getDiagonalRetangulo();
	
	}
	


}
