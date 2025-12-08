/*
method?
create a method
call a method
access methods with an object
using multiple classes

methods/functions?
    You learned from the Java Methods chapter that
    methods are declared within a class, and that they are used to perform certain actions

 */



public class Main106{

    public static void myMethod(){                      //creat a static method
        System.out.println("hello world");
        }
    public void fullThrottle(){
        System.out.println("u are at ur full speed");   //creat a method(action-throttle)
        }
    public void speed(int s){
        System.out.println("ur speed is "+s);               //creat method(action-show speed)
        }



    public static void main(String[] args){     //main method
        myMethod();                             //calling static method

        Main106 car=new Main106();              // made an object to access methods

        //accessing methods
        car.fullThrottle();
        car.speed(220);

    }
}

/*
Using Multiple Classes
    Like we specified in the Classes chapter,
    it is a good practice to create an object of a class and access it in another class.

Main.java
Second.java
 */