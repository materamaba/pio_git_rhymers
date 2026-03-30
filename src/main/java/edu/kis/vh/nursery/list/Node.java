package edu.kis.vh.nursery.list;

public class Node {

    private int value;
    private Node prev, next;

    public Node(int i) {
        setValue(i);
    }

	private void setValue(int value) {
		this.value = value;
	}

}
