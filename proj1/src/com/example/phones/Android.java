package com.example.phones;

public class Android extends MobilePhone {

//    private float size;
//    private String color;
//    private float os;
    private String osAndroidName;

    public String getOsAndroidName() {
        return osAndroidName;
    }

    public void setOsAndroidName(String osAndroidName) {
        this.osAndroidName = osAndroidName;
    }

    public Android(float size, String color, float os, String osAndroidName) {
        // super(6.9f, "black", 11.5f);
        super(size, color, os); // MobilePhone(size, color, os)
        this.osAndroidName = osAndroidName;
    }

    @Override
    public void openApplicationStore() {
        System.out.println("Connecting to google play to get a new app...");
    }

    @Override
    public String toString() {
        return "Android{" +
                "osName='" + osAndroidName + '\'' +
                '}' + " " +
                super.toString();
    }
}
