package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y) { return x*y;}
        public int product(int x, int y, int z) { return x*y*z;}
        public double product(double x, double y) { return x*y;}
    }

    public static void main(String[] args){

        Product p = new Product();
        int a = p.product(10,20);
        int b = p.product(10,20,30);
        double c = p.product(10.0,20.0);

        System.out.println(a+" "+b+" "+c);
    }

}

/*

Task 1:
create a class Product inside Main class
Task 2:
create object of Product in Main function called p
Task 3:
create a method of following defination
public int product(int x, int y) {}
call this method from Main using Product class object p
Task 4:
create a Overloaded method product of following defination
public int product(int x, int y, int z) {}
call this method also from Main using Product class object p
Task 5:
create a Overloaded method product of following defination
public double product(double x, double y) {}
call this method also from Main using Product class object p
Observations:
This class contains 3 classes with same name, but it complie & run successfully
*/