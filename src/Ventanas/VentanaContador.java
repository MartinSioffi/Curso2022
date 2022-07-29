package Ventanas;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class VentanaContador {

	static int counter=1;
	
	public static void main(String[] args) {
	
		JFrame ventana = new JFrame("Eventos");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		Container panel = ventana.getContentPane();
		
		//Añadir Button
		JButton jbtContador = new JButton("Pulsar - 0");
		JButton jbtCierre = new JButton("Cerrar");
		JButton jbtAzul = new JButton("Azul");
		
		ventana.setLayout(new FlowLayout());
		panel.add(jbtCierre);
		panel.add(jbtContador);
		panel.add(jbtAzul);
		
		//Utiliza Clase anonima para realizar la acciòn
		jbtContador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println(event.getActionCommand());
				jbtContador.setText("Pulsar - " + counter++);
			}
		});
		
		//Utiliza Clase anonima para realizar la acciòn
				jbtAzul.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						if (jbtAzul.getBackground() == Color.LIGHT_GRAY) {
								jbtAzul.setBackground(null);
							//	panel.setBackground(Color.LIGHT_GRAY);
						}
						else jbtAzul.setBackground(Color.LIGHT_GRAY);
						
						
					}
		});
				
		
		
		// Añadir Acciòn a evento , directamente
		jbtCierre.addActionListener( e -> System.exit(0));
		
		ventana.setSize(300,200);
		ventana.setLocation(300,50);
		ventana.setVisible(true);
		
}
}

		
		
		
		
	


