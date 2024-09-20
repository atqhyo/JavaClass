class Animal{
    public void sound(){ //default
        System.out.println("Some Sound");
    }
}

//Subclass #1
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Barking");
    }
}

//Subclass #2
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meow");
    }
}

//Subclass #3
class Cow extends Animal{
    @Override
    public void sound(){
        System.out.println("Moo");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();

        myAnimal = new Cat();
        myAnimal.sound();

        myAnimal = new Cow();
        myAnimal.sound();
    }
}
