import sas.Professor;
import sas.Student;
import sas.Subject;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminSystem
{
    private static final Scanner _scanner = new Scanner(System.in);
    private static final String _Soft_Version = "1.2.2";
    public static ArrayList<Student> students = new ArrayList<Student>();
    public static ArrayList<Subject> subjects = new ArrayList<Subject>();
    public static ArrayList<Professor> professors = new ArrayList<Professor>();
    String userInput;

    public void Main_Menu()
    {
        final String[] commands =
        {
            " - Student",
            " - Subject",
            " - Professor",
            " - Check software version",
            " - Exit software",
        };

        System.out.println("**** Main Menu ****\n");

        for (int i = 0; i != commands.length; i++)
            System.out.println(i + commands[i]);

        System.out.print("Field: ");
        userInput = _scanner.nextLine();
        System.out.println(userInput);

        switch (userInput)
        {
            case "1":
                Student_Menu();
                break;
            case "2":
                Subject_Menu();
                break;
            case "3":
                Professor_Menu();
                break;
            case "4":
                Soft_Version();
                break;
            case "5":
                System.exit(0);
            default:
                Main_Menu();
        }
    }

    public void Student_Menu()
    {
        final String[] commands =
        {
            " - Create a student",
            " - Select student",
            " - View student",
            " - View all students",
            " - Delete selected student\n",
        };

        System.out.println("**** Main Menu ****\n");

        for (int i = 0; i != commands.length; i++)
            System.out.println(i + commands[i]);

        System.out.print("Field: ");
        userInput = _scanner.nextLine();
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
                Professor_Menu();
                break;
            case "4":
                Soft_Version();
                break;
            case "5":
                System.exit(0);
            default:
                Student_Menu();
        }
    }

    public void Create_Student(){
        //Student theStudent = new Student();
    }

    public void Select_Student(){
        //Student theStudent = new Student();
    }

    public void Subject_Menu()
    {
        final String[] commands =
        {
            " - Create subject",
            " - Select subject",
            " - View subject",
            " - View all subjects",
            " - Delete selected subject\n",
        };
    }

    public void Professor_Menu()
    {
        final String[] commands =
        {
            " - Create professor",
            " - Select professor",
            " - View professor",
            " - View all professors",
            " - Delete selected subject\n",
        };
    }

    public void Soft_Version()
    {
        System.out.println(_Soft_Version);
    }

}
