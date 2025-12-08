/*
    method=function

    What is a method?
        A method is a block of code which only runs when it is called.
        Methods are used to do some actions.
        Why use methods?
            To reuse code(write the code one time and use it many times).
        You can pass data, known as !parameters!, into a method.

        A method must be created inside a class.
     */

public class Main{

    //create a method
    public static void myMethod(){
        System.out.println("hello World");
    }

    /*
    > public - means the method can be used anywhere in the program oO
    > static - means that the method belongs to the Main class...
        (if not a "static" method - u hv to create an object
        and access that method through that object
        (you will learn about these later)
    > void - means the method does not return any value(what it returns/outputs)
        if nothing    > void
        if a double   > double
        if an integer > int
        if a String   > String
    > myMethod() - name of the method
     */


    //call a method(you must call it inside "main method"!!!)
    public static void main(String[] args){
        myMethod();

        myMethod(); //A method can also be called multiple times:
        myMethod();
    }

    /*
    What is main method???
        The main method is the starting point of the program.
        Java always starts running a program from the main method.
        This is the place where we call other methods.
        Without the main method, the program will not run.
    */

}