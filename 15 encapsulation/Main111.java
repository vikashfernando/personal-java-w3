/*
What is Encapsulation?
    Encapsulation means:
    Hide data and protect it from outside use.

We do this by:
    Making variables private
    Using public methods to get or set the value

Why do we use Encapsulation?
    Protect data
    Control how data is changed
    Make code safer and cleaner

IRL example:
    Think like ATM card 💳
    Your money - private
    ATM buttons - public
    You don’t touch the money directly
    You use buttons(methods)
 */

public class Main111{
    public static void main(String[] args){
        Person p1=new Person();

        //set the name
        p1.setName("vikash");

        //get the name
        p1.getName();

        System.out.println(p1.getName());
    }
}