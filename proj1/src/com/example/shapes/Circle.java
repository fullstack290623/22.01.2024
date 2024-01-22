package com.example.shapes;

public class Circle {

    private float radius;
    public static float pi = 3.14f;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
