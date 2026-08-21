/*
Single inheritence :
a subclass inherits from the a one single class*/

public class Inheritence {

    class Animal{
        void sound(){
            System.out.println("Animal makes sound");
        }
    }class Dog extends Animal{
        void sound(){
            System.out.println("Dog barks");
        }
    }class Cat extends Animal{
        void sound(){
            System.out.println("Cat Meows");
        }
    }
}



