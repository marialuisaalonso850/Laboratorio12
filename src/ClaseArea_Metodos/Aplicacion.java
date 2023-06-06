/**Presentado Por Maria Luisa Alonso Giraldo 
 * Para Cristian Henao 
 * main ejercicio laboratorio12
 * **/

package ClaseArea_Metodos;

import javax.swing.JOptionPane;

public class Aplicacion {

	/**
	 * 
	 * @param se llama el metodo ingresar datos que pide los lados de a y b despues
	 *           se encapsulan en metodo calcular area que multiplica estos
	 *           resultados y imprime
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ladoA;
		double ladoB;

		ladoA = ingresarDatos("ingrese la  longuitud del lado A: ");
		ladoB = ingresarDatos("ingrese la  longuitud del lado B: ");

		calcularArea(ladoA, ladoB);

	}

	/**
	 * 
	 * @param mensaje
	 * @return valor
	 * 
	 */

	public static double ingresarDatos(String mensaje) {

		String cadena;
		double valor;

		cadena = JOptionPane.showInputDialog(null, mensaje);
		valor = Double.parseDouble(cadena);

		return valor;

	}

	/**
	 * 
	 * @param a
	 * @param b
	 */
	public static void calcularArea(double a, double b) {

		double resultado;
		resultado = a * b;

		JOptionPane.showMessageDialog(null, "El resultado es " + resultado);

	}

}
