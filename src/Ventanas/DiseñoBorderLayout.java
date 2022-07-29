package Ventanas;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DiseñoBorderLayout {

	public static void main(String[] args) {
		// GridLayout
		JFrame ventana2 = new JFrame("ventana de Prueba");
		ventana2.setSize(400,500);
		ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container panel = ventana2.getContentPane();
		
		//Define botones para llenar las regiones. 
		JButton jb1 = new JButton("UNO");
		JButton jb2 = new JButton("DOS");
		JButton jb3 = new JButton("TRES");
		JButton jb4 = new JButton("CUATRO");
		JButton jb5 = new JButton("CINCO");
		
		//Establece el Layout
		panel.setLayout(new GridLayout(3,2));
		//Añade cada botòn a su region
		panel.add(jb1);
		panel.add(jb2);
		panel.add(jb3);
		panel.add(jb4);
		panel.add(jb5);
		ventana2.setVisible(true);
			
		
		

	}

}
