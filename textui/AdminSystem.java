package textui;

import java.util.Scanner;

public class AdminSystem
{
    final String[] commands =
            {
                "",
                " - Student",
                " - Professor",
                " - Check software version",
                " - Exit software",
            };

    private final Scanner _scanner = new Scanner(System.in);
    String userInput;

    public void Main_Menu()
    {
        System.out.println("**** Main Menu ****\n");

        Dependencies.Dependencies.Display_Menu(commands);

        System.out.print("Field: ");
        userInput = _scanner.nextLine();
        System.out.println(userInput);

        switch (userInput)
        {
            case "1":
                final StudentUI _studentUI = new StudentUI();
                _studentUI.Student_Menu();
                break;
            case "2":
                final ProfessorUI _professorUI = new ProfessorUI();
                _professorUI.Professor_Menu();
                break;
            case "3":
                Soft_Version("1.2.3");
                Main_Menu();
                break;
            case "4":
                System.exit(0);
            default:
                Main_Menu();
                break;
        }
    }

    public void Soft_Version(String Version)
    {
        System.out.println("**** Currect software version: " + Version + " ****");
    }
}
