// Class dengan enkapsulasi
class Person {
    // Variabel instans (data) dengan modifier private
    private String name;
    private int age;

    // Constructor untuk menginisialisasi objek
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter untuk mendapatkan nilai dari variabel name
    public String getName() {
        return name;
    }

    // Setter untuk mengubah nilai variabel name
    public void setName(String name) {
        this.name = name;
    }

    // Getter untuk mendapatkan nilai dari variabel age
    public int getAge() {
        return age;
    }

    // Setter untuk mengubah nilai variabel age
    public void setAge(int age) {
        // Contoh validasi
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Person
        Person person1 = new Person("John", 25);

        // Mengakses dan memodifikasi variabel melalui getter dan setter
        System.out.println("Name: " + person1.getName()); // Output: John
        System.out.println("Age: " + person1.getAge());   // Output: 25

        // Mengubah nilai variabel name dan age
        person1.setName("Doe");
        person1.setAge(30);

        // Menampilkan nilai yang telah diubah
        System.out.println("Updated Name: " + person1.getName()); // Output: Doe
        System.out.println("Updated Age: " + person1.getAge());   // Output: 30

        // Mencoba mengatur nilai age negatif
        person1.setAge(-5);  // Output: Age must be positive.
    }
}
