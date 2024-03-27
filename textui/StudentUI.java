package textui;
import Dependencies.Dependencies;
import sas.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentUI
{
    private static String userInput;
    private Scanner _scanner = new Scanner(System.in);
    private static ArrayList<Student> _students = new ArrayList<Student>();
    private final String[] Sophmore = {"Math","English","Arduino","Norwegian","CRLE","Science","History","Ceramic"};

    public void Student_Menu()
    {
        final String[] commands = {""," - Create a student", " - Select student", " - View student", " - View all students", " - Delete selected student\n",};

        System.out.println("**** Student Menu ****\n");

        Dependencies.Display_Menu(commands);

        System.out.print("Field: ");
        userInput = _scanner.nextLine();
        System.out.println(userInput);

        switch (userInput)
        {
            case "1":
                Create_Student();
                break;
            case "2":
                Select_Student();
                break;
            case "3":
                View_Student();
                break;
            case "4":
                View_All_Students();
                break;
            case "5":
                Delete_Student();
            default:
                Student_Menu();
        }
    }

    public void Create_Student()
    {

        String name;
        int age;

        System.out.print("Name: ");
        name = _scanner.nextLine();
        System.out.print("Age: ");
        age = Integer.parseInt(_scanner.nextLine());
        Student student = new Student(name,age,Sophmore);
        _students.add(student);
    }

    public void Select_Student()
    {
        String name;
        System.out.print("Student Name:");
        name = _scanner.nextLine();
    }

    public void View_Student()
    {
        //Student theStudent = new Student();
    }

    public void View_All_Students() //Null exception
    {
        int Nr = 0;
        if(!_students.isEmpty())
        {
            for (Student student : _students){
                System.out.println("**** Student Number "+(++Nr)+". ****");
                System.out.println();
                System.out.println(student.getName());
                System.out.println(student.getAge());
            }
        }
    }

    public void Delete_Student()
    {
        //Student theStudent = new Student();
    }
}
