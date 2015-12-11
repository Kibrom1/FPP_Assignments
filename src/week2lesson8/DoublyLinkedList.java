package week2lesson8;

public class DoublyLinkedList {
	int value;
	DoublyLinkedList next;
	DoublyLinkedList prev;

	public DoublyLinkedList(int value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}

	public String toString(){
		return this.value + " Next: " + this.next;
	}

	public static void main(String[] args) {

		DoublyLinkedList node1 = new DoublyLinkedList(20);
		DoublyLinkedList node2 = new DoublyLinkedList(30);
		DoublyLinkedList node3 = new DoublyLinkedList(40);

		node1.next = node2;
		node1.prev = null;
		
		node2.next = node3;
		node2.prev = node1;

		node3.prev = node2;
		node3.next = null;


		System.out.println(node1.toString());
		System.out.println(node2.toString());
		System.out.println(node3.toString());

	}
}
