package futbol;

public abstract class Futbolista implements Comparable<Object>{
	private String nombre;
	private int edad;
	private String posicion;
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	
	public String toString() {
		String r = "El futbolista " + this.nombre;
		r += " tiene " + this.edad;
		r += ", y juega de " + this.posicion;
		return r;
	}
	
	public boolean equals(Futbolista f) {
		if (this == f) {
			return true;
		} else {
			return false;
		}
	}
	
	public abstract boolean jugarConLasManos();
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return this.edad;
	}
	
	public String getPosicion() {
		return this.posicion;
	}
	
	public int compareTo(Object o) {
		Futbolista f = (Futbolista)o;
	    if (this.getEdad() != f.getEdad()) {
	        return this.getEdad() - f.getEdad();
	    }
	    return this.getNombre().compareTo(f.getNombre());
	}

}
