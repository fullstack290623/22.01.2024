package com.example.phones;

public class IPhone extends MobilePhone {

//    private float size;
//    private String color;
//    private float os;
    private float M2Model;

    public float getM2Model() {
        return M2Model;
    }

    public void setM2Model(float m2Model) {
        M2Model = m2Model;
    }

    public IPhone(float m2Model) {
        M2Model = m2Model;
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "M2Model=" + M2Model +
                '}';
    }
}
