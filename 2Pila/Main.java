public class Main{
	public static void main(String[] args){
		Stack<String> pilaStr = new Stack<String>();
		
		System.out.println(pilaStr);
		System.out.println(pilaStr.top());
		
		pilaStr.push("a");
		
		System.out.println(pilaStr);
		System.out.println(pilaStr.top());
		
		pilaStr.push("b");
		pilaStr.push("da");
		pilaStr.push("testTop");
		
		System.out.println(pilaStr);
		System.out.println("Elemento en el tope: " + pilaStr.top());
		
	}
}

