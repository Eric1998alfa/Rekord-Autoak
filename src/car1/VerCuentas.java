package car1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class VerCuentas {

	public static void main(String[] args) {
		//GUARDAR
		/*
		LoginSer ls1 = new LoginSer("admin","admin",1);
		LoginSer ls2 = new LoginSer("mec","mec",2);
		
		// Guardo el complejo en login.dat
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try {
			
			//Output -> Write
			//Input -> Read
			
			// Abro el fichero
			fos = new FileOutputStream("login.dat", true);
			oos = new ObjectOutputStream (fos);
			
			// lo grabo
			oos.writeObject(ls1);
			oos.writeObject(ls2);
			
			// cierro el fichero
			oos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		*/
		
	
		// Leo el contenido de login.dat
		FileInputStream fis; 
		ObjectInputStream ois;
		
		String txtdni;
		txtdni = "38351984J";
		
		Cuenta cu = new Cuenta();
		
		File f = new File("C:\\tmp\\cuentas\\" + txtdni + ".dat");
		
		try {
			
			// Abro el fichero
			fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);
			
			// Leo todo el contenido
			while (fis.available() > 0) {
				
				cu = (Cuenta) ois.readObject();
				
				//Lo muestra por pantalla
				//System.out.println(cu.getCodigo());
				
				System.out.println(cu);
				
			}
			
			// Lo cierra
			ois.close();
			fis.close();
			
		} catch (IOException e) {

			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
		
	}
	

}
