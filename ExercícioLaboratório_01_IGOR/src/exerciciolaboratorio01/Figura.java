package exerciciolaboratorio01;

public abstract class Figura {
	
	//Essa classe � a super classe a m�e de todas
	// as outras classes
	
	//Declara��o das vari�veis 
	
	private String nome;
	private double area;
	private double perimetro;

	//CONSTRUTOR VAZIO
	public Figura() {
		
	}
	//CONSTRUTOR CHEIO
	public Figura(String nome, double area, double perimetro) {
		super();
		this.nome = nome;
		this.area = area;
		this.perimetro = perimetro;

	}


	//M�TODOS GET E SET
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getArea() {
		return area;
	}



	public void setArea(double area) {
		this.area = area;
	}



	public double getPerimetro() {
		return perimetro;
	}



	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	//M�todo Abstrato �rea
	
	public abstract double area(double base,double altura);

	public abstract double perimetro(double base,double altura);
}


