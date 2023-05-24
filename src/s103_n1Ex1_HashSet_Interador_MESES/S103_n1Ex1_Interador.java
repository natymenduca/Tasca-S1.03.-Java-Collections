package s103_n1Ex1_HashSet_Interador_MESES;

import java.util.ArrayList;
import java.util.HashSet;

public class S103_n1Ex1_Interador {

	public static void main(String[] args) {
		
		HashSet<Month> tempSet = new HashSet<Month>();
		
	    ArrayList<Month> meses= new ArrayList<Month>();// creamos el arrayList de la clase month la llamamos meses
		
	    meses.add(new Month("enero")); // creamos 11 objetos con el new Month y le damos el valor con el nombre de mes" en forma de String al atributo name
		meses.add(new Month("febrero"));
		meses.add(new Month("marzo"));
		meses.add(new Month("abril"));
		meses.add(new Month("mayo"));
		meses.add(new Month("junio"));
		meses.add(new Month("julio"));
		meses.add(new Month("septiembre"));
		meses.add(new Month("octubre"));
		meses.add(new Month("noviembre"));
		meses.add(new Month("diciembre"));
		
	    meses.addAll(tempSet);
	    meses.add(7,new Month("agosto"));
		
		for(Month mes : meses) {
			System.out.println(mes.getName());
		}
		HashSet<Month> mesesSet = new HashSet<Month>();
        mesesSet.addAll(mesesSet);
    }
}
