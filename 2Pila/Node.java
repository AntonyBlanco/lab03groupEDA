public class Node<E> {
	private E data;
	private Node<E> next;
	
	public Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}
	public E getData() {
		return this.data;
	}
	public void setData(E data) {
		this.data = data;
	}
	public Node<E> getNext() {
		return this.next;
	}
	public void setNext(Node<E> next) {
		this.next = next;
	}

	public String toString() {
		return this.data.toString();
	}
}

