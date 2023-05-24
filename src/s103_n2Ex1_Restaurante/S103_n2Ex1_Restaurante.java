package s103_n2Ex1_Restaurante;

import java.util.HashSet;
import java.util.Set;

public class S103_n2Ex1_Restaurante {

	 public static void main(String[] args) {
	        Set<Restaurante> restaurantes = new HashSet<>();

	        Restaurante r1 = new Restaurante("Restaurante 1", 3);
	        Restaurante r2 = new Restaurante("Restaurante 2", 4);
	        Restaurante r3 = new Restaurante("Restaurante 3", 5);

	        restaurantes.add(r1);
	        restaurantes.add(r2);
	        restaurantes.add(r3);

	        // Utilizando un bucle para crear y añadir varios objetos de Restaurante
	        for (int i = 4; i <= 10; i++) {
	            Restaurante r = new Restaurante("Restaurante " + i, i % 5 + 1);
	            restaurantes.add(r);
	        }
	 }
}
