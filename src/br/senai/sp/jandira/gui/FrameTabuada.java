package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Tabuada;

import javax.swing.JButton;

public class FrameTabuada {
	
	public String titulo;
	public int largura;
	public int altura;
	
	
	public void criarTela() {
		
//		configuração da tela
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
//		componentes  de tela 
		Container painel = tela.getContentPane();
		
//		titulo
		JLabel labelTabuada = new JLabel();
		Font fonteTabuada = new Font("SansSerif", Font.BOLD, 25);
		labelTabuada.setText("Tabuada 1.0");
		labelTabuada.setBounds(110, 20, 210, 30);
		labelTabuada.setForeground(Color.RED);
		labelTabuada.setFont(fonteTabuada);
		
//		subtitulo
		JTextArea labelSubtitulo = new  JTextArea();
		Font subTexto = new Font("SansSerif", Font.ROMAN_BASELINE , 12);
		labelSubtitulo.setText("Com a tabuada 1.0 os seus problemas acabaram. Calcule"
				    +"a tabuada que desejar em segundos!");
		labelSubtitulo.setBounds(110, 50, 330, 35);
		labelSubtitulo.setForeground(Color.GRAY);
		labelSubtitulo.setEditable(false);
		labelSubtitulo.setLineWrap(true);
		labelSubtitulo.setFont(subTexto);
		
//		Multiplicando
		JLabel labelMultiplicando = new JLabel();
		Font multilplicandoTexto = new Font("SansSerif", Font.ROMAN_BASELINE , 20);
		JTextField textFieldMultiplicando = new JTextField();
		labelMultiplicando.setText("Multiplicando :");
		labelMultiplicando.setBounds(120, 120, 300, 35);
		labelMultiplicando.setForeground(Color.BLACK);
		labelMultiplicando.setFont(multilplicandoTexto);
		textFieldMultiplicando.setBounds(270, 122, 160, 35);
		textFieldMultiplicando.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
//		Minimo multiplicador 
		JLabel labelMinimoMultiplicando = new JLabel();
		Font minimoMultilplicandoTexto = new Font("SansSerif", Font.ROMAN_BASELINE , 20);
		JTextField textFieldminimoMultiplicando = new JTextField();
		labelMinimoMultiplicando.setText("Minimo multiplicando :");
		labelMinimoMultiplicando.setBounds(44, 175, 250, 35);
		labelMinimoMultiplicando.setForeground(Color.BLACK);
		labelMinimoMultiplicando.setFont(multilplicandoTexto);
		textFieldminimoMultiplicando.setBounds(270, 178, 160, 35);
		textFieldminimoMultiplicando.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
//		Maximo multiplicando
		JLabel labelMaximoMultiplicando = new JLabel();
		Font maximoMultilplicandoTexto = new Font("SansSerif", Font.ROMAN_BASELINE , 20);
		JTextField textFieldMaximoMultiplicando = new JTextField();
		labelMaximoMultiplicando.setText("Minimo multiplicando :");
		labelMaximoMultiplicando.setBounds(39, 230, 250, 35);
		labelMaximoMultiplicando.setForeground(Color.BLACK);
		labelMaximoMultiplicando.setFont(multilplicandoTexto);
		textFieldMaximoMultiplicando.setBounds(270, 233, 160, 35);
		textFieldMaximoMultiplicando.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
//		botão calcular 
		JButton buttonCalcular = new JButton();
		Color corCalcular = new Color(00,130,00);
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(39, 310, 230, 35);
		buttonCalcular.setForeground(Color.white);
		buttonCalcular.setBackground(corCalcular);
		buttonCalcular.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
//		botão limpar
		JButton buttonLimpar = new JButton();
		Color corLimpar = new Color(238,173,45);
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(275, 310, 150, 35);
		buttonLimpar.setForeground(Color.white);
		buttonLimpar.setBackground(corLimpar);
		buttonLimpar.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
//		tela de aparição do resultado 
		JLabel labelResultado = new JLabel();
		Font fonteResultado = new Font("SansSerif", Font.BOLD , 16);
		JTextField textFieldResultado = new JTextField();
		Color corResultado = new Color(255,255,200);
		labelResultado.setText("Resultado:");
		labelResultado.setBounds(39, 360, 100, 35);
		labelResultado.setFont(fonteResultado);
		textFieldResultado.setBounds(39, 400, 400, 200);
		textFieldResultado.setBackground(corResultado);
		textFieldResultado.setBorder(BorderFactory.createLineBorder(Color.blue));
		
		
//		aparição na tela
		painel.add(labelTabuada);
		painel.add(labelSubtitulo);
		painel.add(labelMultiplicando);
		painel.add(textFieldMultiplicando);
		painel.add(labelMinimoMultiplicando);
		painel.add(textFieldminimoMultiplicando);
		painel.add(labelMaximoMultiplicando);
		painel.add(textFieldMaximoMultiplicando);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(textFieldResultado);
		painel.add(labelResultado);
		
//		TELA FICAR VISIVEL
	tela.setVisible(true);
	
//	metodo para fazer o botão calcular funcionar
//	public void  actionPerformed(ActionEvent e) {
//		
//		Tabuada tabuada = new Tabuada();
//		tabuada.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
//		
		
		
	}
	
	

	}

}
