package es.uc3m.programacion.basico;

import java.util.Scanner;

public class EjemploLeerLinea {
	
	public static void main(String []args){
		Scanner sc = new Scanner (System.in);
		String valorLeido = null;
		do{
			valorLeido = null; //Reiniciamos el valor en cada iteración
			valorLeido = sc.nextLine();
			if(valorLeido==null || valorLeido.length()==0){
				//No hay valor
				System.out.println("Vacío...se va a acabar el bucle.");
			}else{
				//Tenemos un valor
				//Hacer algo: en este caso sólo eco
				System.out.println(valorLeido);
			}
			
		}while((valorLeido!=null) && (valorLeido.length()!=0));
	}

}
