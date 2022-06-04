public class Main{
	public static void main(String[] args){
		Stack<String> pilaStr = new Stack<String>();
		
		System.out.println(pilaStr);
		System.out.println(pilaStr.empty());
		
		pilaStr.push("a");
		
		System.out.println(pilaStr);
		System.out.println(pilaStr.empty());
		
		pilaStr.push("b");
		pilaStr.push("da");
		pilaStr.push("test");
		pilaStr.push("o");
		pilaStr.push("hola");
		pilaStr.push("z");
		
		System.out.println(pilaStr);
		System.out.println(pilaStr.empty());
		
	}
}

