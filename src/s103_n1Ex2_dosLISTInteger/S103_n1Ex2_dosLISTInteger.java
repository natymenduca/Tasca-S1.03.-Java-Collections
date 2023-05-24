package s103_n1Ex2_dosLISTInteger;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class S103_n1Ex2_dosLISTInteger {

	public static void main(String[] args) {

		ArrayList <Integer>primeraLista = new ArrayList<>(); 
		primeraLista.add(1); 
		primeraLista.add(2);
		primeraLista.add(3);
		primeraLista.add(4);

		List<Integer> segundaLista = new ArrayList<Integer>();
		
		ListIterator<Integer> iterador = primeraLista.listIterator(primeraLista.size()); 
		while (iterador.hasPrevious()) {
			segundaLista.add(iterador.previous()); 
		}
		//imprime ambas listas
		System.out.println(primeraLista);
		System.out.println(segundaLista); 
	}
}

