package Main;

import Student.Student;
import Priority_Queue.PriorityQueue;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 03-05-2020
 * Time: 12:12
 */

public class main {
    public static void main(String[] args) {
        PriorityQueue PQ = new PriorityQueue();
        Scanner sc = new Scanner(System.in);
        String name ;
        int roll,choice ;
        double CPI ;
        boolean flag = true;
        System.out.print("Enter the name of the student : ");
        name = sc.next();
        System.out.print("Enter roll number : ");
        roll = sc.nextInt();
        System.out.print("Enter CPI : ");
        CPI = sc.nextDouble();
        Student student = new Student(name,roll,CPI);
        PQ.enqueue(student);
        while(flag){

        }
    }
}