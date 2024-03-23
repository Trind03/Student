package sas;

public class Professor implements ICommonReference{
    String Name;
    int Age;


    Professor(String name) {
        Name = name;
    }

    @Override
    public void getInformation() {

    }

    @Override
    public String getName() {
        return Name;
    }
}
