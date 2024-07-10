public class Student extends Person{
    
    private String majorSubject;

    // constructor
    Student()
    {
        super();
        majorSubject = "";
    }

    // sets the major subject of a student.
    public void setMajor(String subject)
    {
        majorSubject = subject;
    }

    // returns the major subject name of a student.
    public String getMajor()
    {
        return majorSubject;
    }

    // @Overrides the toString
    public String toString()
    {
        return super.toString() + "\nMajor subject: " + majorSubject + "\n";
    }

}
