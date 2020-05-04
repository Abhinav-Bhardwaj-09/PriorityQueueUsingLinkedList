package Priority_Queue;

import Student.Student;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 03-05-2020
 * Time: 12:13
 */

public class PriorityQueue {
    Student front ;
    Student rear ;

    public PriorityQueue() {
        this.front = null;
        this.rear = null;
    }


    public void enqueue (Student NewNode){
        if ( front == null || NewNode.getCPI() < front.getCPI() ){
            NewNode.setNext(front);
            front = NewNode;
        }
        else{
            Student temp = front ;
            while ( temp.getNext() != null && temp.getNext().getCPI() <= NewNode.getCPI()) {
                temp = temp.getNext();
            }
            NewNode.setNext(temp.getNext());
            temp.setNext(NewNode);
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
            System.out.println("List is empty...");
        }
    }


    public void display(){
        Student temp = front;
        while ( temp!= null ){
            System.out.print(temp.getRoll() + ". ");
            System.out.println(temp.getName());
            temp = temp.getNext();
            if (temp != null) System.out.print("                ");
        }
    }
}