
package s103_n1Ex1_HashSet_Interador_MESES;

import java.util.Objects;

public class Month { 
	//atributos
	private String name; 
	
	//cosntructor 
    public Month(String name) {
        this.name = name;
    }
    //getter
    public String getName() { 
		return name;
	}
    //setter
    public void setName(String name) {
		this.name = name;
	}
    //metodos generales
    public boolean equals(Object o) { 
        if (this == o) return true;
        if (!(o instanceof Month)) return false; 
        
        Month month = (Month) o; 
        return Objects.equals(name, month.name);
    }
    public int hashCode() {
        return Objects.hash(name);
    }
}

