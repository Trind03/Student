package sas;

import static java.util.UUID.randomUUID;

public class Student
{
    Subject[] Fag;
    String Name;
    int Age;
    String IdentyGuy;

    public Student(String name,int age)
    {
        Name = name;
        Age = age;
        IdentyGuy = String.valueOf(randomUUID());
    }
}
