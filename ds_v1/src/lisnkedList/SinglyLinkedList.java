package lisnkedList;

public class SinglyLinkedList {

	Node head; // head of list

	// Linked list node
	// This class is made static
	// so that main can access it directly w/o creating its object
	static class Node {
		int data;
		Node next;

		// Constructor
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// method to inserting a new node
	public SinglyLinkedList insert(SinglyLinkedList list, int data) {
		Node newNode = new Node(data);
		newNode.next = null; // new Node's next element should also be null

		// If linked List is empty
		// then make the new node as head
		if (list.head == null) {
			list.head = newNode;
		} else {
			// traverse till the last node
			// and insert a new node there
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}

			// insert the newNode in the last node
			last.next = newNode;

		}
		// returns the list by head
		return list;

	}

	// method to print linked list
	public static void printLinkedList(SinglyLinkedList list) {
		Node currNode = list.head;

		System.out.print("Singly Linked List : ");

		// traverse through the linked list
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");

			// Go to next node
			currNode = currNode.next;

		}

	}

	// driver method
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();

		// insertion
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);

		// print the list
		printLinkedList(list);
	}

}
