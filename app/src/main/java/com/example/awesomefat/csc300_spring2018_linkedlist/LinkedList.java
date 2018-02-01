package com.example.awesomefat.csc300_spring2018_linkedlist;

/**
 * Created by awesomefat on 1/30/18.
 */

public class LinkedList
{
    private Node head;

    public LinkedList()
    {
        this.head = null;
    }

    public void addFront(int payload)
    {
        //add to front of list
        Node nextHead = new Node(payload);
        nextHead.setNextNode(this.head);
        this.head = nextHead;
    }

    public void display()
    {
        if(this.head == null)
        {
            System.out.println("Empty List");
        }
        else
        {
            System.out.println(this.head.getPayload());
        }
    }
}
