// Abstract Class
abstract class Animal {
    // Abstract Method (tanpa implementasi)
    public abstract void sound();
    
    // Non-abstract method
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Subclass yang meng-extend abstract class dan mengimplementasikan abstract method
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

// Subclass lain yang juga meng-extend abstract class
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("The cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Menggunakan subclass untuk membuat objek
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        // Memanggil method abstract yang diimplementasikan di subclass
        dog.sound();
        cat.sound();
        
        // Memanggil method non-abstract dari abstract class
        dog.sleep();
        cat.sleep();
    }
}
