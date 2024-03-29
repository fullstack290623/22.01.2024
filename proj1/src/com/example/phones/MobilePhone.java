package com.example.phones;

public abstract class MobilePhone {

    private float size;
    private String color;
    private float os;

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getOs() {
        return os;
    }

    public void setOs(float os) {
        this.os = os;
    }

    public MobilePhone(float size, String color, float os) {
        this.size = size;
        this.color = color;
        this.os = os;
    }

    // contract -- commitment
    public abstract void openApplicationStore();

    public void openFileSystem() {
        System.out.println("Opening file system");
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", os=" + os +
                '}';
    }
}
