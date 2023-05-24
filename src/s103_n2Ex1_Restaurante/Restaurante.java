package s103_n2Ex1_Restaurante;

public class Restaurante {
	
	//atributos
	private String nombre; 
	private int puntuacion;
	
	//constructor
	public Restaurante(String nombre, int puntuacion) {
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}
    public String getNombre() {
        return nombre;
    }
    public int getPuntuacion() {
        return puntuacion;
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    public void setPuntuacion(int puntuacion)  {
    	this.puntuacion = puntuacion;
    }
    @Override 
    public boolean equals(Object o) { 
        if (this == o) return true; 
        if (!(o instanceof Restaurante)) return false; 
        Restaurante that = (Restaurante) o;
        return getPuntuacion() == that.getPuntuacion() && 
                Objects.equals(getNombre(), that.getNombre());
    }
    @Override
    public int hashCode() { 
        return Objects.hash(getNombre(), getPuntuacion());
    }
}
