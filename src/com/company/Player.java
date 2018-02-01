package com.company;

public class Player {

    private String name;
    private int number;
    private String position;
    private float salary;

    public Player(){
        setName("Cristiano Ronaldo");
        setNumber(7);
        setPosition("Left wing");
        setSalary(3000000);
    }

    public void getPLayerInfo(){
        System.out.println("Name: "+getName());
        System.out.println("Number: "+getNumber());
        System.out.println("Position: "+getPosition());
        System.out.println("Salary: $"+getSalary()+"\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }



}
