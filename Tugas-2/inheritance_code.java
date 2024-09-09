// Kelas induk (superclass)
class Animal {
    // Properti yang dimiliki oleh semua hewan
    String name;
    
    // Constructor untuk menginisialisasi nama hewan
    public Animal(String name) {
        this.name = name;
    }

    // Metode umum yang dapat digunakan oleh semua hewan
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Kelas turunan (subclass) yang mewarisi dari kelas Animal
class Dog extends Animal {
    
    // Constructor untuk menginisialisasi Dog, memanggil constructor superclass
    public Dog(String name) {
        super(name); // Memanggil constructor dari superclass (Animal)
    }

    // Metode khusus yang hanya dimiliki oleh Dog
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Kelas turunan lain yang mewarisi dari kelas Animal
class Cat extends Animal {

    // Constructor untuk menginisialisasi Cat, memanggil constructor superclass
    public Cat(String name) {
        super(name); // Memanggil constructor dari superclass (Animal)
    }

    // Metode khusus yang hanya dimiliki oleh Cat
    public void meow() {
        System.out.println(name + " is meowing.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek Dog dan Cat
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Memanggil metode dari superclass (Animal)
        dog.eat(); // Output: Buddy is eating.
        dog.sleep(); // Output: Buddy is sleeping.
        
        cat.eat(); // Output: Whiskers is eating.
        cat.sleep(); // Output: Whiskers is sleeping.

        // Memanggil metode khusus dari subclass
        dog.bark(); // Output: Buddy is barking.
        cat.meow(); // Output: Whiskers is meowing.
    }
}
