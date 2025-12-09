/*
> What is a Package in Java?
    > A package is like a folder.
    > It keeps related classes together.
        > Ex-folder = package
             files = classes

>We use packages to:
    >Organize code
    >Avoid name problems
    >Keep code clean

> What is Java API?
    Java API is a library of prewritten classes, that are free to use,
    included in the Java Development Environment.
    The library contains components for managing input, database programming, and much much more.
    The library is divided into packages and classes.
    Meaning you can either import a single class (along with its methods and attributes),
    or a whole package that contain all the classes that belong to the specified package.

>There are two types of Packages:
    >Built-in packages/Java API(already made by Java)
        >Java gives many ready-made packages called API.
        >Example packages:
            java.util
            java.io
            java.lang
        >To use them, we use import
            import java.util.Scanner; (import one class in the package)
                java.util - package
                Scanner - class

            import java.util.*; (import all classes in the package)
        >what is java API?
            Java API is a big library of ready-made code.
                You can use it for:
                    Input
                    Date and time
                    Random numbers
                    Files

                    You don’t need internet to use it

    >User-defined packages(made by you)

 */

//how to create an user defined package(see "MyPackage.java" class)



/*

Important Notes
    Package name should be in small letters.
    import is used to bring packages/classes into program.

    Think like this
        Package = school bag 🎒
        Classes = books 📚

 */

import mypack.MyPackage;

public class Main112{
    public static void main(String[] args){
        System.out.println("this is main class");
    }
}