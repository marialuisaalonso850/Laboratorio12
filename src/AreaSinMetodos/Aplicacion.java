/**
 * Presentado por Maria Luisa Alonso
 * Para Cristian Henao 
 * Calcular area sin metodos
 */

package AreaSinMetodos;

import javax.swing.JOptionPane;

public class Aplicacion {
	/**
	 * 
	 * @param args
	 * 
	 */

	public static void main(String args[]) {

		// Declaración de variables para almacenar los valores ingresados y el resultado
		// del cálculo.
		String cadena;
		double ladoA;
		double ladoB;
		double resultado;

		cadena = JOptionPane.showInputDialog(null, "ingrese la longitud del lado A:");
		ladoA = Double.parseDouble(cadena);

		// Se muestra una ventana emergenteque pide los datos
		cadena = JOptionPane.showInputDialog(null, "ingrese la longitud del lado B:");
		ladoB = Double.parseDouble(cadena);

		resultado = ladoA * ladoB;

		JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
		// se muestra la ventana emergente con el resultado

	}

}
