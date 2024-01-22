package com.example;

import com.example.shapes.Circle;

public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle(3.5f);
        System.out.println(c1.getRadius());
        System.out.println(Circle.pi);
        Circle.pi = 3.17f;
        c1.pi = 1.111f; // ==> Circle.pi = 1.111f
        Circle c2 = new Circle(0.9f);
        Circle c3 = new Circle(1.2f);

//        System.out.println(Circle.getPi()); // new not required
//        System.out.println(Circle.pi); // new not required

        //Math.random(); // new not required

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();
        System.out.println(Person.counter); // 5

        SuperNumber sn1 = new SuperNumber(1000);
        SuperNumber sn2 = new SuperNumber(2000);
        SuperNumber sn3 = new SuperNumber(-1);
        SuperNumber sn4 = new SuperNumber(-50);
        SuperNumber sn5 = new SuperNumber(111);
        System.out.println(SuperNumber.getMaxNumber()); // biggest
        System.out.println(SuperNumber.getMinNumber()); // smallest

    }

}
