/*
In Java, it is possible to inherit attributes and methods from one class to another.
We group the "inheritance concept" into two categories:
    subclass (child) - the class that inherits from another class
    superclass (parent) - the class being inherited from
To inherit from a class, use the "extends" keyword.

 */



class OldPhone{
  void call(){
      System.out.println("call");
  }

  void sendMsg(){
      System.out.println("msg");
  }
}


class NewPhone extends OldPhone{
    void browseInternet(){
        System.out.println("browsing");
    }

    public static void main(String[] args){
        NewPhone myObj=new NewPhone();

        myObj.call();
        myObj.sendMsg();
        myObj.browseInternet();

    }
}

/*
Why And When To Use "Inheritance"?
    -It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
    Tip: Also take a look at the next chapter, Polymorphism, which uses inherited methods to perform different tasks.

final Keyword
If you don't want other classes to inherit from a class, use the final keyword
 */