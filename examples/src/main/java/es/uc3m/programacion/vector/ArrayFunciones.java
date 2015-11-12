package es.uc3m.programacion.vector;

import java.util.Arrays;

/**
 * Esta clase muestra algunas operaciones b�sicas con un vector mediante el uso de funciones e intentando proteger el c�digo.
 * 
 * 
 * @author chema
 * @version 1.0
 * 
 *
 */
public class ArrayFunciones {

	public static final int TAMANYO = 10;

	/**
	 * Dado un tama�o y un valor inicial, esta funci�n crea un nuevo vector de tama�o *tamanyo* y cuyos 
	 * elementos tienen de valor inicial *valorInicial*.
	 * @param tamanyo Longitud del array.
	 * @param valorInicial Valor inicial para todas las posiciones.
	 * @return Un nuevo array del tama�o requerido inicializado con el valor inicial pasado como par�metro. Si el tama�o es menor que 0 se devuelve un array vac�o.
	 */
	public static int [] crearArray(int tamanyo,int valorInicial){
		if(tamanyo>0){
			int [] v = new int[tamanyo];
			for(int i = 0; i<v.length;i++){
				v[i]=valorInicial;
			}
			return v;
		}
		return new int[0];
	}

	/**
	 * Dado un array no nulo de valores enteros, esta funci�n muestra por pantalla los contenidos, una l�nea por cada elemento.
	 * @param v Un array no nulo de valores enteros.
	 */
	public static void mostrar(int []v){
		if(v!=null){
			for(int i = 0; i<v.length;i++){
				System.out.println("El valor en la posici�n "+i+" es: "+v[i]);
			}
		}else{
			System.out.println(v);
		}

	}

	/**
	 * Dado un array no nulo de valores enteros, esta funci�n muestra por pantalla los contenidos de una forma m�s elegante.
	 * @param v Un array no nulo de valores enteros.
	 */
	public static void mostrarElegante(int []v){
		if(v!=null){
			System.out.println();
			System.out.print("[");
			for(int i = 0; i<v.length;i++){
				System.out.print(v[i]+(i<v.length-1?",":""));
			}
			System.out.println("]");
		}else{
			System.out.println(v);
		}

	}

	public static void mostrarElegante(Object []v){
		if(v!=null){
			System.out.println();
			System.out.print("[");
			for(int i = 0; i<v.length;i++){
				System.out.print(v[i]+(i<v.length-1?",":""));
			}
			System.out.println("]");
		}else{
			System.out.println(v);
		}
	}


	/**
	 * Dado un array no nulo de valores enteros, esta funci�n devuelve la posici�n del primer valor que cumple la condici�n de 
	 * ser igual al valor pasado como par�metro.
	 * @param v Un array no nulo de valores enteros.
	 * @param valor El valor a buscar
	 * @return -1 si el valor no se encuentra o la posici�n en la que el valor se encontr�.
	 */
	public static int encontrarElPrimero(int []v, int valor){
		boolean encontrado = Boolean.FALSE;
		int posicion = -1;
		if(v!=null){
			for(int i = 0; i<v.length && !encontrado;i++){
				if(v[i]==valor){
					encontrado = Boolean.TRUE;
					posicion = i;
				}
			}	
		}
		return posicion;
	}

	/**
	 * Dado un array no nulo de valores enteros, esta funci�n devuelve un array de valores booleanos indicando si en la posici�n i
	 * es igual al valor pasado como par�metro.
	 * @param v Un array no nulo de valores enteros.
	 * @param valor El valor a buscar
	 * @return Un array de valores booleanos en la que una posici�n a true indica que v[i]==valor.
	 */
	public static Boolean[] encontrarTodos(int []v, int valor){
		if(v!=null){
			Boolean []posiciones = new Boolean[v.length];
			for(int i = 0; i<v.length;i++){
				posiciones[i] = (v[i]==valor);
			}
			return posiciones;	
		}
		return new Boolean[0];

	}


	/**
	 * Dado un array no nulo de valores enteros, esta funci�n devuelve la �ltima del primer valor que cumple la condici�n de 
	 * ser igual al valor pasado como par�metro.
	 * @param v Un array no nulo de valores enteros.
	 * @param valor The value to search.
	 * @return -1 si el valor no se encuentra o la posici�n en la que el valor se encontr�.
	 */
	public static int encontrarElUltimo(int []v, int valor){
		boolean encontrado = Boolean.FALSE;
		int posicion = -1;
		if(v!=null){
			for(int i = v.length-1; i>=0 && !encontrado;i--){
				if(v[i]>valor){
					posicion = i;
					encontrado = Boolean.TRUE;
				}
			}
		}

		return posicion;
	}

