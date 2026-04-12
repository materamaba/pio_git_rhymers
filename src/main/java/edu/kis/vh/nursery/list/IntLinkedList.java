package edu.kis.vh.nursery.list;

/**
 * Klasa reprezentująca listę jednokierunkową przechowującą liczby całkowite.
 * Wykorzystuje klasę Node do budowania struktury.
 */
public class IntLinkedList {

    public static final int EMPTY_RETURN = -1;
    private Node last;
    private int i;

    private class Node {

        private int value;
        private Node prev, next;

        public Node(int i) {
            setValue(i);
        }

        private void setValue(int value) {
            this.value = value;
        }

    }

    /**
     * Dodaje nowy element na koniec listy.
     * * @param i wartość całkowita do dodania
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    /**
     * Sprawdza, czy lista jest pusta.
     * * @return true jeśli lista jest pusta, false w przeciwnym wypadku
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Sprawdza, czy lista jest pełna.
     * * @return zawsze false, ponieważ lista nie ma z góry ustalonego limitu
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Zwraca wartość z wierzchołka listy bez jej usuwania.
     * * @return wartość ostatnio dodanego elementu lub EMPTY_RETURN jeśli lista jest pusta
     */
    public int top() {
        if (isEmpty())
            return EMPTY_RETURN;
        return last.value;
    }

    /**
     * Pobiera i usuwa element z wierzchołka listy.
     * * @return wartość usuwanego elementu lub EMPTY_RETURN jeśli lista jest pusta
     */
    public int pop() {
        if (isEmpty())
            return EMPTY_RETURN;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}