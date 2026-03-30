package edu.kis.vh.nursery.list;

public class Node {

    private int value;
    private Node prev, next;

    public Node(int i) {
        setValue(i);
    }

	private Node getNext() {
		return next;
	}

	private void setNext(Node next) {
		this.next = next;
	}

	private Node getPrev() {
		return prev;
	}

	private void setPrev(Node prev) {
		this.prev = prev;
	}

	private int getValue() {
		return value;
	}

	private void setValue(int value) {
		this.value = value;
	}

}
