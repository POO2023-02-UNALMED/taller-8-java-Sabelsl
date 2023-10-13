package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	public String toString() {
		String r = "El futbolista " + this.getNombre();
		r += " tiene " + this.getEdad();
		r += ", y juega de " + this.getPosicion();
		r += " con el dorsal " + this.dorsal;
		r += ". Le han marcado " + this.golesRecibidos;
		return r;
	}
	
	public int compareTo(Object o) {
		Portero p = (Portero)o;
		if (this.golesRecibidos > p.golesRecibidos) {
			return this.golesRecibidos - p.golesRecibidos;
		} else if (this.golesRecibidos < p.golesRecibidos) {
			return p.golesRecibidos - this.golesRecibidos;
		} else {
			return 0;
		}
	}
	
	public boolean jugarConLasManos() {
		return true;
	}

}
