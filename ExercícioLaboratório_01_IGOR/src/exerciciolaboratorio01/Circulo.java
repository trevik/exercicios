package exerciciolaboratorio01;

public class Circulo extends Figura{

	//OBS: SITE QUE PERMITE CALCULAR ONLINE AS FIGURAS GEOMÉTRICAS  LINK ABAIXO
	
	
	//http://www.calculadoraonline.com.br/geometria
	
	//Declaração de variáveis 
	private double calcularAreaCirculo = 0;
	private double calcularPerimetroCirculo =0;

	//Construtor cheio
	public Circulo(String nome, double area, double perimetro,double calcularAreaCirculo,double calcularPerimetroCirculo ) {
		super(nome, area, perimetro);
		
		this.calcularAreaCirculo = calcularAreaCirculo;
		this.calcularPerimetroCirculo = calcularPerimetroCirculo;
	}

	//Construtor vazio
	public Circulo() {
		
	}
	
	
//	Fórmula: Cálculo da Área do Círculo

//	Para calcular a área do círculo devemos utilizar a seguinte fórmula:

//	A = π . r2

//	Onde,

//	π: constante Pi (3,14)
//	r: raio
	
	//Vai pedir para implementar o método que
	//consta na ((( Classe Figura ))) ok
	//Método que calcula área do circulo

	public double getCalcularAreaCirculo() {
			return calcularAreaCirculo;
		}

	public void setCalcularAreaCirculo(double calcularAreaCirculo) {
		this.calcularAreaCirculo = calcularAreaCirculo;
		}
	
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	
//OBS:CIRCULO NÃO TEM DIAGONAL
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

   //Método toString		
	@Override
	public String toString() {
		
		return "Figura Geométrica:"+ this.getNome()+"\n"  +"Área:"+this.getCalcularAreaCirculo()+"\n"+ 
		"Perímetro:"+this.calcularPerimetroCirculo;
	}

	//ESTOU CALCULANDO A ÁREA DO CIRCULO
	//QUE SERIA O SEU DIAMETRO TOTAL
	@Override
	public double area(double PI, double raio) {
		
		 calcularAreaCirculo = PI * (Math.pow(raio, 2));
		
		return calcularAreaCirculo;
	}
	
	
	//VAMOS CALCULAR O PERÍMETRO DO CIRCULO OK.
	//Fórmula do Perímetro
	//P = 2 π . r
	
	//Onde,

//    P: perímetro
//    π: constante de valor 3,14
//    r: raio
	
	@Override
	public double perimetro(double PI,double raio) {
		
		 calcularPerimetroCirculo = (2 * PI) * raio ;
		
		return calcularPerimetroCirculo;
	}

	
	
	
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	//OBS: IMPORTANTE CIRCULO NÃO POSSUI (((((( DIAGONAL ))))))
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	
	//   ((((((((((((((((((((((  FIM  ))))))))))))))))))))))
	

	

}
