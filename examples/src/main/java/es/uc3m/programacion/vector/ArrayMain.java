package es.uc3m.programacion.vector;

import java.util.Arrays;

/**
 * Esta clase muestra algunas operaciones b�sicas con un vector.
 * 
 * 
 * @author chema
 * @version 1.0
 * 
 *
 */
public class ArrayMain {

	public static final int SIZE = 10;

	public static void main(String []args){
		//1-Declaraci�n de un array.
		int [] v1; //De esta forma s�lo declaramos la variable, no se asignan valores, no se reserva memoria, etc. es un array nulo.
		int [] v2 = new int[]{
				1,2,3,4,5,6,7,8,9,10				
		}; //Declaraci�n e inicializaci�n de valores.
		int [] v3 = new int[SIZE]; //Declaraci�n y reserva de memoria.

		//2-Asignar valores en el vector.
		//Los arrays en Java comienzan en 0 hasta length-1. Un array contiene *length* elementos.
		System.out.println("2-Cargar valores en el array...");
		for(int i = 0; i<v3.length;i++){
			v3[i] = 2*i; //Como ejemplo cargamos el valor 2*i en la posici�n i. 
		}


		//3-Mostrar el contenido del array
		System.out.println("3-Mostrar el contenido del array...");
		for(int i = 0; i<v3.length;i++){
			System.out.println("El valor en la posici�n "+i+" es: "+v3[i]);
		}

		//Otra forma de mostrar...
		System.out.println("3.b-Mostrar el contenido del array (m�s elegante)...");
		System.out.println();
		System.out.print("[");
		for(int i = 0; i<v3.length;i++){
			System.out.print(v3[i]+(i<v3.length-1?",":""));
		}
		System.out.println("]");



		//4-Encontrar el primer elemento que cumple una condici�n.
		//Ej: buscar el primer valor mayor de 5.
		System.out.println("4-Buscar el primer elemento que cumple una condici�n...");
		int aBuscar = 5;
		boolean encontrado = Boolean.FALSE;
		//Mientras hay elementos por chequear y el valor no haya sido encontrado...
		for(int i = 0; i<v3.length && !encontrado;i++){
			if(v3[i]>aBuscar){//Chequear la condici�n...
				System.out.println("El valor: "+aBuscar+" se ha encontrado en la posici�n: "+i+" con valor: "+v3[i]);
				encontrado = Boolean.TRUE;
			}
		}

		//5-Encontrar todos los elementos que cumplen una condici�n.
		//Ej: buscar todos los elementos mayores de 5.
		System.out.println("5-Encontrar todos los elementos que cumplen una condici�n...");
		aBuscar = 5;
		//Mientras hay elementos por chequear
		for(int i = 0; i<v3.length;i++){
			if(v3[i]>aBuscar){//Chequear la condici�n...
				System.out.println("El valor: "+aBuscar+" se ha encontrado en la posici�n: "+i+" con valor: "+v3[i]);
			}
		}

		//6-Encontrar el �ltimo elemento que cumple una condici�n.
		//Ej: buscar el �ltimo elemento mayor de 5.
		System.out.println("6-Encontrar el �ltimo elemento que cumple una condici�n...");
		encontrado = Boolean.FALSE;
		//Podemos empezar desde N-1 a 0.
		for(int i = v3.length-1; i>=0 && !encontrado;i--){
			if(v3[i]>aBuscar){
				System.out.println("El valor: "+aBuscar+" se ha encontrado en la posici�n: "+i+" con valor: "+v3[i]);
				encontrado = Boolean.TRUE;
			}
		}
		
	
		//7-Sumar los elementos del array.
		System.out.println("7-Sumar los elementos del array.");
		int suma = 0;
		for(int i = 0; i<v3.length;i++){
			suma = suma + v3[i];
		}
		System.out.println("La suma de los elementos es: "+suma);


		//8-Producto escalar k*v
		System.out.println("8-Producto escalar k*v.");
		int k = 4;
		for(int i = 0; i<v3.length;i++){
			v3[i] = v3[i]*k ;
		}

		//9-Encontrar el valor m�nimo en el array.
		System.out.println("9-Encontrar el valor m�nimo en el array...");
		int min = Integer.MAX_VALUE; //Empezamos con el m�ximo valor que podemos tener, siempre encontraremos uno menor o igual para actualizar.
		for(int i = 0; i<v3.length;i++){
			if(min>v3[i]){//Si el valor m�nimo actual es mayor que el elemento actual...
				min = v3[i]; //El valor m�nimo pasa a ser el elemento actual.
			}
		}
		System.out.println("El valor m�nimo es: "+min);


		//10-Encontrar el valor m�ximo en el array.
		System.out.println("10-Encontrar el valor m�ximo en el array.");
		int max = Integer.MIN_VALUE; //Empezamos con el valor m�nimo que podemos tener, siempre encontraremos uno mayor igual para actualizar.
		for(int i = 0; i<v3.length;i++){
			if(max<v3[i]){//Si el valor m�ximo actual es menor que el elemento actual...
				max = v3[i]; //El valor m�ximo pasa a ser el elemento actual.
			}
		}
		System.out.println("El valor m�ximo es: "+max);


		//11-Ejemplo b�sico de ordenaci�n utilizando el m�todo de la burbuja (sin optimizaciones).
		System.out.println("11-Ejemplo b�sico de ordenaci�n utilizando el m�todo de la burbuja (sin optimizaciones).");
		//http://en.wikipedia.org/wiki/Bubble_sort
		//Mostramos el vector antes de ordenar
		System.out.println();
		System.out.print("[");
		for(int i = 0; i<v3.length;i++){
			System.out.print(v3[i]+(i<v3.length-1?",":""));
		}
		System.out.print("]");
		int temp;
		//Ordenamos en orden descendente		
		for(int i = 0; i<v3.length;i++){//Para cada elemento del array
			for(int j=v3.length-1; j>i;j--){
				if(v3[j-1]<v3[j]){ //Comparamos el elemento actual con el anterior...si es menor, intercambiamos.
					temp = v3[j-1];
					v3[j-1]=v3[j];
					v3[j]=temp;
				}
			}
		}

		//Mostramos el vector...
		System.out.println();
		System.out.print("[");
		for(int i = 0; i<v3.length;i++){
			System.out.print(v3[i]+(i<v3.length-1?",":""));
		}
		System.out.println("]");

		//Ordenamos en orden ascentende
		System.out.println("11.b-Ordenaci�n ascendente...");
		for(int i = 0; i<v3.length;i++){
			for(int j=v3.length-1; j>i;j--){
				if(v3[j-1]>v3[j]){ //Comparamos el elemento actual con el anterior...si es mayor, intercambiamos..
					temp = v3[j-1];
					v3[j-1]=v3[j];
					v3[j]=temp;
				}
			}
		}

		//Mostramos el vector..
		System.out.println();
		System.out.print("[");
		for(int i = 0; i<v3.length;i++){
			System.out.print(v3[i]+(i<v3.length-1?",":""));
		}
		System.out.println("]");

		//Tambi�n se puede utilizar el API de Java
		Arrays.sort(v3);

		//12-Comparaci�n de arrays.
		//LA COMPARACI�N UTILIZANDO EL OPERADOR == ES COMPLETAMENTE ERR�NEA. S�LO COMPARA LA REFERENCIA A MEMORIA PERO
		//NO LOS CONTENIDOS.
		//EN GENERAL: todos los objetos como un array de enteros se deben comparar utilizando una clase comparador y no el operador
		//==
		if(v3==v2){
			System.out.println("Ambos apuntan a la misma diracci�n de memoria pero el tama�o, contenidos, etc. puede ser distinto.");
		}
		//Si no son nulos y tienen la misma longitud...
		boolean sonIguales = (v3!=null && v2!= null && v3.length==v2.length);
		//Ser�n iguales si todas las posiciones tienen los mismos valores.
		for(int i =0;i<v3.length && sonIguales;i++){
			sonIguales = sonIguales && (v3[i]==v2[i]);
		}
		System.out.println("�Iguales?: "+sonIguales);
		//de forma m�s gen�rica...comparando *objects* de tipo entero con el API de Java y la clase Integer.
		sonIguales = (v3!=null && v2!= null  && v3.length==v2.length);
		for(int i =0;i<v3.length && sonIguales;i++){
			sonIguales = sonIguales && (Integer.compare(v3[i],v2[i])==0);
		}
		System.out.println("�Iguales?: "+sonIguales);
		//Usando el API de Java y Arrays
		System.out.println("�Iguales?:"+	Arrays.equals(v3, v2));
		//La comparaci�n de objetos en Java debe ser realizada cuidadosamente. Ver: http://www.artima.com/lejava/articles/equality.html


		//13-Producto vectorial.
		//Si ambos no son nulos y tienen la misma longitud
		if(v2!=null && v3!=null && v3.length==v2.length){
			int productoVectorial = 0;
			for(int i = 0; i<v3.length;i++){
				productoVectorial = productoVectorial + (v3[i]*v2[i]);
			}
			System.out.println("El producto vectorial es "+productoVectorial);

		}

		int contador = 0;
		for(int i = 0; i<v3.length;i++){
			if(aBuscar<v3[i]){
				contador++;
			}
		}

		System.out.println("14-Contar los que sean mayores que: "+contador);




	}


}
