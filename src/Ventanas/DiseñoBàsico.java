package Ventanas;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

public class DiseñoBàsico {

	public static void main(String[] args) {
		
		//Crea el Frame
		JFrame frame = new JFrame("FrameDemo");
		// Establece salida
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Le pone un label
		//final JLabel label = new JLabel("hola mundo");
		//frame.setContentPane(label);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		//Le pone un botón
		JButton button1 = new JButton("Presionar");
		frame.getContentPane().add(button1);
		//Ajusta el tamaño
		//frame.pack();
		
		//Añadir acciòn al evento
		button1.addActionListener(e -> System.exit(0));
		
		
		JMenuBar menubar = new JMenuBar();
		
		//ame.setJMenuBar();
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.blue);
		frame.setVisible(true);
		
		JFrame ventana = new JFrame("Ventana de Prueba");
		ventana.setSize(300,300);
		Container panel = ventana.getContentPane();
		
		panel.setLayout(new FlowLayout());
		panel.add( new JLabel("UNO                    ."));
		panel.add( new JLabel("DOS                    ."));
		panel.add( new JLabel("TRES                    ."));
		panel.add( new JLabel("CUATRO                    ."));
		panel.add( new JLabel("CINCO                    ."));
		
		ventana.getContentPane().setBackground(Color.blue);
		
		ventana.setVisible(true);
		
		 
		
	}

}
