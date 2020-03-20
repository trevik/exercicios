package exerciciolaboratorio01;

public class Losango extends Poligono{

	
	//Declaração de variáveis
    private double diagonalMenor = 0;
    private double diagonalMaior = 0;
	
	//Construtor Vazio
	public Losango() {
		
	}
	
	//Construtor cheio
	 public Losango(String nome, double area, double perimetro, double base, double altura) {
			super(nome, area, perimetro, base, altura);
			

			this.diagonalMaior = diagonalMaior;
			this.diagonalMenor = diagonalMenor;
			
		}
	
	
//    Onde,
//    D → é a medida da diagonal maior
//    d → é a medida da diagonal menor.
    
	//Calculando Área DO LOSANGO
	@Override
	public double area(double diagonalMaior, double diagonaMenor) {
	
		double calculandoArea = (diagonalMaior * diagonaMenor) / 2;
		
		
		return calculandoArea;
	}

//  Calculando perimetro DO LOSANGO 
//	Como Encontrar o Perímetro de um Losango
//  P =  LADO1 + LADO2 + LADO3 + LADO4	
	@Override
	public double perimetro(double base,double altura) {
		
		
		double perimetroLosango =  2 * (base + altura);
		
		return perimetroLosango;
	}
	
	

		
	
	//Calcular diagona Maior Losango
	//Formula  diagonalMaior = (Area * 2) / diagonalMenor 
	
	
	public double calcularDiagonalMaior(double area, double diagonalMenor) {
		
		double diagonalMaior =  (area * 2) / diagonalMenor;
		
		return diagonalMaior;
	}
	
	
	//Calcular diagona Menor Losango
	//Formula diagonalMenor = (Area * 2) / diagonalMaior
	
	
		public double calcularDiagonalMenor(double area, double diagonalMaior) {
			
			double diagonalMenor =  (area * 2) /  diagonalMaior;
			
			return diagonalMenor;
		}
		
		
		
		//MÉTODOS GET E SET
		
		public double getDiagonalMenor() {
			return diagonalMenor;
		}
		
		public void setDiagonalMenor(double diagonalMenor) {
			this.diagonalMenor = diagonalMenor;
		}
		
		public double getDiagonalMaior() {
			return diagonalMaior;
		}
		
		public void setDiagonalMaior(double diagonalMaior) {
			this.diagonalMaior = diagonalMaior;
		}
		
		@Override
		public String toString() {
			
			return "Figura Geométrica: Losango \n"+"Área:"+super.getArea()+"\n"+ 
			"Perímetro:"+super.getPerimetro()+"\n" + "Diagonal maior:" + diagonalMaior +"\n"
					+"Diagonal menor:" +diagonalMenor ;
		}
	
		
	
	

}