	/**
	 * Dado un array no nulo de valores enteros, esta funci�n suma todos los elementos.
	 * @param v Un array no nulo de valores enteros.
	 * @return La suma de todos los valores o 0 en caso de que sea nulo.
	 */
	public static int suma(int[] v) {
		int sum = 0;
		if(v!=null){
			for(int i = 0; i<v.length;i++){
				sum = sum + v[i];
			}
		}

		return sum;
	}

	/**
	 * Dado un array no nulo de valores enteros, esta funci�n implementa el producto escalar.
	 * @param v Un array no nulo de valores enteros.
	 * @param k Una constante de tipo entero.
	 * @return El producto escalar.
	 */
	public static int [] productoEscalar(int[] v, int k) {
		if(v!=null){
			for(int i = 0; i<v.length;i++){
				v[i] = v[i]*k ;
			}	
		}
		return v;
	}

	/**
	 * Dado un array no nulo de valores enteros, esta funci�n buscar el m�ximo valor en el array.
	 * @param v  Un array no nulo de valores enteros.
	 * @return El valor m�ximo o Integer.MIN_VALUE si no hay ning�n elemento.
	 */
	public static int max(int[] v) {
		int max = Integer.MIN_VALUE;
		if(v!=null){
			for(int i = 0; i<v.length;i++){
				if(max<v[i]){
					max = v[i]; 
				}
			}
		}
		return max;
	}

