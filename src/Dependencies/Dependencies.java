package Dependencies;

import java.util.Scanner;

public class Dependencies
{
    public static final Scanner _scanner = new Scanner(System.in);

    public static void Display_Menu(String[] commands)
    {
        int nr = 0;
        for (int i = 0; i != commands.length; i++)
            System.out.println(++nr + "." + commands[i]);
    }
}
