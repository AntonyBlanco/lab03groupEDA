import java.util.Scanner;
import java.util.Stack;

public class PilasIguales {
	static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Problemas Con Pilas");
	int [] pila1;//arreglo 1 que almacenara elementos a apilar en una pila 1
	int [] pila2;//arreglo 2 que almacenara elementos a apilar en una pila 2
	int [] pila3;//arreglo 3 que almacenara elementos a apilar en una pila 3
	System.out.print("Ingrese Numero de cilindros de Pila 1: ");
	pila1 = new int [sc.nextInt()];
	agregarCilindros(pila1);
	System.out.print("Ingrese Numero de cilindros de Pila 2: ");
	pila2 = new int [sc.nextInt()];
	agregarCilindros(pila2);
	System.out.print("Ingrese Numero de cilindros de Pila 3: ");
	pila3 = new int [sc.nextInt()];
	agregarCilindros(pila3);
	System.out.println("Representación de Pila 1 ");
	mostrarElementos(pila1);
	System.out.println("Representación de Pila 2");
	mostrarElementos(pila2);
	System.out.println("Representación de Pila 3");
	mostrarElementos(pila3);
}
	//Metodo para igualar pilas.
	public int equalStack(int h1[] , int h2[], int h3[]) {
		 Stack<Integer> pila1 = new Stack<Integer>(); //Primera pila de cilindros
		 Stack<Integer> pila2 = new Stack<Integer>(); //Segunda pila de cilindros
	     Stack<Integer> pila3 = new Stack<Integer>(); //Tercera pila de cilindros
	    
	     int htotal1=0;//Altura Total de primera pila de cilindros
	     int htotal2=0;//Altura Total de segunda pila de cilindros
	     int htotal3=0;//Altura total de tercera pila de cilindros
	   
	     int pilaMInima =0;//altura de pila mas pequeña
	     
	     //Llenamos la pila1 con los elementos del arreglo 1
	     for (int i = 0; i <= h1.length; i++) {
			pila1.push(h1[i]);
			htotal1= htotal1+ h1[i];
		}
	     //Llenamos la pila2 con los elementos del arreglo 2
	     for (int i = 0; i <= h1.length; i++) {
			pila1.push(h1[i]);
			htotal1= htotal1+ h1[i];
		}
	     //Llenamos la pila3 con los elementos del arreglo 3
	     for (int i = 0; i <= h1.length; i++) {
			pila1.push(h1[i]);
			htotal1= htotal1+ h1[i];
		}
	     
	     
		return 0;
	}
	
	//Metodo adicional para agregar Cilindros a la pila (alturas)
	public static void agregarCilindros(int [] pila) {
		int i = 0;
		while (i<=pila.length-1) {
		System.out.print("Agregar Altura de cilindro " + (i+1) + ": ");
			pila [i] = sc.nextInt();
			i++;
		}
	}
	//Metodo adicional para Mostrar elementos de arreglo (Pila)
	public static void mostrarElementos(int [] pila) {
		for (int i=pila.length-1;i>=0;i--) {
			System.out.println("|" + pila[i] + "|");
			System.out.println("---");
		}
	}
	
	//Metodo adicional para mostrar pilas
}
