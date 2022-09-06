package br.senai.sp.jandira.gui;

import javax.swing.JFrame;

public class FrameTabuada {
	
	public String titulo;
	public int largura;
	public int altura;
	
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		
		
		
		tela.setVisible(true);
	}

}
