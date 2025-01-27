interface Animal {
    void sound();

    default void sleep() {
        System.out.println("This animal is sleeping");
    }
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class InterfacePractice {
    public static void main(String[] args) {

        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound();
        myCat.sound();
        myDog.sleep();
        myCat.sleep();
    }
}

