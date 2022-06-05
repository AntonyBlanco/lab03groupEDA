public class QueueLink<E> implements Queue<E> {

	private Node<E> front;
	private Node<E> back;
	private int size;
    
	//Constructor de la cola
	public QueueLink() {
        this.front = this.back = null;
        this.size = 0;
    }
	
	//Comprueba si la cola esta vacia
	public boolean isEmpty() {
		return this.front == null;
	}

	//Retorna el tamaño de la cola
	public int size() {
		return size;
	}

	//Agregamos un elemento a la cola
	public void enqueue(E x) {
		// TODO Auto-generated method stub
		Node<E> n = new Node<E>(x, null);
        if (isEmpty()) {
            front = n;
        } else {
            back.setNext(n);
        }
        back= n;
        size++;
	}

	//Eliminamos el primer elemento de la cola
	public E dequeue() {
		 E x;
	        if (!isEmpty()) {
	            x = front.getData();
	            front = front.getNext();
	            size--;
	            if (isEmpty()){
	                back = null;
	            }
	        } else {
	            x = null;
	        }
	        return x;
	}

	//Retorna el primer elemento de la cola
	public E front() {
		E x;
        if (isEmpty()) {
            x = null;
        } else {
            x = front.getData();
        }
        return x;
	}

	//Retorna el ultimo elemento de la cola
	public E back() {
		E x;
        if (isEmpty()) {
            x = null;
        } else {
            x = back.getData();
        }
        return x;
	}
	
	public String toString(){
        String cadena = "[";
        Node<E> n = front;
        while (n != null){
            cadena += n.getData() +",";
            n = n.getNext();
        }
        return cadena +"]";
    }

}
