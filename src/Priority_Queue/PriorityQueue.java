package Priority_Queue;

import Nodes.Node;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 03-05-2020
 * Time: 12:13
 */

public class PriorityQueue {
    Node front ;
    Node rear ;

    public PriorityQueue() {
        this.front = null;
        this.rear = null;
    }


    public void enqueue (Node newnode){
        if ( front == null || newnode.getCPI() < front.getCPI() ){
            newnode.setNext(front);
            front = newnode;
        }
        else{
            Node temp = front ;
            while ( temp.getNext() != null && temp.getNext().getCPI() <= newnode.getCPI()) {
                temp = temp.getNext();
            }
            newnode.setNext(temp.getNext());
            temp.setNext(newnode);
        }
    }

    public  void dequeue(){
        if ( front != null){
            front = front.getNext();
        }
        else {
            System.out.println("Underflow... ");
        }
        if ( front != null ){
            display();
        }
        else {
            System.out.println("List is ");
        }
    }


    public void display(){
        Node temp = front;
        while ( temp!= null ){
            System.out.print(temp.getRoll() + ". ");
            System.out.println(temp.getName());
            temp = temp.getNext();
        }
    }
}