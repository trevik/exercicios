package exerciciolaboratorio01;

public class Cilindro extends Figura implements Diagonal{

	
	
	//Declaração das variaveis
	private double volumeCilindro  = 0;
	private double calcularDiagonalCilindroFinal = 0;
	
	
	
	
	
	
	//Calculando área total cilindro
	
//	Área total (A)

//	A área total do cilindro é a soma das áreas
//	lateral e das bases. A expressão que pode ser
//	usada para calcular essa área é a seguinte:

//	A = Ab + Al
	
	@Override
	public double area(double lateral1, double lateral2) {
		
		
		double areaTotalCilindro = lateral1 + lateral2;
		
		
		return areaTotalCilindro;
	}

	//Não encontrei formula para implemetar o perimetro do cilindro
	@Override
	public double perimetro(double base, double altura) {
		// TODO Auto-generated method stub
		return 0;
	}
	
//	Fórmula do volume do cilindro
//	Considere um cilindro de altura h e raio da base r, conforme a figura a seguir:
	
	// V = PI * r² * h
	public double volumeCilindro(double PI,double raio,double altura) {
		
		double volumeCilindro = (PI * (Math.pow(raio, 2)) * altura);
		
		return volumeCilindro;
				
	}

	
//	A diagonal do cilindro pode ser calculada por Pitágoras;

//	Levando em consideração os seguintes dados:

//	Diagonal=d

//	Diâmetro do cilindro = a

//	Altura do cilindro = h

//	A fórmula fica assim:

//	d²=a²+h²
@Override
public double calcularDiagonal(double diametro, double altura) {
	
	
	double calcularDiagonalCilindroParcial = Math.pow(diametro, 2) + Math.pow(altura, 2);
	double calcularDiagonalCilindroFinal = Math.sqrt(calcularDiagonalCilindroParcial);
	
	
	return calcularDiagonalCilindroFinal;
}

//Métodos get e set
public double getVolumeCilindro() {
	return volumeCilindro;
}

public void setVolumeCilindro(double volumeCilindro) {
	this.volumeCilindro = volumeCilindro;
}


	
	
public double getCalcularDiagonalCilindroFinal() {
	return calcularDiagonalCilindroFinal;
}

public void setCalcularDiagonalCilindroFinal(double calcularDiagonalCilindroFinal) {
	this.calcularDiagonalCilindroFinal = calcularDiagonalCilindroFinal;
}

@Override
public String toString() {
	return "Figura Geométrica:"+super.getNome()+"\n"+"Área:"+this.getArea()+"\n"+ 
			"Perímetro:"+this.getPerimetro()+"\n"+"Volume"+this.getVolumeCilindro()+"\n"+"Diagonal Cilindro:"+this.getCalcularDiagonalCilindroFinal();
		

}
	
	
	
	
	

}
