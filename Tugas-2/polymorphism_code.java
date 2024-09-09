// Kelas induk (superclass)
class Animal {
    // Metode yang akan di-override di kelas turunan
    public void sound() {
        System.out.println("The animal makes a sound");
    }
}

// Kelas turunan (subclass) yang meng-override metode sound()
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }
}

// Kelas turunan (subclass) yang lain meng-override metode sound()
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("The cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        // Kelas induk yang memiliki referensi ke objek dari subclass
        Animal animal1 = new Dog();  // Polimorfisme: referensi Animal, tapi objek Dog
        Animal animal2 = new Cat();  // Polimorfisme: referensi Animal, tapi objek Cat

        // Memanggil metode sound() berdasarkan objek aktual (runtime)
        animal1.sound();  // Output: The dog barks
        animal2.sound();  // Output: The cat meows
    }
}
