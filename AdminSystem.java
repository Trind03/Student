import textui.ProfessorUI;
import textui.StudentUI;

import java.util.Scanner;
public class AdminSystem
{
    private final Scanner _scanner = new Scanner(System.in);
    private static final String _Soft_Version = "1.2.2";
    private final ProfessorUI _professorUI = new ProfessorUI();
    private final StudentUI _studentUI = new StudentUI();
    String userInput;

    public void Main_Menu()
    {
        final String[] commands =
        {
            "",
            " - Student",
            " - Subject",
            " - Professor",
            " - Check software version",
            " - Exit software",
        };

        System.out.println("**** Main Menu ****\n");

        Dependencies.Dependencies.Display_Menu(commands);

        System.out.print("Field: ");
        userInput = _scanner.nextLine();
        System.out.println(userInput);

        switch (userInput)
        {
            case "1":
                _studentUI.Student_Menu();
                break;
            case "2":
                _professorUI.Professor_Menu();
                break;
            case "3":
                Soft_Version();
                break;
            case "4":
                System.exit(0);
            default:
                Main_Menu();
        }
    }

    public void Soft_Version(){
        System.out.println(_Soft_Version);
    }
}
