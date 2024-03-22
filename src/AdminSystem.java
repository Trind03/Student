import java.util.*;
import java.util.ArrayList;
import sas.Student;
public class AdminSystem
{
    ArrayList<Student> students = new ArrayList<Student>();
    char input;
    final static String[] cmds  = { //commands
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
    };

    public void menu()
    {

            System.out.flush();
            System.out.println("**** Main Menu ****\n");
            for (int i = 0; i != cmds.length; i++)
            {
                System.out.println((i++) + ". " + cmds[i]);
            }
            System.out.print("Field: ");
            String userInput = inputUser(); //<-- String eller int
            System.out.println(userInput);
            switch (userInput)
            {

                case "1":
                    menu();
                case "2":
                    System.exit(0);
                case "3":
                    menu();
                case "4":
                    System.exit(0);
                case "5":
                    menu();
                case "6":
                    System.exit(0);
                case "7":
                    menu();
                case "8":
                    System.exit(0);
                case "9":
                    menu();
                case "10":
                    System.exit(0);

                case "11":
                    menu();
                case "12":
                    System.exit(0);

                case "13":
                    menu();
                case "14":
                    System.exit(0);

                case "15":
                    menu();
                case "16":
                    System.exit(0);
                case "17":
                System.exit(0);
                default:
                    menu();
            }

    }

    public String inputUser(){
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
