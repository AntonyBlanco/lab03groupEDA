public class Stack<E> {
	private Node<E> root;
	
	public Stack() {
		root = null;
	}
	public boolean empty() {
	// Retorna verdadero si la pila esta vacia
		return false;
	}
	public E peek() {
	// Retorna el objeto en el tope de la pila
		return null;
	}
	public E pop() {
	// Elimina el objeto en el tope de la pila y lo retorna
		return null;
	}
	public E push() {
	// Coloca un objeto en el tope de la pila
		return null;
	}
	public int search() {
	// Retorna la posicion basada en 1 del objeto en la pila
		return 0;
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

