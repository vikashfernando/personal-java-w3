/*
What is Polymorphism?
    One method, many forms
    Same method name, but different work.
    Easy real-life example
        A word: “sound”
        Dog sound - Bark
        Cat sound - Meo
        Cow sound - Moo

        Same action: make sound
        but different results

 */


class Animal{                                               //parent
    void animalSounds(){
        System.out.println("Animals makes sounds");
    }
}

class Dog extends Animal{                                   //child
    void animalSounds(){
        System.out.println("bow");
    }
}

class Cat extends Animal{                                   //child
    void animalSounds(){
        System.out.println("meow");
    }
}

public class Main113 {
    public static void main(String[] args){
        Animal o1=new Animal();
        Animal o2=new Dog();
        Animal o3=new Cat();

        o1.animalSounds();
        o2.animalSounds();
        o3.animalSounds();

    }
}

