package Nodes;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 03-05-2020
 * Time: 12:13
 */

public class Node {
    private String Name;
    private int Roll ;
    private double CPI;
    private Node next;

    public Node(String name, int roll, double CPI) {
        Name = name;
        Roll = roll;
        this.CPI = CPI;
        this.next = null;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRoll() {
        return Roll;
    }

    public void setRoll(int roll) {
        Roll = roll;
    }

    public double getCPI() {
        return CPI;
    }

    public void setCPI(double CPI) {
        this.CPI = CPI;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}