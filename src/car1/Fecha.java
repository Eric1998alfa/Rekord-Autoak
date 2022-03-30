package car1;

import java.io.Serializable;
import java.util.Objects;

public class Fecha implements Comparable<Fecha>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5402725963046351341L;
	//Defino la clase Fecha
	//Propiedades de los objetos de la clase
	private int dia;
	private int mes;
	private int a�o;
	
	//Constructores
	//Constructor por defecto
	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.a�o = 2020;
	}
	
	//Constructor copia
	public Fecha(Fecha f) {
		this.dia = f.dia;
		this.mes = f.mes;
		this.a�o = f.a�o;
	}
	
	//Constructores personalizados
	public Fecha(int d, int m, int a) {
		this.dia = d;
		this.mes = m;
		this.a�o = a;
	}
	

	//Getters and Setters
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	
	//Salida de datos
	@Override
	public String toString() {
		return (dia + "/" + mes + "/" + a�o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(a�o, dia, mes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		return a�o == other.a�o && dia == other.dia && mes == other.mes;
	}

	@Override
	public int compareTo(Fecha other) {
		
		if(this.a�o > other.a�o) {
			return 1;
			
		} else if(this.a�o < other.a�o) {
			return -1;
			
		} else {
			//Si los a�os son iguales
			if(this.mes > other.mes) {
				return 1;
				
			} else if(this.mes < other.mes) {
				return -1;
				
			} else {
				//Si los meses son iguales
				if(this.dia > other.dia) {
					return 1;
					
				} else if(this.dia < other.dia) {
					return -1;
					
				}
				
			}
			
			return 0;
			
		}
	
		
		
		
	}
	

	
	
}
