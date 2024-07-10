public class Person
{
    private String name;
    private int birthYear;

    // constructor
    Person()
    {
        name = "";
    }

    // sets the name of the person.
    public void setName(String name)
    {
        this.name = name;
    }

    // sets the birth year of the person.
    public void setBirthYear(int birthYear)
    {
        this.birthYear = birthYear;
    }

    // returns name of a person.
    public String getName()
    {
        return name;
    }

    // returns birth year of a person.
    public int getBirthYear()
    {
        return birthYear;
    }

    // @Overrides toString method
    public String toString()
    {
        return "Name: " + name + "\nBirth year: " + birthYear;
    }
}