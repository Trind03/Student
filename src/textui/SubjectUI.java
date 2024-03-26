package textui;

import Dependencies.Dependencies;

public class SubjectUI
{
    static String userInput;

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

        System.out.println("**** Subject Menu ****\n");
        System.out.print("Field: ");
        userInput = Dependencies._scanner.nextLine();
        System.out.println(userInput);

        switch (userInput)
        {
            case "1":
                Create_Subject();
                break;
            case "2":
                Select_Subject();
                break;
            case "3":
                View_Subject();
                break;
            case "4":
                View_All_Subjects();
                break;
            case "5":
                Delete_Subject();
            default:
                Subject_Menu();
        }
    }

    public static void Create_Subject(){
        //Student theStudent = new Student();
    }

    public static void Select_Subject(){
        //Student theStudent = new Student();
    }

    public static void View_Subject(){
        //Student theStudent = new Student();
    }

    public static void View_All_Subjects(){
        //Student theStudent = new Student();
    }

    public static void Delete_Subject(){
        //Student theStudent = new Student();
    }
}
