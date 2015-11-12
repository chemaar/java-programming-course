package es.uc3m.programacion.enclase;

public class TestArray {

	public static int N = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[] = new int[N];
		int v1[] = new int[N];
		int resultado[] = new int[N];
		int i = 0;
		int k = 1;
		//1-Inicializar todas las posiciones con un valor
		for(i = 0; i<v.length;i++){
			v[i] = 0;
		}
		for(i = 0; i<v1.length;i++){
			v1[i] = i;
		}
		//2-Mostrar contenido
		System.out.print("[");
		for(i = 0; i<v.length;i++){
			System.out.print(v[i]+" ");
		}
		System.out.println("]");
		//3-Sumar 5 en posiciones pares y 3 en impares
		for(i = 0; i<v.length;i++){
			if(i%2==0){
				v[i] = v[i]+5;
			}else{
				v[i] = v[i]+1;
			}
		}
		System.out.print("[");
		for(i = 0; i<v.length;i++){
			System.out.print(v[i]+" ");
		}
		System.out.println("]");
		//4-Producto escalar
		for(i = 0; i<v.length;i++){
			v[i] = k*v[i];
		}
		//5-Buscar el 1� valor menor que 3, mostrar posici�n y valor y parar.
		boolean encontrado = false;
		for(i = 0; (i<v.length && !encontrado);i++){
			if(v[i]<3){
				encontrado = true;
				System.out.println("Pos: "+i+" valor: "+v[i]);
			}
		}
		//6-Sumar los elementos del array
		int suma = 0;
		for(i = 0; i<v.length;i++){
			suma = suma + v[i];
		}
		//7-Buscar el �ltimo valor menor 3
		int pos = -1;
		for(i = 0; i<v.length;i++){
			if(v[i]<3){
				pos = i;
			}
		}
		if(pos!=-1){
			System.out.println("Pos: "+pos+" valor: "+v[pos]);
		}

		//7 v2
		
		encontrado = false;
		for(i = v.length-1; (i>=0 && !encontrado);i--){
			if(v[i]<3){
				encontrado = true;
				System.out.println("Pos: "+i+" valor: "+v[i]);
			}
		}
		//8-Producto vectorial
		if(v.length == v1.length){
			for(i=0;i<v.length;i++){
				resultado [i] = v[i]*v1[i];
			}
		}
		//9-Contar el n� de elementos mayor de 3
		int contador = 0;
		for(i=0;i<v.length;i++){
			if(v[i]>3 && i%2==0){
				contador++;
			}
		}
		System.out.println("Se han encontrado: "+contador+" n�meros mayor de 3.");
	}

}
