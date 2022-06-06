public class Test {
	public static void main(String[] args){
        
		//Cola de numeros 
        QueueLink<Integer> test = new QueueLink<>();
        
        test.enqueue(4);
        test.enqueue(10);
        test.enqueue(15);
        test.enqueue(20);
        test.enqueue(25);
        test.enqueue(30);
        
        System.out.println("* TEST 1 *");
        System.out.println("");
        System.out.println("La cola esta vacia: "+test.isEmpty());
        System.out.println("El tamaño es: "+test.size());
        
        System.out.println(test); 
        
        System.out.println("Primero: "+test.front());
        System.out.println("Ultimo: "+test.back());
        
        System.out.println("Desencolar: "+test.dequeue());
        
        System.out.println(test);        
          
        System.out.println("");
        
        //Cola de caracteres
        System.out.println("* TEST 2 *");
        System.out.println("");
        
        QueueLink<Character> test1 = new QueueLink<>();
        
        System.out.println("La cola esta vacia: "+test1.isEmpty());
        
        test1.enqueue('g');
        test1.enqueue('m');
        test1.enqueue('o');
        test1.enqueue('a');
        test1.enqueue('z');
        
        System.out.println(test1);
        System.out.println("La cola esta vacia: "+test1.isEmpty());
        System.out.println("El tamaño es: "+test1.size());
         
        System.out.println("Primero: "+test1.front());
        System.out.println("Ultimo: "+test1.back());
        
        System.out.println("Desencolar: "+test1.dequeue());
        
        System.out.println(test1);
    }
}

