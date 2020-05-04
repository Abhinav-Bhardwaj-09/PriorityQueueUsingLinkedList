package Student;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 03-05-2020
 * Time: 12:13
 */

public class Student {
    private String Name;
    private int Roll ;
    private double CPI;
    private Student next;

    public Student(String name, int roll, double CPI) {
        setName(name);
        setRoll(roll);
        setCPI(CPI);
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

    public Student getNext() {
        return next;
    }

    public void setNext(Student next) {
        this.next = next;
    }
}