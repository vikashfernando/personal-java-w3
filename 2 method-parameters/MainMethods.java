public class MainMethods{

    public static void fullNamePrinter(String fName,String lName){    //myMethod
        String fullName=fName+" "+lName;
        System.out.println(fullName);
    }

    /*
    Information can be passed to methods as a parameter.
    Parameters act as variables inside the method.
    You can add as many parameters as you want, just separate them with a comma(",").
    when you are working with multiple parameters:
        the calling method must have the same number of arguments,
        and the arguments must be passed in the same order.

    When a parameter is passed to the method, it is called an argument.
    So,
    from the example : fName, lName are parameters, while Viaksh,Fernando are arguments.
     */

    public static void main(String[] args){    //main method
        fullNamePrinter("vikash","fernando");  //calling myMethod
    }
}
