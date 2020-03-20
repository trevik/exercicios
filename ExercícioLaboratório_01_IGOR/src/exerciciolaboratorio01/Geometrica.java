package exerciciolaboratorio01;

import java.util.ArrayList;

public class Geometrica {

	// ONDE VOU COLOCAR OS OBJETOS DENTRO DESSE ARRAY LIST
	// ARRAYLIST DO TIPO ((( FIGURA )))

	ArrayList<Figura> listaFiguras = new ArrayList<Figura>();

	// VAI PEGAR OS OBJETOS((( FIGURAS ))) E COLOCAR DENTRO DO ARRAYLIST();
	public void salvarFiguras(Figura figura) {
			
				listaFiguras.add(figura);	
			
			
		}

	// Imprimir Figura
	public void imprimirFigurasGeometricas() {
		
		for(Figura figuras:listaFiguras) {
			System.out.println(figuras);
			System.out.println();
		}
	}

}
	

