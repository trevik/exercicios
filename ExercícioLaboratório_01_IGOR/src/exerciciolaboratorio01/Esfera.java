package exerciciolaboratorio01;

public class Esfera extends Figura {

	
	//Declaração das variáveis
private double volumeEsfera =0;
	
	
	//Construtor 
	public Esfera() {

		// TODO Auto-generated constructor stub
	}


	public Esfera(String nome, double area, double perimetro) {
		super(nome, area, perimetro);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

	
//	Área da esfera

//	A área da esfera pode ser calculada por meio da expressão a seguir:

//	A = 4πr2
	
	


	@Override
	public double area(double PI, double raio) {
		
		double areaEsfera = (4 * PI) * (Math.pow(raio, 2));
		
		return areaEsfera;
	}

	
	


	//Calcular perimetro
//	2 × π × r
	@Override
	public double perimetro(double PI, double raio) {
		
		
		double  perimetroEsfera = 2 * PI  * raio;
		
		
		return perimetroEsfera;
	}
	
	//Calcular volume
	//formula
   //	V= 4 * PI * raio ³ / 3
	public double calcularVolumeEsfera(double PI,double raio) {
		
		 volumeEsfera =  (4 * PI * raio) / 3;
		
		return volumeEsfera;
	}
	
	@Override
	public String toString() {
		return "Figura Geométrica:"+super.getNome()+"\n"+"Área:"+this.getArea()+"\n"+ 
				"Perímetro:"+this.getPerimetro()+"\n"+"Volume:"+this.getVolumeEsfera();
	
	}

	//Método get e set

	public double getVolumeEsfera() {
		return volumeEsfera;
	}


	public void setVolumeEsfera(double volumeEsfera) {
		this.volumeEsfera = volumeEsfera;
	}
	

}
