package Day2;

abstract class Animal{
    protected abstract void sound();
}

class Dog extends Animal{
    @Override
    protected void sound() {
        System.out.println("gukguk");
    }
}

class Cat extends Animal{
    @Override
    protected void sound() {
        System.out.println("meow");
    }
}

public class Latihan6 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();

        Animal cat = new Cat();
        cat.sound();
    }
}
