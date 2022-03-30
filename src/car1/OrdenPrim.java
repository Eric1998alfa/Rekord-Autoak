package car1;

import java.io.Serializable;
import java.util.Objects;

import car1.Fecha;
import car1.OrdenPrim;

@SuppressWarnings("unused")
public class OrdenPrim implements Comparable<OrdenPrim>, Serializable {
	
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
	public Fecha Fecha_alta;
	
	public String Matricula;
	public String Num_Bastidor;
	public String Modelo;
	public String Marca;
	public int KM_Recorridos;
	public int Cilindrada;
	public int Fecha_ITV;
	public String Color;
	public String Tipo;
	
	public String Comentarios;
	public String CodOrdenprim;

	
	public OrdenPrim() {
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
		this.Fecha_alta=new Fecha();
		
		this.Matricula="";
		this.Num_Bastidor="";
		this.Modelo="";
		this.Marca="";
		this.KM_Recorridos=0;
		this.Cilindrada=0;
		this.Fecha_ITV=0;
		this.Color="";
		this.Tipo="";
		
		this.Comentarios="";
		this.CodOrdenprim="";
	}
	
	public OrdenPrim(OrdenPrim op) {
		this.DNI=op.DNI;
		this.Nombre=op.Nombre;
		this.Apellidos=op.Apellidos;
		this.Telefono=op.Telefono;
		this.Fecha_nacimiento=new Fecha(op.Fecha_nacimiento);
		this.Email=op.Email;
		this.Codigo_postal=op.Codigo_postal;
		this.Calle=op.Calle;
		this.Portal=op.Portal;
		this.Piso=op.Piso;
		this.Puerta=op.Puerta;
		this.Fecha_alta=new Fecha(op.Fecha_alta);
		
		this.Matricula=op.Matricula;
		this.Num_Bastidor=op.Num_Bastidor;
		this.Modelo=op.Modelo;
		this.Marca=op.Marca;
		this.KM_Recorridos=op.KM_Recorridos;
		this.Cilindrada=op.Cilindrada;
		this.Fecha_ITV=op.Fecha_ITV;
		this.Color=op.Color;
		this.Tipo=op.Tipo;
		
		this.Comentarios=op.Comentarios;
		this.CodOrdenprim=op.CodOrdenprim;
	}
	
	public OrdenPrim(String D, String N, String A, int Tel, Fecha FN, String E, int CP, String C, int PO, int PI, String PU, Fecha FA, String M, String NB, String MOD, String MAR, int KM, int CIL, int FI, String Co, String T, String Com, String CodOP) {
		this.DNI=D;
		this.Nombre=N;
		this.Apellidos=A;
		this.Telefono=Tel;
		this.Fecha_nacimiento= new Fecha(FN);
		this.Email=E;
		this.Codigo_postal=CP;
		this.Calle=C;
		this.Portal=PO;
		this.Piso=PI;
		this.Puerta=PU;
		this.Fecha_alta=new Fecha(FA);
		
		this.Matricula=M;
		this.Num_Bastidor=NB;
		this.Modelo=MOD;
		this.Marca=MAR;
		this.KM_Recorridos=KM;
		this.Cilindrada=CIL;
		this.Fecha_ITV=FI;
		this.Color=Co;
		this.Tipo=T;
		
		this.Comentarios=Com;
		this.CodOrdenprim=CodOP;
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

	public Fecha getFecha_alta() {
		return Fecha_alta;
	}

	public void setFecha_alta(Fecha fecha_alta) {
		Fecha_alta = fecha_alta;
	}

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	public String getNum_Bastidor() {
		return Num_Bastidor;
	}

	public void setNum_Bastidor(String num_Bastidor) {
		Num_Bastidor = num_Bastidor;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public int getKM_Recorridos() {
		return KM_Recorridos;
	}

	public void setKM_Recorridos(int kM_Recorridos) {
		KM_Recorridos = kM_Recorridos;
	}

	public int getCilindrada() {
		return Cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		Cilindrada = cilindrada;
	}

	public int getFecha_ITV() {
		return Fecha_ITV;
	}

	public void setFecha_ITV(int fecha_ITV) {
		Fecha_ITV = fecha_ITV;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getComentarios() {
		return Comentarios;
	}

	public void setComentarios(String comentarios) {
		Comentarios = comentarios;
	}

	public String getCodOrdenprim() {
		return CodOrdenprim;
	}

	public void setCodOrdenprim(String codOrdenprim) {
		CodOrdenprim = codOrdenprim;
	}

	
	//HashCode
	public int hashCode() {
		return Objects.hash(Apellidos, Calle, Cilindrada, CodOrdenprim, Codigo_postal, Color, Comentarios,
				DNI, Email, Fecha_ITV, Fecha_alta, Fecha_nacimiento, KM_Recorridos, Marca, Matricula, Modelo, Nombre,
				Num_Bastidor, Piso, Portal, Puerta, Telefono, Tipo);
	}
	
	
	
	//Equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrdenPrim other = (OrdenPrim) obj;
		return Objects.equals(Apellidos, other.Apellidos)
				&& Objects.equals(Calle, other.Calle) && Cilindrada == other.Cilindrada
				&& Objects.equals(CodOrdenprim, other.CodOrdenprim) && Codigo_postal == other.Codigo_postal
				&& Objects.equals(Color, other.Color) && Objects.equals(Comentarios, other.Comentarios)
				&& Objects.equals(DNI, other.DNI) && Objects.equals(Email, other.Email)
				&& Objects.equals(Fecha_ITV, other.Fecha_ITV) && Objects.equals(Fecha_alta, other.Fecha_alta)
				&& Objects.equals(Fecha_nacimiento, other.Fecha_nacimiento) && KM_Recorridos == other.KM_Recorridos
				&& Objects.equals(Marca, other.Marca) && Objects.equals(Matricula, other.Matricula)
				&& Objects.equals(Modelo, other.Modelo) && Objects.equals(Nombre, other.Nombre)
				&& Objects.equals(Num_Bastidor, other.Num_Bastidor) && Piso == other.Piso && Portal == other.Portal
				&& Objects.equals(Puerta, other.Puerta) && Telefono == other.Telefono
				&& Objects.equals(Tipo, other.Tipo);
	}

	
	//ToString
	public String toString() {
		return (DNI + " " + Nombre + " " + Apellidos + " " + Telefono + " " + Fecha_nacimiento + " " + Email + " " 
				+ Codigo_postal + " " + Calle + " " + Portal + " " + Piso + " " + Puerta + " " + Matricula + " " + Num_Bastidor + " " 
				+ Modelo + " " + Marca + " " + KM_Recorridos + " " + Cilindrada + " " + Fecha_ITV + " " + Color + " " + Tipo + " " 
				+ Comentarios + " " + CodOrdenprim);
	}




	//CompareTo
	public int compareTo(OrdenPrim other) {
		
		return (this.CodOrdenprim.compareTo(other.CodOrdenprim));
		
	}
	
	
	
	
	
	
	
	
	
}
