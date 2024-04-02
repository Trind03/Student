package textui;
import Dependencies.Dependencies;
import sas.Professor;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ProfessorUI
{
    private final Scanner _scanner = new Scanner(System.in);
    private static final ArrayList<Professor> _professors = new ArrayList<Professor>();
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
            " - Delete selected subject",
                "- Return to main menu\n",
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
            case "6":
                //AdminSystem.Main_Menu();
            default:
                Professor_Menu();
        }
    }

    public void Create_Professor()
    {
        String name;
        int age;

        System.out.print("Name: ");
        name = _scanner.nextLine();
        System.out.print("Age: ");
        age = Integer.parseInt(_scanner.nextLine());
        Professor professor = new Professor(name, age);
        _professors.add(professor);
        Professor_Menu();
    }

    public void Select_Professor()
    {
        Professor_Menu();
    }

    public void View_Professor()
    {
        Professor_Menu();
    }

    public void View_All_Professors() {
        int Nr = 0;
        if (!_professors.isEmpty()) {
            for (Professor student : _professors) {
                System.out.println("**** Professor Number " + (++Nr) + ". ****");
                System.out.println(student.getName());
                System.out.println(student.getAge() + "\n");
            }
        }
        Professor_Menu();
    }

    public void Delete_Professor()
    {
        String nameToRemove = _scanner.nextLine();
        for(int i = 0; i < _professors.size(); i++)
        {
            if(Objects.equals(nameToRemove, _professors.get(i).getName()))
            {
                System.out.println(_professors.get(i).getName() + " has been successfully removed!");
                _professors.remove(i);
            }
        }
        Professor_Menu();
    }
}
