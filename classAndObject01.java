class Animal {
    // define a attribute foer class Animal (a variable in a class is called
    // attributes or properties)
    String name;
    String color;
    int age;

    // define a mathood for class Animal(a functio in a class is called methood)
    public void bark() {
        System.out.println("Woof Woof");
    }

    public void meaoo() {
        System.out.println("Meaoo Meaoo");
    }

    // define methoods to use attributes (name, color, age)
    public void printName() {
        System.out.println(this.name);
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void printAge() {
        System.out.println(this.age);
    }
}

public class classAndObject01 {
    public static void main(String org[]) {
        // create a object according to class Animal
        Animal dog = new Animal();
        Animal cat = new Animal();

        // create attributes for objeects
        dog.name = "Tomy";
        dog.color = "Black";
        dog.age = 10;

        cat.name = "chinnoo";
        cat.color = "White";
        cat.age = 5;

        // use bark() methood for object dog
        dog.bark();
        // use meaoo() methood for object cat
        cat.meaoo();

        // use attributes via methood for objects
        dog.printName();
        dog.printColor();
        dog.printAge();

        cat.printName();
        cat.printColor();
        cat.printAge();

    }
}