/*
Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or "interfaces" (which you will learn more about in the next chapter).
The abstract keyword is a non-access modifier, used for classes and methods:
    Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
    Abstract method: can only be used in an abstract class, and it does not have a body. ***The body is provided by the subclass (inherited from).***

 */


abstract class Animal1{              //an abstract class
    abstract void animalSound();        //an abstract method

    public void sleep(){                //a normal method
        System.out.println("Zzz...");
    }
}

class Dog1 extends Animal1{         //a subclass of Animal class
    void animalSound(){
        System.out.println("bowww"); //*** ***
    }
}

public class Main116 {
    public static void main(String[] args){
        Dog1 o1=new Dog1();

        o1.sleep();
        o1.animalSound();
    }
}