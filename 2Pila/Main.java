public class Main{
	public static void main(String[] args){
		Stack<String> pilaStr = new Stack<String>();
		
		System.out.println("Pila: " + pilaStr);
		System.out.println("Tope: " + pilaStr.top());
		
		pilaStr.push("a");
		
		System.out.println("Pila: " + pilaStr);
		System.out.println("Tope: " + pilaStr.top());
		
		pilaStr.push("b");
		pilaStr.push("da");
		pilaStr.push("testTop");
		
		System.out.println("Pila: " + pilaStr);
		System.out.println("Tope: " + pilaStr.top());
		String itemTop = pilaStr.top();
		pilaStr = pilaStr.pop();
		System.out.println("Elemento sacado: " + itemTop);
		System.out.println("Pila: " + pilaStr);
		System.out.println("Tope: " + pilaStr.top());
	}
}

