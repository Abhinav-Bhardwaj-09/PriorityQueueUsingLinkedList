package Main;

import Nodes.Node;
import Priority_Queue.PriorityQueue;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 03-05-2020
 * Time: 12:12
 */

public class main {
    public static void main(String[] args) {
        PriorityQueue PQ = new PriorityQueue();
        Node node1 = new Node("Abhinav",02,6.9);
        Node node2 = new Node("abhishek",03,6.8);
        PQ.enqueue(node1);
        PQ.enqueue(node2);
        PQ.display();
        System.out.println();
        System.out.println();
        Node node3 = new Node("Anvit",01,7);
        PQ.enqueue(node3);
        PQ.display();
        System.out.println();
        System.out.println();
        PQ.dequeue();
        System.out.println();
        System.out.println();
        PQ.display();
    }
}
