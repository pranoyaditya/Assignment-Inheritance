import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<Student>();
        ArrayList<Instructor> instructorList = new ArrayList<Instructor>();

        while(true)
        {
            // options for the menu.
            System.out.print("\nA)dd person\t W)atch details of persons\t Q)uit\n");
            System.out.print("Enter choice: ");
            String response = sc.nextLine();

            if(response.equals("A"))
            {
                // option to know about the person's profession.
                System.out.println("\nS)tudent\t I)nstructor");
                System.out.print("Enter choice: ");
                String choice = sc.nextLine();

                // reading name and birth year.
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter birth year: ");
                int birthYear = sc.nextInt();
                sc.nextLine(); // takes the remaining enter keyword from the stream.

                if(choice.equals("S"))
                {
                    Student student = new Student();
                    
                    System.out.print("Enter your major: ");
                    String majorSub = sc.nextLine();

                    student.setName(name);
                    student.setBirthYear(birthYear);
                    student.setMajor(majorSub); 

                    studentList.add(student);
                }
                else if(choice.equals("I"))
                {
                    Instructor instructor = new Instructor();

                    System.out.print("Enter your salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();  // takes the remaining enter keyword from the stream.

                    instructor.setSalary(salary);

                    instructorList.add(instructor);
                }
                else 
                {
                    System.out.println("Wrong Input!");
                }
            }
            else if(response.equals("W"))
            {
                if(studentList.size()>0)
                {
                    System.out.println("\n\tStudent details\n");

                    for(int i=0; i<studentList.size(); i++)
                    {
                        System.out.println(studentList.get(i).toString());

                        System.out.println();
                    }
                }
                if(instructorList.size() > 0)
                {
                    System.out.println("\tInstructor details\n");

                    for(int i=0; i<instructorList.size(); i++)
                    {
                        System.out.println(instructorList.get(i).toString());

                        System.out.println();
                    }
                }
                else 
                {
                    System.out.println("No details. Add first.");
                }
            }
            else if(response.equals("Q"))
            {
                sc.close();
                break;
            }
            else 
            {
                System.out.println("Wrong input!");
            }

        }
    }
}
