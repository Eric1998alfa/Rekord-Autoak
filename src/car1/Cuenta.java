package car1;

import java.util.Objects;

public class Cuenta extends Persona{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1206167340211110010L;
	
	public String password;
	public int codigo;
	
	public Cuenta() {
		super();
		this.password = "";
		this.codigo = 0;
	}
	
	public Cuenta(Cuenta cu) {
		super(cu);
		this.password = cu.password;
		this.codigo = cu.codigo;
	}
	
	public Cuenta(String P, int cod) {
		super();
		this.password = P;
		this.codigo = cod;
	}
	
	public Cuenta(String D, String N, String A, int T, Fecha FN, String E, int CP, String C, int PO, int PI, String PU, String P, int cod) {
		super(D,N,A,T,FN,E,CP,C,PO,PI,PU);
		this.password = P;
		this.codigo = cod;
	}

	
	//Getters and Setters
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	
	//HashCode
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(codigo, password);
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
		Cuenta other = (Cuenta) obj;
		return codigo == other.codigo && Objects.equals(password, other.password);
	}

	
	//ToString
	public String toString() {
		return (DNI + " " + Nombre + " " + Apellidos + " " + Telefono + 
				" " + Fecha_nacimiento + " " + Email + " " + Codigo_postal + " " + Calle + 
				" " + Portal + " " + Piso + " " + Puerta + " " + password + " " + codigo);
	}
	
	
	
	
	
	
	
}
