package app;

import java.util.Scanner;

public class App {

	static char[] valor = {'0','1','2','3','4','5','6','7','8','9',
	         'A','B','C','D','E','F'};
	
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		//String res=cambioBase(10,10);
        //System.out.println(res);
		int num,base;
		
		
		System.out.println("Ingresar un número");
		num= lector.nextInt();
		System.out.println("Ingresar una base");
		base= lector.nextInt();
		
		//cambioBase(num, base);
		System.out.println(cambioBase(num,base));
	
	}
	//MÉTODO ITERATIVO SI FUNCIONA BIEN 
	//-------------------------------------------------------------------
	/*public static void Cambio(int n){//n número que se quiere convertir
	
		for (int i = 2; i <=16; i++) { //16 es la base hasta lq que llegan las conversiones
		
			System.out.println("El número " + n + " en base "+i+" es: "+Integer.toString(n,i));
		}
	}*/
	//FIN---------------------------------------------------------------
	//MÉTODO RECURSIVO 
	public static String cambioBase(int a, int b){
		int res = a%b;
		if(a<1){ 
			return ""+valor[res];
		}else{
			return cambioBase(a/b,b)+valor[res];
		}
	}
		
}