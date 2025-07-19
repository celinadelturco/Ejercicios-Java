/* Crear una lista de enteros y agregar al menos 6 numeros
 * El programa debe eliminar todos los numeros pares de la lista y 
 * mostrar por consola el resultado final (solo impares)
 */

package com.celi.ejercicios.listas;

import java.util.ArrayList;

public class FiltrarPares {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		System.out.println("Numeros iniciales: ");
		for (int i = 1; i <= 6; i++) {
			numeros.add(i);		
			System.out.print(i +"; ");
		}

		System.out.println("");
		System.out.println("Numeros pares eliminados: ");
		for (int i = numeros.size() - 1; i >= 0; i--) {
			if(numeros.get(i)%2 ==0) {
				System.out.print(numeros.get(i) + "; " );
				numeros.remove(i);
			}
			
		}
		System.out.println("");
		System.out.println("Numeros finales (impares): ");
		for(int i = 0; i < numeros.size(); i++) {
			System.out.print(numeros.get(i)+"; ");
		}
	}
}
