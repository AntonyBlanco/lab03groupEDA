//Implementación de ejercicio propuesto "Pilas iguales"-Enlace--> https://github.com/rescobedoq/eda/tree/main/labs/lab03
//Autor: Edisson Franklin Checalla Soto
//Escuela Profesional de Ingenieria De Sistemas
//Universidad Nacional de san Agustin
//05/06/2022
import java.util.Scanner;
import java.util.Stack;

public class PilasIguales {
	static Scanner sc = new Scanner(System.in);
	static  Stack<Integer> pila1 = new Stack<Integer>(); //Primera pila de cilindros
	static Stack<Integer> pila2 = new Stack<Integer>(); //Segunda pila de cilindros
	static Stack<Integer> pila3 = new Stack<Integer>(); //Tercera pila de cilindros
	    //Metodo para igualar pilas.
	public static int equalStack(int h1[] , int h2[], int h3[]) {
	
	     int htotal1=0;//Altura Total de primera pila de cilindros
	     int htotal2=0;//Altura Total de segunda pila de cilindros
	     int htotal3=0;//Altura total de tercera pila de cilindros
	   
	     int pilaMinima =0;//altura de pila mas pequeña
	     
	     //Llenamos la pila1 con los elementos del arreglo 1
	     for (int i = 0;i<=h1.length-1; i++) {
			pila1.push(h1[i]);
			htotal1= htotal1+ h1[i];
		}
	     //Llenamos la pila2 con los elementos del arreglo 2
	     for (int i = 0;i<=h2.length-1; i++) {
			pila2.push(h2[i]);
			htotal2= htotal2+ h2[i];
		}
	     //Llenamos la pila3 con los elementos del arreglo 3
	     for (int i = 0;i<=h3.length-1; i++) {
			pila3.push(h3[i]);
			htotal3= htotal3+ h3[i];
		}
	   //mostrarStack(pila1, pila2, pila3); 
	     pilaMinima = Math.min(htotal1,Math.min(htotal2,htotal3)); //Initialize minStack with the minimum height
	     
	        //Las pilas estaran igualadas solo hasta que las alturas de todas sean iguales
	        while(htotal1 != htotal2 || htotal1 != htotal3) {
	            //Retira los cilindros de la pila 1 hasta que su altura sea <= a la más pequeña
	            while(htotal1 > pilaMinima){
	                htotal1 -= pila1.pop();
	            }
	            pilaMinima = Math.min(htotal1,Math.min(htotal2,htotal3)); //Recalculate min
	 
	          //Retira los cilindros de la pila 2 hasta que su altura sea <= a la más pequeña
	            while(htotal2 > pilaMinima){
	                htotal2 -= pila2.pop();
	            }
	            pilaMinima = Math.min(htotal1,Math.min(htotal2,htotal3)); //Recalculate min
	 
	          //Retira los cilindros de la pila 3 hasta que su altura sea <= a la más pequeña
	            while(htotal3 > pilaMinima){
	                htotal3 -= pila3.pop();
	            }
	            pilaMinima = Math.min(htotal1,Math.min(htotal2,htotal3)); //Recalculate min
	        }
	      
	        return pilaMinima;
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
		}
	}
	//metodo Adicional para mostrar elementos de pilas despues de ser igualadas
	public static void mostrarStack(Stack<Integer>pila1,Stack<Integer>pila2, Stack<Integer>pila3) {
		System.out.println("Representacion final de Pila 1");
		while (pila1.empty()==false) {
			System.out.println("|"+ pila1.pop() +"|");
		}
		System.out.println("Representacion final de Pila 2");
		while (pila2.empty()==false) {
			System.out.println("|"+ pila2.pop() +"|");
		}
		System.out.println("Representación final de Pila 3");
		while (pila3.empty()==false) {
			System.out.println("|"+ pila3.pop() +"|");
		}
	}
	//Main para probar metodo Equalsstacks (Pilas Iguales)
	public static void main(String[] args) {
		System.out.println("Problemas Con Pilas");
		int [] elem1;//arreglo 1 que almacenara elementos a apilar en una pila 1
		int [] elem2;//arreglo 2 que almacenara elementos a apilar en una pila 2
		int [] elem3;//arreglo 3 que almacenara elementos a apilar en una pila 3
		System.out.print("Ingrese Numero de cilindros de Pila 1: ");
		elem1 = new int [sc.nextInt()];
		agregarCilindros(elem1);
		System.out.print("Ingrese Numero de cilindros de Pila 2: ");
		elem2 = new int [sc.nextInt()];
		agregarCilindros(elem2);
		System.out.print("Ingrese Numero de cilindros de Pila 3: ");
		elem3 = new int [sc.nextInt()];
		agregarCilindros(elem3);
		System.out.println("Representación inicial de Pila 1 ");
		mostrarElementos(elem1);
		System.out.println("Representación inicial de Pila 2");
		mostrarElementos(elem2);
		System.out.println("Representación inicial de Pila 3");
		mostrarElementos(elem3);
		System.out.println("--------------------------------------------");
		System.out.println("----------------IGUALAR PILAS:--------------");
		System.out.println("--------------------------------------------");
		int solucion =equalStack(elem1, elem2, elem3);
		System.out.println("Las PILAS se igualan a una altura de: "+solucion);
		System.out.println("--------------------------------------------");
		 mostrarStack(pila1, pila2, pila3);
	}
}