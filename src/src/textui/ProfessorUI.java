package textui;
import Dependencies.Dependencies;

import java.util.Scanner;

public class ProfessorUI
{
    private final Scanner _scanner = new Scanner(System.in);

    static String userInput;

    public void Professor_Menu()
    {
        final String[] commands =
        {
            "",
            " - Create professor",
            " - Select professor",
            " - View professor",
            " - View all professors",
            " - Delete selected subject\n",
        };

        System.out.println("**** Professor Menu ****\n");

        Dependencies.Display_Menu(commands);

        System.out.print("Field: ");
        userInput = _scanner.nextLine();
        System.out.println(userInput);

        switch (userInput)
        {
            case "1":
                Create_Professor();
                break;
            case "2":
                Select_Professor();
                break;
            case "3":
                View_Professor();
                break;
            case "4":
                View_All_Professors();
                break;
            case "5":
                Delete_Professor();
            default:
                Professor_Menu();
        }
    }

    public static void Create_Professor()
    {
        //Student theStudent = new Student();
    }

    public static void Select_Professor()
    {
        //Student theStudent = new Student();
    }

    public static void View_Professor()
    {
        //Student theStudent = new Student();
    }

    public static void View_All_Professors()
    {
        //Student theStudent = new Student();
    }

    public static void Delete_Professor()
    {
        //Student theStudent = new Student();
    }

}
