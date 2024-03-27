package sas;

public class Professor// implements ICommonReference
{
    private final String Name;
    private final int Age;

    Professor(String name, int age) {
        Name = name;
        Age = age;
    }

    public String getName()
    {
        return Name;
    }

    public int getAge()
    {
        return Age;
    }
}