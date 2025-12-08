/*
What is method overloading???
    With method overloading, multiple methods can have the same name with different parameters
        EG- int myMethod(int x)
            float myMethod(float x)
            double myMethod(double x, double y)
 */

public class Main100{
    /*
    normal way
        make each method with different name for each return type...
     */
    public static int intSum(int a,int b){
        return(a+b);
    }
    public static double doubleSum(double a,double b){
        return(a+b);
    }
    public static int int3Sum(int a,int b,int c){
        return(a+b+c);
    }

    /*
    using method overloading
        Multiple methods can have the "same name" as long as the "number" and/or "type of parameters" are different
     */

    public static int smartSum(int a,int b){
        return(a+b);
    }
    public static double smartSum(double a,double b){
        return(a+b);
    }
    public static int smartSum(int a,int b,int c){
        return(a+b+c);
    }



    public static void main(String[] args){          //main method

        //old way(without method overloading)
        int a=intSum(1,2);
        double b=doubleSum(3.1,2.2);
        int c=int3Sum(1,1,1);

        //smart way(with method overloading)
        int d=smartSum(1,2);
        double e=smartSum(3.1,2.2);
        int f=smartSum(1,1,1);


        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        System.out.println("e = "+e);
        System.out.println("f = "+f);
    }

    //!!!Multiple methods can have the "same name" as long as the "number" and/or "type of parameters" are different.!!!
}
