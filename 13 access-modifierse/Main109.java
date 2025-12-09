/*
"public" class main
    public keyword is an access modifier
    (it is used to set the access level for classes,attributes,methods and constructors)
We divide modifiers into two groups:
    Access Modifiers - controls the access level
    Non-Access Modifiers - do not control access level, but provides other functionality

Access modifiers for classes
    public - The class is accessible by any other class
    default(when you don't specify a modifier) - The class is only accessible by ?classes in the same package?

Access modifiers for attributes,methods and constructors
    public- The code is accessible for all classes
    private- The code is only accessible within the declared class
    protected- The code is accessible in the same ?package and subclasses?
    default(when you don't specify a modifier)-The code is only accessible in the ?same package?
 */

public class Main109{             //main class
    public static void main(String[] args){

        Strawberries myObj=new Strawberries();

        //accessing attributes from Main109 class
        System.out.println(myObj.x);
        //System.out.println(myObj.y);      //without removing and remove "//"" and run u will see the results
    }
}

class Strawberries{              //class 2
    public String x="red";          //public attribute
    private int y=69;               //private attribute
}