import Dependencies.Dependencies;

public class Main
{
    /* Object with main functionality */
    private static final AdminSystem AdminSystem = new AdminSystem();
    private final Dependencies dependencies = new Dependencies();
    public static void main(String[]args)
    {
        AdminSystem.Main_Menu();
    }
}