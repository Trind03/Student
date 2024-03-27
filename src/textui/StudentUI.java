package textui;
import Dependencies.Dependencies;
import sas.Student;

import java.util.ArrayList;

public class StudentUI
{
    private static final ArrayList<Student> _students = new ArrayList<Student>();
    static String userInput;

    public void Student_Menu()
    {
        final String[] commands = {" - Create a student", " - Select student", " - View student", " - View all students", " - Delete selected student\n",};
        final String[] Sophmore = {"Math","English","Arduino","Norwegian","CRLE","Science","History","Ceramic"};
        enum avalable_Subjects { Sophmore, }

        System.out.println("**** Student Menu ****\n");

        //AdminSystem.Display_Menu(commands);
        Dependencies.Display_Menu(commands);

        System.out.print("Field: ");
        userInput = Dependencies._scanner.nextLine();
        System.out.println(userInput);

        switch (userInput)
        {
            case "1":
                Create_Student();
                break;
            case "2":
                //Select_Student();
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

    }

    public void Select_Student()
    {
        //Student theStudent = new Student();
    }

    public void View_Student()
    {
        //Student theStudent = new Student();
    }

    public void View_All_Students()
    {
        //Student theStudent = new Student();
    }

    public void Delete_Student()
    {
        //Student theStudent = new Student();
    }
}
