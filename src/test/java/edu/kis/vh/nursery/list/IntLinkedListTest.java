package edu.kis.vh.nursery.list;

import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListTest {

    @Test
    public void testInitialState() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertTrue(list.isEmpty());
        Assert.assertFalse(list.isFull());
        Assert.assertEquals(IntLinkedList.EMPTY_RETURN, list.top());
        Assert.assertEquals(IntLinkedList.EMPTY_RETURN, list.pop());
    }

    @Test
    public void testPushAndTop() {
        IntLinkedList list = new IntLinkedList();
        int testValue = 5;
        list.push(testValue);
        
        Assert.assertFalse(list.isEmpty());
        Assert.assertEquals(testValue, list.top());
    }

    @Test
    public void testPushAndPop() {
        IntLinkedList list = new IntLinkedList();
        int firstValue = 5;
        int secondValue = 15;
        
        list.push(firstValue);
        list.push(secondValue);
        
        Assert.assertEquals(secondValue, list.pop());
        Assert.assertEquals(firstValue, list.pop());
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testPopFromEmptyList() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertEquals(IntLinkedList.EMPTY_RETURN, list.pop());
    }
}