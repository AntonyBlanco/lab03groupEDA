public class Main{
	public static void main(String[] args){
		Stack<String> pilaStr = new Stack<String>();
		
		System.out.println("Pila: " + pilaStr);
		System.out.println("Tope: " + pilaStr.top());
		System.out.println("esta vacio?: " + pilaStr.isEmpty());
		
		pilaStr.push("a");
		
		System.out.println("Pila: " + pilaStr);
		System.out.println("Tope: " + pilaStr.top());
		System.out.println("esta vacio?: " + pilaStr.isEmpty());
		
		pilaStr.push("b");
		pilaStr.push("da");
		pilaStr.push("test");
		
		System.out.println("Pila: " + pilaStr);
		System.out.println("Tope: " + pilaStr.top());
		System.out.println("esta vacio?: " + pilaStr.isEmpty());
		String itemTop = pilaStr.top();
		pilaStr = pilaStr.pop();
		System.out.println("Elemento sacado: " + itemTop);
		System.out.println("Pila: " + pilaStr);
		System.out.println("Tope: " + pilaStr.top());
		System.out.println("esta vacio?: " + pilaStr.isEmpty());

		System.out.println("Vaciando pila . . .");
		pilaStr.emptyStack();
		System.out.println("Pila: " + pilaStr);
		System.out.println("Tope: " + pilaStr.top());
		System.out.println("esta vacio?: " + pilaStr.isEmpty());
	}
}

