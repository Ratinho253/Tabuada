package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Tabuada {
	
	public int multiplicando;
	public int minMultiplicador;
	public int maxMultiplicador;
	
	
	
	public ArrayList<String> getTabuada() {
		
		ArrayList<String> tabuada = new ArrayList<String>();
		
		while(minMultiplicador <= maxMultiplicador) {
			int resultado = multiplicando * minMultiplicador;
			tabuada.add(multiplicando + "x" + minMultiplicador + "=" + resultado);
			minMultiplicador++;
		}
		return tabuada;
	}
	
	
	
		


}
