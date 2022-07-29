// CLASE 8 minuto 43. 

package Ventanas;

import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DiseñoGridBgLayout {

	public static void main(String[] args) {
		// GridBagLayout
		JFrame ventana3 = new JFrame("ventana de Prueba");
		ventana3.setSize(400,500);
		ventana3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container panel = ventana3.getContentPane();

		//Establece el Layout
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
				
		//Define botones para llenar las regiones. 
		JButton jb1 = new JButton("UNO");
		JButton jb2 = new JButton("DOS");
		JButton jb3 = new JButton("TRES");
		JButton jb4 = new JButton("CUATRO");
		JButton jb5 = new JButton("CINCO");
		
		//Añade cada botòn a su region
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=0;
		panel.add(jb1,gbc);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx=1;
		gbc.gridy=0;
		panel.add(jb2,gbc);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth = 3;
		panel.add(jb3,gbc);		
		
			
		
		ventana3.setVisible(true);
		
		}
	}