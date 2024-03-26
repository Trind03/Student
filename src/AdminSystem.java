import java.util.*;
import java.util.ArrayList;

import sas.Professor;
import sas.Student;
import sas.Subject;

public class AdminSystem
{
    public static ArrayList<Student> students = new ArrayList<Student>();
    public static ArrayList<Subject> subjects = new ArrayList<Subject>();
    public static ArrayList<Professor> professors = new ArrayList<Professor>();

    char input;
    final static String[] commands = {
            " - Create a student",
            " - Create a Subject",
            " - Create a Professor",
            " - Check software version",
            " - Exit software",
    };

    /*
            "Create a student",
            "Select student",
            "View student",
            "View all students",
            "Delete selected student\n",

            "Create subject",
            "Select subject",
            "View subject",
            "View all subjects",
            "Delete selected subject\n",

            "Create professor",
            "Select professor",
            "View professor",
            "View all professors",
            "Delete selected subject\n",

            "Software version",
            "Exit software"
     */

    public void Main_Menu()
    {
        String userInput;
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("**** Main Menu ****\n");

            for (int i = 0; i != commands.length; i++)
                System.out.println(i + commands[i]);

            System.out.print("Field: ");
            userInput = scanner.nextLine();
            System.out.println(userInput);

            switch (userInput)
            {
                case "1":
                    Create_Student();
                case "2":
                    Create_Subject();
                    break;
                case "3":
                    Create_Professor();
                    break;
                case "4":
                    Soft_Version();
                    break;
                case "5":
                    System.exit(0);
                default:
                    continue;
            }
        }

    }
    public void Create_Student()
    {

    }
    public void Soft_Version()
    {

    }

    public void Create_Subject()
    {

    }

    public void Create_Professor()
    {

    }
}
