package car1;

import java.io.Serializable;
import java.util.Objects;

public class Material implements Comparable<Material>, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4533693024823055118L;
	
	public String Nombre;
	public double Precio;
	
	public Material() {
		this.Nombre="";
		this.Precio=0.0;
	}
	
	public Material(Material m) {
		this.Nombre=m.Nombre;
		this.Precio=m.Precio;
	}
	
	public Material(String N, double P) {
		this.Nombre=N;
		this.Precio=P;
	}

	
	//Getters and Setters
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	
	//HashCode
	public int hashCode() {
		return Objects.hash(Nombre, Precio);
	}

	
	//Equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Material other = (Material) obj;
		return Objects.equals(Nombre, other.Nombre)
				&& Double.doubleToLongBits(Precio) == Double.doubleToLongBits(other.Precio);
	}

	
	//ToString
	public String toString() {
		return (Nombre + " " + Precio);
	}

	@Override
	public int compareTo(Material other) {
		
		return (this.Nombre.compareTo(other.Nombre));
		
	}
	
	
	
	
	
	
}
