/*
Why do we use this?
    Sometimes the class variable and the method/constructor variable have the same name.
    Then Java gets confused.
    this helps Java know that we mean the class variable.
 */

public class Main108{

    String model;
    int year;

    public Main108(int year) {
        this("toyota",year);
    }
    public Main108(String model,int year){
        this.model=model;                       //attribute and the method/constructor variable have the same name.
        this.year=year;                         //attribute and the method/constructor variable have the same name.
    }

    public static void main(String[] args){
        Main108 myObj1=new Main108(22);
        System.out.println(myObj1.model+" - "+myObj1.year);

        Main108 myObj2=new Main108("ford",25);
        System.out.println(myObj2.model+" - "+myObj2.year);

    }
}