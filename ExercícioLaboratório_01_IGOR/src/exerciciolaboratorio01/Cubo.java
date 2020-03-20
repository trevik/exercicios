package exerciciolaboratorio01;

public class Cubo extends Figura{

	
	//Declaração de variáveis 
	
	private double resultadoDiagonalMenor = 0;
	private double   resultadoFinalDiagonaMaior = 0;
	private double volumeCubo = 0;
	
	
	//Construtor vazio
	public Cubo() {
	
		
	}


	//Construtor cheio
	public Cubo(String nome, double area, double perimetro,double resultadoDiagonalMenor,double resultadoFinalDiagonaMaior ) {
		super(nome, area, perimetro);
		this.resultadoDiagonalMenor =  resultadoDiagonalMenor;
		this.resultadoFinalDiagonaMaior = resultadoFinalDiagonaMaior;
		
	}
	
//	Fórmula da Área Total

//	Para calcular a área total usamos a seguinte fórmula:

//	    At = 6 . a²
	

	@Override
	public double area(double qtdQuadradosCubo, double medidaDaArestaCubo) {
		
		double  areaTotalCubo = qtdQuadradosCubo * (Math.pow(medidaDaArestaCubo, 2));
		
		return areaTotalCubo;
	}
	
	
	//Calculo Perímetro

	@Override
	public double perimetro(double comprimentoArestaCubo, double CONSTANTE) {
		
		//CONSTANTE = 12 ARESTA;
		double perimetroCubo = CONSTANTE * comprimentoArestaCubo;
		
		
		return perimetroCubo;
	}
	
	//Calcula diagonal menor
	
//   d² =  a² + a²
//   d² =  2a² 
//   d  = raiz quadrada  2a² 
//   d = a raiz quadrada 2
	
	
	//diagonal base d 

	public double calcularDiagonaMenorCubo(double aresta) {
		
		double resultadoDiagonalMenor = Math.pow(aresta, 2) + Math.pow(aresta, 2);

		
		return resultadoDiagonalMenor ;
	}
	
	//Calcular diagonal maior do cubo
	public double calcularDiagonalMaiorCubo(double aresta) {
		
		double resultadoParcialDiagonalMaior =  Math.pow(aresta, 2) + resultadoDiagonalMenor;
	
		double  resultadoFinalDiagonaMaior = Math.sqrt(resultadoParcialDiagonalMaior);
		
		return  resultadoFinalDiagonaMaior ;
	}
	
	
	//Formula calcular volume cubo .
	// V = a³  ....
	//Link do youtube
	//https://www.youtube.com/watch?v=fRC8_59ZXEQ
	public double calcularVolumeCubo(double valorLadoCubo) {
		
		double arestaCubo = Math.sqrt(valorLadoCubo);
		 volumeCubo = Math.pow(arestaCubo, 3);
		
		
		
		return volumeCubo ;
	}
	@Override
	public String toString() {
		return "Figura Geométrica:"+super.getNome()+"\n"+"Área:"+this.getArea()+"\n"+ 
				"Perímetro:"+this.getPerimetro()+"\n"+"Volume"+this.getVolumeCubo()+"\n"+"DiagonalMenor:"+
				this.getResultadoDiagonalMenor()+"\n"+"Diagonal Maior:"+this.getResultadoFinalDiagonaMaior();
	
	}

	//Métodos get e set
	public double getResultadoDiagonalMenor() {
		return resultadoDiagonalMenor;
	}


	public void setResultadoDiagonalMenor(double resultadoDiagonalMenor) {
		this.resultadoDiagonalMenor = resultadoDiagonalMenor;
	}


	public double getResultadoFinalDiagonaMaior() {
		return resultadoFinalDiagonaMaior;
	}


	public void setResultadoFinalDiagonaMaior(double resultadoFinalDiagonaMaior) {
		this.resultadoFinalDiagonaMaior = resultadoFinalDiagonaMaior;
	}


	public double getVolumeCubo() {
		return volumeCubo;
	}


	public void setVolumeCubo(double volumeCubo) {
		this.volumeCubo = volumeCubo;
	}

   
	
	
	
	

}
