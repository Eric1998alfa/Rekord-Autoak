package car1;

import java.io.Serializable;
import java.util.Objects;

import car1.Vehiculo;

public class Vehiculo implements Comparable<Vehiculo>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2469183365830659245L;
	
	public String Matricula;
	public String Num_Bastidor;
	public String Modelo;
	public String Marca;
	public int KM_Recorridos;
	public int Cilindrada;
	public int Fecha_ITV;
	public String Color;
	public String Tipo;
	
	public Vehiculo(){
		this.Matricula="";
		this.Num_Bastidor="";
		this.Modelo="";
		this.Marca="";
		this.KM_Recorridos=0;
		this.Cilindrada=0;
		this.Fecha_ITV=0;
		this.Color="";
		this.Tipo="";
	}
	
	public Vehiculo(Vehiculo v) {
		this.Matricula=v.Matricula;
		this.Num_Bastidor=v.Num_Bastidor;
		this.Modelo=v.Modelo;
		this.Marca=v.Marca;
		this.KM_Recorridos=v.KM_Recorridos;
		this.Cilindrada=v.Cilindrada;
		this.Fecha_ITV=v.Fecha_ITV;
		this.Color=v.Color;
		this.Tipo=v.Tipo;
	}
	
	public Vehiculo(String M, String NB, String MOD, String MAR, int KM, int CIL, int FI, String C, String T) {
		this.Matricula=M;
		this.Num_Bastidor=NB;
		this.Modelo=MOD;
		this.Marca=MAR;
		this.KM_Recorridos=KM;
		this.Cilindrada=CIL;
		this.Fecha_ITV=FI;
		this.Color=C;
		this.Tipo=T;
	}

	
	//Getters and Setters
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

	
	
	//HashCode
	public int hashCode() {
		return Objects.hash(Cilindrada, Color, Fecha_ITV, KM_Recorridos, Marca, Matricula, Modelo, Num_Bastidor, Tipo);
	}

	
	//Equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(Cilindrada, other.Cilindrada) && Objects.equals(Color, other.Color)
				&& Objects.equals(Fecha_ITV, other.Fecha_ITV) && KM_Recorridos == other.KM_Recorridos
				&& Objects.equals(Marca, other.Marca) && Objects.equals(Matricula, other.Matricula)
				&& Objects.equals(Modelo, other.Modelo) && Num_Bastidor == other.Num_Bastidor
				&& Objects.equals(Tipo, other.Tipo);
	}

	
	//ToString
	public String toString() {
		return (Matricula + " " + Num_Bastidor + " " + Modelo + " " + Marca + " " + KM_Recorridos + " " + Cilindrada + " " + Fecha_ITV + " " + Color + " " + Tipo);
	}

	@Override
	public int compareTo(Vehiculo other) {
		
		return (this.Matricula.compareTo(other.Matricula));
		
	}
	
	
	
	
	
	
	
	
	
}
