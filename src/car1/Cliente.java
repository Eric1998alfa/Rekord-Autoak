package car1;

import java.io.Serializable;
import java.util.Objects;

public class Cliente extends Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4712701685349672058L;
	public Fecha Fecha_alta;
	
	public Cliente() {
		super();
		this.Fecha_alta=new Fecha();
	}	
	
	public Cliente(Cliente c) {
		super(c);
		this.Fecha_alta=new Fecha(c.Fecha_alta);
	}	
	
	public Cliente(Fecha FA) {
		super();
		this.Fecha_alta=new Fecha(FA);
	}
	
	public Cliente(String D, String N, String A, int T, Fecha FN, String E, int CP, String C, int PO, int PI, String PU,Fecha FA) {
		super(D, N, A, T, FN, E, CP, C, PO, PI, PU);
		this.Fecha_alta=new Fecha(FA);
	}

	
	//Getters and Setters
	public Fecha getFecha_alta() {
		return Fecha_alta;
	}

	public void setFecha_alta(Fecha fecha_alta) {
		Fecha_alta = fecha_alta;
	}

	
	//HashCode
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Fecha_alta);
		return result;
	}

	
	//Equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(Fecha_alta, other.Fecha_alta);
	}

	
	//ToString
	public String toString() {
		return (DNI + " " + Nombre + " " + Apellidos + " " + Telefono + " " + Fecha_nacimiento + 
				" " + Email + " " + Codigo_postal + " " + Calle + " " + Portal + " " + Piso + " " + Puerta + " " + Fecha_alta);
	}	
	
	
	
	
	
	
	
}
