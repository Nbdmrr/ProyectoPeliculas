package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class PanelInicio extends JPanel {
	
	JLabel lblBienvenida;
	JButton botonInicio;
	
	public PanelInicio() {
		setLayout(null);
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		lblBienvenida = new JLabel("Bienvenido");
		lblBienvenida.setBounds(333, 100, 333, 50);
		
		
		lblBienvenida.setFont(new Font("Arial", Font.BOLD, 60)); 
		add(lblBienvenida);
		
		botonInicio= new JButton("Inicio");
		botonInicio.setBounds(400,250,200,100);
		add(botonInicio);
		
	}
}
