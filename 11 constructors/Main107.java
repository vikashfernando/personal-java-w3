/*
What is a Constructor in Java?
    A constructor is a special method.
    It runs automatically when you create an object.

We use a constructor to give starting values to the class variables(attributes)
Name must be same as class name.
It has no return type (not even void).
It runs when object is created.
If you don’t write a constructor, Java creates one automatically.
But you cannot set values unless you make your own constructor.

 */


public class Main107{
    //attributes
    int x;
    String name;
    int age;

    //constructor
    public Main107(String y,int z){
        x=5;
        name=y;
        age=z;
    }

    //main method
    public static void main(String[] args){
        Main107 myObj=new Main107("yssi",22);
        System.out.println(myObj.x);
        System.out.println(myObj.name);
        System.out.println("her name is "+myObj.name+" and her age is "+myObj.age);
    }

}
