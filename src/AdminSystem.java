import java.util.*;
import java.util.ArrayList;

import sas.Professor;
import sas.Student;
import sas.Subject;

public class AdminSystem
{
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Subject> subjects = new ArrayList<Subject>();
    ArrayList<Professor> professors = new ArrayList<Professor>();

    char input;
    final static String[] commands = {
            "Select what you want to modify:",
            "- Student",
            "- Subject",
            "- Professor\n",

            "Extra:",
            "- Check software version",
            "- Exit software",
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

    public void mainMenu()
    {
        Student student = new Student("James",1);
        System.out.flush();
        System.out.println("**** Main Menu ****\n");
        for (int i = 0; i != commands.length; i++)
        {
            //System.out.println((i++) + ". " + commands[i]);
            System.out.println(commands[i]);
        }
        System.out.print("Field: ");
        String userInput = inputUser(); //<-- String eller int
        System.out.println(userInput);
        switch (userInput)
        {
            case "1":
                mainMenu();
            case "2":
                System.exit(0);
            default:
                mainMenu();
        }
    }

    public String inputUser() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();
        return switch (userInput) {
            case null -> inputUser();
            case "" -> inputUser();
            default -> userInput;
        };
    }
}
