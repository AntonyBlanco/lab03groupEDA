public class Stack<E> {
	private Node<E> root;
	
	public Stack() {
	// Constructor de pilas vacias
		this.root = null;
	}
	public void emptyStack() {
	// Constructor de pilas vacias
		this.root = null;
	}
	public boolean isEmpty() {
	// Retorna verdadero si la pila esta vacia
		return root == null;
	}
	public E top() {
	// Devuelve el elemento superior de una pila
		if(this.root == null) {
			System.out.println("La pila esta vacia.");
			return null;
		}
		return this.root.getData();
	}
	public E pop() {
	// Devuelve la pila sin el elemento superior
		return null;
	}
	public E push(E item) {
	// Toma un elemento y lo empuja encima de una pila existente
		this.root = new Node<E>(item, this.root);
		return item;
	}
	
	public String toString() {
		String str = "";
		for(Node<E> nodo = this.root; nodo != null; nodo = nodo.getNext()) {
			str += nodo.getData() + " > ";
		}
		str += "]";
		return str;
	}
}

