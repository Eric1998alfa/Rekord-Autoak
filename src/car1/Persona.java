package car1;

import java.io.Serializable;
import java.util.Objects;

import car1.Fecha;
import car1.Persona;

@SuppressWarnings("unused")
public class Persona implements Comparable<Persona>, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6717239572208402072L;
	public String DNI;
	public String Nombre;
	public String Apellidos;
	public int Telefono;
	public Fecha Fecha_nacimiento;
	public String Email;
	public int Codigo_postal;
	public String Calle;
	public int Portal;
	public int Piso;
	public String Puerta;

	
	public Persona() {
		this.DNI="";
		this.Nombre="";
		this.Apellidos="";
		this.Telefono=0;
		this.Fecha_nacimiento=new Fecha(); 
		this.Email="";
		this.Codigo_postal=0;
		this.Calle="";
		this.Portal=0;
		this.Piso=0;
		this.Puerta="";
	}
	
	public Persona(Persona p) {
		this.DNI=p.DNI;
		this.Nombre=p.Nombre;
		this.Apellidos=p.Apellidos;
		this.Telefono=p.Telefono;
		this.Fecha_nacimiento=new Fecha(p.Fecha_nacimiento);
		this.Email=p.Email;
		this.Codigo_postal=p.Codigo_postal;
		this.Calle=p.Calle;
		this.Portal=p.Portal;
		this.Piso=p.Piso;
		this.Puerta=p.Puerta;
	}
	
	public Persona(String D, String N, String A, int T, Fecha FN, String E, int CP, String C, int PO, int PI, String PU) {
		this.DNI=D;
		this.Nombre=N;
		this.Apellidos=A;
		this.Telefono=T;
		this.Fecha_nacimiento= new Fecha(FN);
		this.Email=E;
		this.Codigo_postal=CP;
		this.Calle=C;
		this.Portal=PO;
		this.Piso=PI;
		this.Puerta=PU;
	}

	//Getters and Setters
	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int telefono) {
		Telefono = telefono;
	}

	public Fecha getFecha_nacimiento() {
		return Fecha_nacimiento;
	}

	public void setFecha_nacimiento(Fecha fecha_nacimiento) {
		Fecha_nacimiento = fecha_nacimiento;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getCodigo_postal() {
		return Codigo_postal;
	}

	public void setCodigo_postal(int codigo_postal) {
		Codigo_postal = codigo_postal;
	}

	public String getCalle() {
		return Calle;
	}

	public void setCalle(String calle) {
		Calle = calle;
	}

	public int getPortal() {
		return Portal;
	}

	public void setPortal(int portal) {
		Portal = portal;
	}

	public int getPiso() {
		return Piso;
	}

	public void setPiso(int piso) {
		Piso = piso;
	}

	public String getPuerta() {
		return Puerta;
	}

	public void setPuerta(String puerta) {
		Puerta = puerta;
	}

	
	//HashCode
	public int hashCode() {
		return Objects.hash(Apellidos, Calle, Codigo_postal, DNI, Email, Fecha_nacimiento, Nombre, Piso,
				Portal, Puerta, Telefono);
	}

	
	//Equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(Apellidos, other.Apellidos)
				&& Objects.equals(Calle, other.Calle) && Codigo_postal == other.Codigo_postal
				&& Objects.equals(DNI, other.DNI) && Objects.equals(Email, other.Email)
				&& Objects.equals(Fecha_nacimiento, other.Fecha_nacimiento) && Objects.equals(Nombre, other.Nombre)
				&& Piso == other.Piso && Portal == other.Portal && Objects.equals(Puerta, other.Puerta)
				&& Telefono == other.Telefono;
	}

	
	//ToString
	public String toString() {
		return (DNI + " " + Nombre + " " + Apellidos +  " " + Telefono + " " + Fecha_nacimiento + 
				" " + Email + " " + Codigo_postal + " " + Calle + " " + Portal + " " + Piso + " " + Puerta);
	}

	
	//CompareTo
	public int compareTo(Persona other) {
		
		return (this.DNI.compareTo(other.DNI));
		
	}
	
	
	
	
	
	
	
	
	
}
