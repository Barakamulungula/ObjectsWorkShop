package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here

        Pencil pencil1 = new Pencil(.7, "Dixon", "Orange", false);
        Pencil pencil2 = new Pencil(.8, "Paper-Mate","Yellow", false);
        System.out.println("Pencil1: "+pencil1.getColor());
        System.out.println("Pencil2: "+pencil2.getColor());


    }
}
