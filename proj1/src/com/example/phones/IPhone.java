package com.example.phones;

public class IPhone extends MobilePhone {

//    private float size;
//    private String color;
//    private float os;
    private String M2Model;

    public String getM2Model() {
        return M2Model;
    }

    public void setM2Model(String m2Model) {
        M2Model = m2Model;
    }

    public IPhone(float size, String color, float os, String m2Model) {
        super(size, color, os);
        M2Model = m2Model;
    }

    @Override
    public void openApplicationStore() {
        System.out.println("Connecting to Apple app store to get a new app...");
    }

    @Override
    public void openFileSystem() {
        System.out.println("Cannot open file system in Apple phones !!!");
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "M2Model=" + M2Model +
                "} " + super.toString();
    }
}
