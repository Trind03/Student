package sas;
import java.util.ArrayList;

import static java.util.UUID.randomUUID;

public class Student
{
    public String[]Subject;
    public String Name;
    public int Age;
    public String UserID;



    public Student(String name,int age,String[]subject)
    {
        Name = name;
        Age = age;
        UserID = String.valueOf(randomUUID());
        Subject = subject;
    }
}
