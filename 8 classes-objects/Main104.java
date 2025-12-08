/*
> Java is an object-oriented programming language.

> In Java, everything is connected to classes and objects.
> An object has:
    Attributes → data (like color, weight)
    Methods → actions (like drive, brake)

> Example in real life:
    A car is an object.
    It has color, weight (attributes) and can drive, stop (methods).

> A class is like a blueprint (design) to create objects.
> Class name must start with a capital letter
> File name must be same as class name

 */


public class Main104{                             //create a class
    String name="yssi";                           //class attribute

    public static void main(String[] args){
        Main104 myObject=new Main104();           //create an object

        String x=myObject.name;                   //access the Main104 class, name attribute through myObject object
        System.out.println(x);



        //create multiple objects

        Main104 myObject1=new Main104();
        Main104 myObject2=new Main104();
        Main104 myObject3=new Main104();

        System.out.println(myObject1.name);
        System.out.println(myObject2.name);
        System.out.println(myObject3.name);

    }
}

/*
Using Multiple Classes
    You can use two classes in different files.
        One class holds data.
        Another class runs the program.
 */