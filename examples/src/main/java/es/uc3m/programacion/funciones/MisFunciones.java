package es.uc3m.programacion.funciones;

public class MisFunciones {
	
	public static int sumaV(int v[]){
		if(v!=null){
			int resultado = 0;
			for(int i =0;i<v.length;i++){
				resultado = resultado+v[i];
			}
			return resultado;
		}else{
			throw new NullPointerException();
		}
		
	}
	
	public static int [] suma (int []v1, int []v2){
		if(v1==null || v2==null || v1.length!=v2.length){
			return new int[0];
		}
		int []resultado = new int[v1.length];
		for(int i=0;i<resultado.length;i++){
			resultado[i] = v1[i]+v2[i];
		}
		return resultado;
	}
	
	public static int mipotencia(int base, int exponente){
		if(exponente>0){
			if(exponente==0){
				return 1;
			}
			int mipow = 1;
			for(int i=0;i<exponente;i++){
				mipow = mipow*base;
			}
			return mipow;
		}else{
			return -1;
		}
	}
	
	public static boolean esBisiesto(int anyo){
        boolean isLeapYear = (anyo % 4 == 0);
        isLeapYear = isLeapYear && (anyo % 100 != 0);
        isLeapYear = isLeapYear || (anyo % 400 == 0);
        return isLeapYear;	
	}
	public static boolean esImPar(int a){
		return (a%2!=0);
	}
	public static boolean esImPar2(int a){
		return !esPar(a);
	}
	public static boolean esPar(int a){
		return (a%2==0);
	}
	
	public static int absInt(int a){
		if(a<0){
			return -a;
		}
		return a;
	}
	
	public static double coeficiente(int n, int k){
		if(n<0 || k<0 || (n-k)==0){
			return -1;
		}else{
			if (k==0){
				return 1;
			}
			if(n==0){
				return 0;
			}
			return (double)factorial(n)/
					(factorial(n)*factorial(n-k));
		}
	}
	
	public static int factorial(int n){
		if(n<0){
			return -1;
		}else if(n==0 || n==1){
			return 1;
		}else{
			int result = 1;
			for(int i = 1;i<=n;i++){
				result = result * i;
			}
			return result;
		}
	}
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(coeficiente(5,2));
		System.out.println(absInt(-1));
		System.out.println(absInt(1));
		System.out.println(esPar(2));
		System.out.println(esPar(3));
		System.out.println(mipotencia(2, 3));

	}

}
