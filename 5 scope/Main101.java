// !!!Dont run this tutorial code(cnt work)....jst read and learn!!!


/*
Scope?
    In Java, variables are only accessible inside the region where they are created.
    This is called scope.

scope-:
    1. method scope
        Variables declared directly inside a method are available anywhere
        in the method following the line of code in which they were declared
    2. block scope
        A "block of code" refers to all of the code between curly braces "{ }".
        Variables declared inside a block of code are only accessible
        by the code between the curly braces, and only after the line in which the variable was declared
    3. loop scope
        Variables declared inside a for loop only exist inside the loop
        Once the loop ends, i is destroyed, so you can't use it outside.
        Why this matters??
            Loop variables are not available outside the loop.
            You can safely reuse the same variable name (i, j, etc.)
            in different loops in the same method:
    4. class scope
        Variables declared inside a class but outside any method have class scope(also called fields).
        These variables can be accessed by all methods in the class
 */


//1. method scope

public class Main101{
    //code here CANNOT use x
    public static void main(String[] args){
        //code here CANNOT use x
        int x;
        //can use x
    }
    //code here CANNOT use x
}


//2. block scope

public class Main101{
    //code here CANNOT use x
    public static void main(String[] args){
        //code here CANNOT use x
        {                                   //block of code
            //code here CANNOT use x
            int x;
            //can use x
        }
        //code here CANNOT use x
    }
    //code here CANNOT use x
}


//3. loop scope

public class Main101{
    //code here CANNOT use i
    public static void main(String[] args){
        //code here CANNOT use i
        for(int i=0;i<=10;i++){
            //can use i
            i++;
            //can use i
        }
        //code here CANNOT use i
    }
    //code here CANNOT use i
}


//4. class scope

public class Main101{
    //code here CANNOT use x
    int x; //A class variable
    //can use x
    public static void main(String[] args){
        //can use x
    }
    //can use x
}