package textui;

import Dependencies.Dependencies;
import sas.Student;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class StudentUI
{
    static int obj_index;
    private static String _userInput;
    private final Scanner _scanner = new Scanner(System.in);
    private static final ArrayList<Student> _students = new ArrayList<>();
    private final String[] _subject = {"Math","English","Arduino","Norwegian","CRLE","Science","History","Ceramic"};

    public void Student_Menu()
    {
        final String[] commands = {""," - Create a student", " - Select student", " - View student", " - View all students", " - Delete selected student\n",};

        System.out.println("**** Student Menu ****\n");

        Dependencies.Display_Menu(commands);

        System.out.print("Field: ");
        _userInput = _scanner.nextLine();
        System.out.println(_userInput);

        switch (_userInput)
        {
            case "1":
                Create_Student();
                Student_Menu();
                break;
            case "2":
                obj_index = Select_Student();
                Student_Menu();
                break;
            case "3":
                View_Student();
                break;
            case "4":
                View_All_Students();
                break;
            case "5":
                Delete_Student();
                break;
            default:
                Student_Menu();
        }
    }

    public void Create_Student()
    {
        int age;
        System.out.print("Name: ");
        _userInput = _scanner.nextLine();
        System.out.print("Age: ");
        age = Integer.parseInt(_scanner.nextLine());
        Student student = new Student(_userInput,age,_subject);
        _students.add(student);
    }

    public int Select_Student()
    {
        System.out.print("Student Name:");
        _userInput = _scanner.nextLine();
        for(int i = 0; i < _students.size(); i++){
            if(Objects.equals(_userInput, _students.get(i).getName()))
                return i;
        }
        return 0;
    }

    public int View_Student()
    {
        Student student;

        for(int i = 0; i < _students.size(); i++){
            if(obj_index == i)
            {
                student = _students.get(i);
                System.out.println("***** Selected student *****");
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Student Identyfier: " + student.get_Student_ID());
                return 0;
            }
        }
        return 1;
    }

    public void View_Student2()
    {
        if(!_students.isEmpty() && !(obj_index == 0)){
            Student student = _students.get(obj_index);
            System.out.println("");
            System.out.println("" + student.getName());
        }
    }

    public void View_All_Students()
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
        String nameToRemove = _scanner.nextLine();
        for(int i = 0; i < _students.size(); i++)
        {
            if(Objects.equals(nameToRemove, _students.get(i).getName()))
                _students.remove(i);
        }
        Student_Menu();
    }
}
