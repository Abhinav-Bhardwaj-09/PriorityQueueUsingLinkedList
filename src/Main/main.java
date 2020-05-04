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
            System.out.println();
            System.out.println();
            System.out.println("Press 1 : To enter details of more students.");
            System.out.println("Press 2 : To display the queue.");
            System.out.println("Press 3 : To perform dequeue on queue.");
            System.out.println("Press 4 : To exit.");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            if ( choice == 1 ){
                System.out.println();
                System.out.print("Enter the name of the student : ");
                name = sc.next();
                System.out.print("Enter roll number : ");
                roll = sc.nextInt();
                System.out.print("Enter CPI : ");
                CPI = sc.nextDouble();
                student = new Student(name,roll,CPI);
                PQ.enqueue(student);
            }
            else if ( choice == 2 ) {
                System.out.print("Your queue is : ");
                PQ.display();
            }
            else if( choice == 3 ) PQ.dequeue();


        }
    }
}