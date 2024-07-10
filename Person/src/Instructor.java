public class Instructor extends Person{
    
    private double salary;

    // constructor
    Instructor()
    {
        super();
    }

    // returns the salary.
    public double getSalary()
    {
        return salary;
    } 

    // sets the salary
    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    // @Overrides the toString method.
    public String toString()
    {
        return super.toString() + "\nSalary: " + salary + "\n";
    }
}
