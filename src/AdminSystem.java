import sas.Professor;
import sas.Student;
import sas.Subject;
import textui.ProfessorUI;
import textui.StudentUI;
import java.util.ArrayList;
import textui.SubjectUI;

import static Dependencies.Dependencies.Display_Menu;
import static Dependencies.Dependencies._scanner;

public class AdminSystem
{
    private static final String _Soft_Version = "1.2.2";
    private static final ArrayList<Subject> _subjects = new ArrayList<Subject>();
    private static final ArrayList<Professor> _professors = new ArrayList<Professor>();
    private final ProfessorUI _professorUI = new ProfessorUI();
    private final StudentUI _studentUI = new StudentUI();
    private final SubjectUI _subjectUI = new SubjectUI();
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

        Display_Menu(commands);

        System.out.print("Field: ");
        userInput = _scanner.nextLine();
        System.out.println(userInput);

        switch (userInput)
        {
            case "1":
                _studentUI.Student_Menu();
                break;
            case "2":
                _subjectUI.Subject_Menu();
                break;
            case "3":
                _professorUI.Professor_Menu();
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

    public void Soft_Version(){
        System.out.println(_Soft_Version);
    }
}
