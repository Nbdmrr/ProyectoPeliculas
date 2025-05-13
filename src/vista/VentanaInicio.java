package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaInicio extends JFrame{



	PanelInicio panelInicio;
	
	public VentanaInicio() {

		super("Ventana Vacía");


		setSize(1000, 500);


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		setLocationRelativeTo(null);

		panelInicio = new PanelInicio();
		add(panelInicio);
		setVisible(true);
		
		
		
		
	}

}
