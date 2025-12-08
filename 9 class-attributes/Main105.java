/*

attributes?
accessing attributes
modify attributes
    assign a value
    override existing value
    finale
        The final keyword is useful when you want a variable to always store the same value, like pi
multiple objects
    change attribute value in one object



attributes/fields ???
    When we write x inside a class, it is not just a normal variable.
    It is called an attribute.
    Attribute means:
        A variable that belongs to a class.
        So:
            A normal variable → inside a method
            An attribute → inside a class

    Another term for class attributes is fields.

Accessing attributes
    by object of the class

 */


public class Main105{
    int x=5;             //attribute 1
    int y=3;             //attribute 2
    int z;               //attribute 3
    final int myAge=22;  //attribute 4 (final attributes cant modify)

    public static void main(String[] args){
        Main105 myObj=new Main105();
        Main105 myObj1=new Main105();

        //accesssing attributes
        System.out.println(myObj.x);
        System.out.println(myObj.y);

        //modifying attributes
        myObj.z=1;
        myObj.x=2;
        System.out.println("z: "+myObj.z);
        System.out.println("new value of x attribute: "+myObj.x);

        //change of an attribute values in one object, wont affecting the attribute values in the other
        System.out.println(myObj.x);
        System.out.println(myObj1.x);
    }
}