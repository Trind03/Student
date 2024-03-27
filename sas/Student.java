package sas;
import java.util.ArrayList;

import static java.util.UUID.randomUUID;

public class Student
{
    private final String[]Subject;
    private final String Name;
    private final int Age;
    private final String Student_ID;
    private int student_Number;

    public Student(String name,int age,String[]subject)
    {
        Name = name;
        Age = age;
        Student_ID = String.valueOf(randomUUID());
        Subject = subject;
    }

    public String getName(){
        return Name;
    }

    public String get_Student_ID(){
        return Student_ID;
    }
    public int getCount(){
    return student_Number;
}
    public int getAge(){
        return Age;
    }

}
