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
	private int año;
	
	//Constructores
	//Constructor por defecto
	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.año = 2020;
	}
	
	//Constructor copia
	public Fecha(Fecha f) {
		this.dia = f.dia;
		this.mes = f.mes;
		this.año = f.año;
	}
	
	//Constructores personalizados
	public Fecha(int d, int m, int a) {
		this.dia = d;
		this.mes = m;
		this.año = a;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	
	//Salida de datos
	@Override
	public String toString() {
		return (dia + "/" + mes + "/" + año);
	}

	@Override
	public int hashCode() {
		return Objects.hash(año, dia, mes);
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
		return año == other.año && dia == other.dia && mes == other.mes;
	}

	@Override
	public int compareTo(Fecha other) {
		
		if(this.año > other.año) {
			return 1;
			
		} else if(this.año < other.año) {
			return -1;
			
		} else {
			//Si los años son iguales
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
