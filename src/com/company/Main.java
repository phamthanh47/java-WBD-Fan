package com.company;

public class Main extends Fan {

    public static void main(String[] args) {
	Fan fan1= new Fan(3,true,10,"yellow");
	Fan fan2=new Fan(2,false,5,"blue");
	System.out.println("fan1:" + fan1.toString());
		System.out.println("fan2: " +
				""+fan2.toString());

    }
}
