package com.company;

abstract class cPet {

    String Name;

    public cPet(String name) {
        Name = name;
    }
    void getname()
    {
    System.out.println("Name of the Pet is "+ Name);
    }
    public abstract void skinType();
}