	/**
	 * Dado un array no nulo de valores enteros, esta funci�n buscar el m�nimo valor en el array.
	 * @param v  Un array no nulo de valores enteros.
	 * @return El valor m�nimo o Integer.MAX_VALUE si no hay ning�n elemento.
	 */
	public static int min(int[] v) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i<v.length;i++){
			if(min>v[i]){
				min = v[i]; 
			}
		}
		return min;
	}

	/**
	 * Dados dos arrays no nulos de valores enteros, esta funci�n compara ambos arrays.
	 * @param v1 Un array no nulo de valores enteros.
	 * @param v2 Un array no nulo de valores enteros.
	 * @return True si los arrays son iguales (tienen los mismos valores) y False en otro caso.
	 */
	public static boolean comparar(int []v1, int []v2){
		boolean sonIguales = (v1!=null && v2!= null && v1.length==v2.length);
		for(int i =0;i<v1.length && sonIguales;i++){
			sonIguales = sonIguales && (v1[i]==v2[i]);
		}
		return sonIguales;
	}

	/**
	 * Dados dos arrays no nulos de valores enteros, esta funci�n compara ambos arrays utilizando la funci�n Integer.compare.
	 * @param v1 Un array no nulo de valores enteros.
	 * @param v2 Un array no nulo de valores enteros.
	 * @return True si los arrays son iguales (tienen los mismos valores) y False en otro caso.
	 */
	public static boolean comparar2(int []v1, int []v2){
		boolean areEquals = (v1!=null && v2!= null  && v1.length==v2.length);
		for(int i =0;i<v1.length && areEquals;i++){
			areEquals = areEquals && (Integer.compare(v1[i],v2[i])==0);
		}
		return areEquals;
	}

	/**
	 * Dados dos arrays no nulos de valores enteros, esta funci�n compara ambos arrays utilizando el API de Arrays de Java.
	 * @param v1 Un array no nulo de valores enteros.
	 * @param v2 Un array no nulo de valores enteros.
	 * @return True si los arrays son iguales (tienen los mismos valores) y False en otro caso.
	 */
	public static boolean comparar3(int []v1, int []v2){
		return Arrays.equals(v1, v2);
	}

	/**
	 * Dados dos arrays no nulos de valores enteros, esta funci�n realiza el producto vectorial
	 * @param v1 Un array no nulo de valores enteros.
	 * @param v2 Un array no nulo de valores enteros.
	 * @return El producto vectorial de los dos vectores.
	 */
	public static int productoVectorial(int []v1, int []v2){
		int productoVectorial = 0;
		if(v1!=null && v2!=null && v1.length==v2.length){
			for(int i = 0; i<v1.length;i++){
				productoVectorial = productoVectorial + (v1[i]*v2[i]);
			}
		}
		return productoVectorial;
	}

	/**
	 * Dado un array no nulo de valores enteros, esta funci�n ordena los elementos de forma ascendente.
	 * @param v Un array no nulo de valores enteros.
	 * @retun El array ordenado.
	 */
	public static int [] ordenarAscendente(int[] v) {
		int temp;
		for(int i = 0; i<v.length;i++){
			for(int j=v.length-1; j>i;j--){
				if(v[j-1]>v[j]){
					temp = v[j-1];
					v[j-1]=v[j];
					v[j]=temp;
				}
			}
		}
		return v;
	}

	/**
	 * Dado un array no nulo de valores enteros, esta funci�n ordena los elementos de forma descendente.
	 * @param v Un array no nulo de valores enteros.
	 * @retun El array ordenado.
	 */
	public static void ordenarDescendente(int[] v) {
		int temp;
		for(int i = 0; i<v.length;i++){
			for(int j=v.length-1; j>i;j--){
				if(v[j-1]<v[j]){ 
					temp = v[j-1];
					v[j-1]=v[j];
					v[j]=temp;
				}
			}
		}
	}

	/**
	 * Dado un array no nulo de valores enteros, esta funci�n cuenta el n�mero de valores que son mayores que el valor del par�metro.
	 * @param v  Un array no nulo de valores enteros..
	 * @param valor El valor a chequear.
	 * @return El n�mero de elementos que cumplen la condici�n de ser mayores que el valor pasado como par�metro.
	 */
	public static int contarLosMayoresQue(int []v, int valor){
		int contador = 0;
		if(v!=null){
			for(int i = 0; i<v.length;i++){
				if(valor<v[i]){
					contador++;
				}
			}	
		}
		return contador;
	}

	public static void main(String []args){
		int aBuscar = 5;
		//1-Declaraci�n de un array.
		int [] v1 = crearArray(TAMANYO, 1);
		int [] v2 = crearArray(TAMANYO, 2);
		
		//3-Mostrar el contenido del array
		System.out.println("3-Mostrar el contenido del array...");
		mostrar(v1);
		System.out.println("3.b-Mostrar el contenido del array (m�s elegante)...");
		mostrarElegante(v1);
		
		//4-Encontrar el primer elemento que cumple una condici�n.
		//Ej: buscar el primer valor mayor de 5.
		System.out.println("4-Encontrar el primer elemento que cumple una condici�n...");
		int pos = encontrarElPrimero(v1, aBuscar);
		System.out.println("The value was found at position: "+pos);

		//5-Encontrar todos los elementos que cumplen una condici�n.
		//Ej: buscar todos los elementos mayores de 5.
		System.out.println("5-Encontrar todos los elementos que cumplen una condici�n...");
		mostrarElegante(encontrarTodos(v1, aBuscar));
		
		//6-Encontrar el �ltimo elemento que cumple una condici�n.
		//Ej: buscar el �ltimo elemento mayor de 5.
		System.out.println("6-Encontrar el �ltimo elemento que cumple una condici�n...");
		pos = encontrarElUltimo(v1, aBuscar);
		System.out.println("El valor: "+aBuscar+" se ha encontrado en la posici�n: "+pos);

		//7-Sumar los elementos del array.
		System.out.println("7-Sumar los elementos del array.");
		int suma = suma(v1);
		System.out.println("La suma de los elementos es: "+suma);


		//8-Producto escalar k*v
		System.out.println("8-Producto escalar k*v.");
		int k = 4;
		mostrarElegante(productoEscalar(v1,k));

		//9-Encontrar el valor m�nimo en el array.
		System.out.println("9-Encontrar el valor m�nimo en el array...");
		int min = min(v1);
		System.out.println("El valor m�nimo es: "+min);
		
		//10-Encontrar el valor m�ximo en el array.
		System.out.println("10-Encontrar el valor m�ximo en el array.");
		int max = max(v1);
		System.out.println("El valor m�ximo es: "+max);
		
		//11-Ejemplo b�sico de ordenaci�n utilizando el m�todo de la burbuja (sin optimizaciones).
		System.out.println("11-Ejemplo b�sico de ordenaci�n utilizando el m�todo de la burbuja (sin optimizaciones).");
		//http://en.wikipedia.org/wiki/Bubble_sort
		//Mostramos el vector antes de ordenar
		mostrarElegante(v1);

		//Descendente		
		ordenarDescendente(v1);

		//Mostramos el vector despu�s...
		mostrarElegante(v1);

		//Ascendente
		System.out.println("11.b-Ordenaci�n ascendente...");
		ordenarAscendente(v1);

		//Tambi�n se puede utilizar el API de Java
		mostrarElegante(v1);

		//Usando el API de Java y Arrays
		Arrays.sort(v1);
		
		//12-Comparaci�n.
		System.out.println("12-Comparaci�n de dos vectores...");
		System.out.println("�Iguales?: "+comparar(v1, v1));
		System.out.println("�Iguales?: "+comparar(v1, v2));
		System.out.println("�Iguales?: "+comparar2(v1, v1));
		System.out.println("�Iguales?: "+comparar2(v1, v2));
		System.out.println("�Iguales?: "+comparar3(v1, v1));
		System.out.println("�Iguales?: "+comparar3(v1, v2));
		
		//13-Productor vectorial
		System.out.println("13-Producto vectorial: "+productoVectorial(v1, v2));

		//14-Contar los que son mayores que...
		System.out.println("14-Contar mayores que...: "+contarLosMayoresQue(v1, 3));
	}





}
