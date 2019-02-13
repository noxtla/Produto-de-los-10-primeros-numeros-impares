package Condicionales;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	int resultado=1;
	
	

	for (int i =1; i<10; i+=2) {
		 resultado *= i;
	 }
	JOptionPane.showMessageDialog(null, "La suma es " + resultado); 
	}
}

