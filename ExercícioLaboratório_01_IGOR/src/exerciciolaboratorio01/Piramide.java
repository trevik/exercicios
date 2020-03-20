package exerciciolaboratorio01;

public class Piramide extends Figura{

	
	//dECLARAÇÃO DE VARIÁVEIS
	private double areaTotal =0;
	private double calcularVolumePiramide  = 0;

	
	public Piramide() {

	}

	public Piramide(String nome, double area, double perimetro,double calcularVolumePiramide) {
		super(nome, area, perimetro);
		
		this.areaTotal = areaTotal;
		this.calcularVolumePiramide =  calcularVolumePiramide;

	}

	
	//ÁREA TOTAL PIRAMIDE
//	Assim, a área da pirâmide (A) é a 
//	soma entre a área de sua base (AB) 
//	e a área de suas faces laterais (AL). Em outras palavras:

//		A = AB + AL
	@Override
	public double area(double areaBase, double areaFacesLaterais) {
		
		double areaTotal =  areaBase + areaFacesLaterais;
		
		
		return areaTotal;
	}

	@Override
	public double perimetro(double base, double altura) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//Formula
//	V → é o volume
//	Ab → é a área da base da pirâmide
//	h → é a altura da pirâmide
	
// V = 1/3  * areaBase *  altura	
	public double calcularVolumePiramide(double areaBase,double altura) {
		
		double calcularVolumePiramide = (1 * areaBase *  altura) / 3;
		
		return calcularVolumePiramide;
	}

	
	//Métodos Get e set
	public double getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}

	public double getCalcularVolumePiramide() {
		return calcularVolumePiramide;
	}

	public void setCalcularVolumePiramide(double calcularVolumePiramide) {
		this.calcularVolumePiramide = calcularVolumePiramide;
	}
	
	
	
	@Override
	public String toString() {
		return "Figura Geométrica:"+super.getNome()+"\n"+"Área:"+this.getAreaTotal()+"\n"+ 
				"Perímetro:"+this.getPerimetro()+"\n"+"Volume:"+this.getCalcularVolumePiramide();
	
	}
	
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	//OBS:NÃO ENCONTREI DIAGONAL E NEM PERIMETRO DA PIRAMIDE ACHO QUE NÃO ...
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	

}
