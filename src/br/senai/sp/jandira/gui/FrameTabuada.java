package br.senai.sp.jandira.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.border.LineBorder;

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
		
		
//		imagem
		
		JLabel labelImagem = new JLabel();
		ImageIcon icone  = new ImageIcon("src/br/senai/sp/jandira/imagens/calculadora.png");
		labelImagem.setIcon(icone);
		labelImagem.setBounds(20, 25, 90, 60);
		
		
		
//		subtitulo
		JTextArea labelSubtitulo = new  JTextArea();
		Font subTexto = new Font("SansSerif", Font.ROMAN_BASELINE , 14);
		labelSubtitulo.setText("Com a tabuada 1.0 os seus problemas acabaram. "
				    +" Calcule a tabuada que desejar em segundos!");
		labelSubtitulo.setBounds(110, 50, 330, 60);
		labelSubtitulo.setForeground(Color.GRAY);
		labelSubtitulo.setEditable(false);
		labelSubtitulo.setBorder(null);
		labelSubtitulo.setOpaque(false);
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
		textFieldMultiplicando.setHorizontalAlignment(JTextField.RIGHT);
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
		textFieldminimoMultiplicando.setHorizontalAlignment(JTextField.RIGHT);
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
		textFieldMaximoMultiplicando.setHorizontalAlignment(JTextField.RIGHT);
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
		JScrollPane barra = new JScrollPane();
		barra.setBounds(39, 400, 400, 200);
		JList<String> lista = new JList<>();
		lista.setBorder(new LineBorder(Color.BLACK));
		lista.setFont(new Font("Arial", Font.BOLD, 20));
		
		
//		 texto resultado 
		
		JLabel labelResultado = new JLabel();
		Font Resultado = new Font("SansSerif", Font.ROMAN_BASELINE , 20);
		JTextField textFieldResultado = new JTextField();
		labelResultado.setText("Resultado :");
		labelResultado.setForeground(Color.BLACK);
		labelResultado.setFont(multilplicandoTexto);
		labelResultado.setBounds(39, 350, 350, 35);
		
		
		
		
		
		
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
		painel.add(lista);
		painel.add(barra);
		painel.add(labelResultado);
		painel.add(labelImagem);
		
		
//		TELA FICAR VISIVEL
	tela.setVisible(true);
	
//	metodo para fazer o botão calcular funcionar
	 
	buttonCalcular.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		      if(textFieldMultiplicando.getText().isEmpty()){
		    	  JOptionPane.showMessageDialog(null, "digite algum valor");
		    	  textFieldMultiplicando.requestFocus();
		      }else if (textFieldminimoMultiplicando.getText().isEmpty()) {
		    	  JOptionPane.showMessageDialog(null, "Digite algum valor");
		    	  textFieldminimoMultiplicando.requestFocus();
		      }else if (textFieldMaximoMultiplicando.getText().isEmpty()) {
		    	  JOptionPane.showMessageDialog(null, "Digite algum valor");
		    	  textFieldMaximoMultiplicando.requestFocus();
		      }else {
		    	  
		     
			Tabuada resultado = new Tabuada();
			resultado.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
			resultado.minMultiplicador = Integer.parseInt(textFieldminimoMultiplicando.getText());
			resultado.maxMultiplicador = Integer.parseInt(textFieldMaximoMultiplicando.getText());
		     
			DefaultListModel<String> listModel = new DefaultListModel<String>();
			
			for (String linhaPassado : resultado.getTabuada()) {
			    listModel.addElement(linhaPassado);
			}
			lista.setModel(listModel);
			barra.getViewport().add(lista); 
		      }
		}
			
		      
	});

//         Botão limpar 
	
	buttonLimpar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == buttonLimpar);
			textFieldMultiplicando.setText(null);
			textFieldminimoMultiplicando.setText(null);
			textFieldMaximoMultiplicando.setText(null);
			
			DefaultListModel<String> model = new DefaultListModel<>();
			lista.setModel(model);
							
		}
	});
 
	
		
	  
	
	}	
}	
		
	

	

	


