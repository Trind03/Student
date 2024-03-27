package sas;
import java.util.ArrayList;

import static java.util.UUID.randomUUID;

public class Student
{
    public ArrayList<Subject>Subject = new ArrayList<Subject>();
    public String Name;
    public int Age;
    public String UserID;



    public Student(String name,int age,ArrayList<Subject>subject)
    {
        Name = name;
        Age = age;
        UserID = String.valueOf(randomUUID());
        Subject = subject;
    }
}
