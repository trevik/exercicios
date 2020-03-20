package exerciciolaboratorio01;

public abstract class Poligono extends Figura {
	
	//Declara��o das variaveis
	private double base;
	private double altura;
	
	
	//Construtor vazio
	public Poligono() {
		
	}
	//Construtor cheio
	public Poligono(String nome, double area, double perimetro,double base,double altura) {
		super(nome, area, perimetro);
		this.base =  base;
		this.altura =  altura;
	}
	
	
	//M�todo para calcular �rea das figurar geom�tricas
	
	public double calcularAreaFigura(double base,double altura) {
		
		double areaCalculadaFigura = Math.pow(base, altura);	
	
		return areaCalculadaFigura;
	}
	
	
	//M�todos get
	public double getBase() {
		
		return this.getBase();
	}
	
	public double getAltura() {
		
		return this.altura;
	}
	
	//M�todos set
	public void setBase(double base) {
		
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	

}
