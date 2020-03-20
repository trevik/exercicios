package exerciciolaboratorio01;

public class Cilindro extends Figura implements Diagonal{

	
	
	//Declara��o das variaveis
	private double volumeCilindro  = 0;
	private double calcularDiagonalCilindroFinal = 0;
	
	
	
	
	
	
	//Calculando �rea total cilindro
	
//	�rea total (A)

//	A �rea total do cilindro � a soma das �reas
//	lateral e das bases. A express�o que pode ser
//	usada para calcular essa �rea � a seguinte:

//	A = Ab + Al
	
	@Override
	public double area(double lateral1, double lateral2) {
		
		
		double areaTotalCilindro = lateral1 + lateral2;
		
		
		return areaTotalCilindro;
	}

	//N�o encontrei formula para implemetar o perimetro do cilindro
	@Override
	public double perimetro(double base, double altura) {
		// TODO Auto-generated method stub
		return 0;
	}
	
//	F�rmula do volume do cilindro
//	Considere um cilindro de altura h e raio da base r, conforme a figura a seguir:
	
	// V = PI * r� * h
	public double volumeCilindro(double PI,double raio,double altura) {
		
		double volumeCilindro = (PI * (Math.pow(raio, 2)) * altura);
		
		return volumeCilindro;
				
	}

	
//	A diagonal do cilindro pode ser calculada por Pit�goras;

//	Levando em considera��o os seguintes dados:

//	Diagonal=d

//	Di�metro do cilindro = a

//	Altura do cilindro = h

//	A f�rmula fica assim:

//	d�=a�+h�
@Override
public double calcularDiagonal(double diametro, double altura) {
	
	
	double calcularDiagonalCilindroParcial = Math.pow(diametro, 2) + Math.pow(altura, 2);
	double calcularDiagonalCilindroFinal = Math.sqrt(calcularDiagonalCilindroParcial);
	
	
	return calcularDiagonalCilindroFinal;
}

//M�todos get e set
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
	return "Figura Geom�trica:"+super.getNome()+"\n"+"�rea:"+this.getArea()+"\n"+ 
			"Per�metro:"+this.getPerimetro()+"\n"+"Volume"+this.getVolumeCilindro()+"\n"+"Diagonal Cilindro:"+this.getCalcularDiagonalCilindroFinal();
		

}
	
	
	
	
	

}
