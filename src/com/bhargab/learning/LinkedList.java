package com.bhargab.learning;

public class LinkedList {

	Node head = null;
	Node tail = null;
	int length = 0;

	public LinkedList() {
	}

	public LinkedList(int value) {
		Node n = new Node();
		n.value = value;
		n.next = null;
		head = n;
		tail = n;
		length++;
	}

	public void append(int value) {
		if (length == 0) {
			Node n = new Node();
			n.value = value;
			n.next = null;
			head = n;
			tail = n;
			length++;
		} else {
			Node n = new Node();
			n.value = value;
			n.next = null;
			tail.next = n;
			tail = n;
			length++;
		}
	}

	public Node removeLast() {
		Node deleted = null;
		if (length == 0) {
			deleted = null;
		} else if (head == tail) {
			deleted = tail;
			head = null;
			tail = null;
			length = 0;
		} else {
			Node iterator = this.head;
			while (iterator != null) {
				if (iterator.next == tail) {
					deleted = iterator.next;
					tail = iterator;
					tail.next = null;
					length--;
				}
				iterator = iterator.next;
			}
		}
		return deleted;
	}

	public void prepend(int value) {
		if (length == 0) {
			Node n = new Node();
			n.value = value;
			n.next = null;
			head = n;
			tail = n;
			length++;
		} else {
			Node n = new Node();
			n.value = value;
			n.next = head;
			head = n;
		}
	}

	public Node get(int index) {
		Node n = null;
		if (index >= length || index < 0) {
			System.out.print("Index out of bound.\n");
			return n;
		}
		if (length == 0) {
			System.out.print("No data.\n");
			return n;
		} else {
			int counter = 0;
			Node iterator = null;
			iterator = head;
			while (iterator != null) {
				if (counter == index) {
					n = iterator;
					break;
				} else {
					iterator = iterator.next;
					counter++;
				}
			}
		}
		return n;
	}

	public boolean set(int index, int value) {
		boolean status = false;
		if (index >= length || index < 0) {
			System.out.print("Index out of bound.\n");
			return status;
		}
		if (length == 0) {
			System.out.print("No data.\n");
			return status;
		} else {
			int counter = 0;
			Node iterator = null;
			iterator = head;
			while (iterator != null) {
				if (counter == index) {
					iterator.value = value;
					status = true;
					break;
				} else {
					iterator = iterator.next;
					counter++;
				}
			}
		}
		return status;
	}

	public Node removeFirst() {
		Node deleted = null;
		if (length == 0) {
			return deleted;
		} else if (head == tail) {
			deleted = head;
			head = null;
			tail = null;
			length--;
		} else {
			deleted = head;
			head = head.next;
		}
		return deleted;
	}

	public void printAll() {
		Node iterator = this.head;
		while (iterator != null) {
			System.out.print(iterator.value);
			iterator = iterator.next;
			if (iterator != null)
				System.out.print(",");
		}
		System.out.print("\n");
	}

	class Node {
		int value;
		Node next;
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.append(4);
		list.printAll();
		list.append(1);
		list.append(6);
		list.printAll();
		list.removeLast();
		list.printAll();
		list.prepend(8);
		list.printAll();
		list.removeFirst();
		list.printAll();
		System.out.println(list.get(0) == null ? null : list.get(0).value);
		list.set(1, 3);
		list.printAll();

	}
}
