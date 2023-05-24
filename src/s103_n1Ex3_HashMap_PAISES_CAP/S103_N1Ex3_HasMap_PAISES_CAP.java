package s103_n1Ex3_HashMap_PAISES_CAP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class S103_N1Ex3_HasMap_PAISES_CAP {
	
    static Scanner entrada = new Scanner(System.in);
   
	public static void main(String[] args) {
		int puntuacion = 0;
		String nombre;
		String usuario; 
		String persona;
		
		HashMap<String, String> paises = new HashMap<String, String>(); 
		
		try {
			File file = new File("C:\\Users\\NATALIA\\eclipse-workspace\\countries.txt S103_n1Ex3 HashMap.txt"); 
			Scanner entrada = new Scanner(file);
			while (entrada.hasNext()) { 
				String line = entrada.nextLine(); 
				String[] parts = line.split(" ");
				String pais = parts[0]; 
				String capital = parts[1];
				paises.put(pais, capital); 
				
			} 
			entrada.close(); 
		} catch (FileNotFoundException e) { 
			System.out.println("Error!");
			e.printStackTrace();
		} 
		
		Random random = new Random(); 
		List<String> keys = new ArrayList<String>(paises.keySet());
		String randomPais = keys.get(random.nextInt(keys.size())); 
		String capital = paises.get(randomPais);
		
		System.out.print("Introduce tu nombre: ");
		nombre = entrada.nextLine();

		System.out.println("Cual es la capital de " + randomPais + "?"); 
		usuario = entrada.nextLine();

		if (usuario.equals(capital)) { 
			System.out.println("Correcto!"); 
		} else { 
			System.out.println("Incorrecto!.La capital de " + randomPais + " es " + capital + ".\n");
		}
		for (int i = 0; i < 2; i++) { 
			randomPais = keys.get(random.nextInt(keys.size()));
			capital = paises.get(randomPais);
			
			System.out.println("Cual es la capital de " + randomPais + "?");
			persona = entrada.nextLine();

			if (persona.equals(capital)) {
				System.out.println("Correcto!");
				puntuacion++;
			} else { 
				System.out.println("Incorrecto. La capital de " + randomPais + " es " + capital + ".\n"); 
			}
		}
		System.out.println("Puntuacion final " + nombre + ": " + puntuacion);
	}
}


