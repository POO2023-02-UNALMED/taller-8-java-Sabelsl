package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	
	public int compareTo(Object o) {
		Futbolista f = (Futbolista)o;
		if (this.getEdad()>f.getEdad()) {
			return this.getEdad() - f.getEdad();
		} else if (this.getEdad()<f.getEdad()) {
			return f.getEdad() - this.getEdad();
		} else {
			return 0;
		}
	}
	
	public String toString() {
		String r = "El futbolista " + this.getNombre();
		r += " tiene " + this.getEdad();
		r += ", y juega de " + this.getPosicion();
		r += " con el dorsal " + this.dorsal;
		r += ". Ha marcado " + this.golesMarcados;
		return r;
	}
	
	public boolean jugarConLasManos() {
		return false;
	}

}
