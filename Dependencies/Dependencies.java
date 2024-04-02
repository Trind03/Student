package Dependencies;
public class Dependencies
{

    public static void Display_Menu(String[] commands)
    {
        for (int i = 1; i < commands.length; i++)
            System.out.println(i + commands[i]);
    }
}
