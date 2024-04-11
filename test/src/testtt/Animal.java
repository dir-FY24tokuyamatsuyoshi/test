package testtt;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println(name + " Bow");
    }

    public static void main(String[] args) {
        String dog = new Animal("Dog");
        dog.sound();
    }
}
