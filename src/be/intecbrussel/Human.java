package be.intecbrussel;

public class Human {

    // Eigenschappen | Attributes
    private String name;
    private int age;
    private Dog doggo;

    // Constructor
    // String
    public Human(String name){
        this(name, 1);
    }

    // String - int
    public Human(String name, int age){
//        this.name = name;
//        this.age = age;

        setName(name);
        setAge(age);
    }

    public Human(String name, int age, Dog dog){
        setAge(age);
        setName(name);
        setDog(dog);
    }

    // Getters (vraag eigenschappen) | (Ask for attributes)
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Dog getDog() {
        return this.doggo;
    }

    // Setters (stel eigenschappen in) | (set attributes)
    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setDog(Dog dog) {
        this.doggo = dog;
    }


    // Extra functionality
    public void eat(String food) {
        System.out.println("I am eating");
    }

    public void run(){
        System.out.println("I am running without a reason.");
    }

    public void tellDogToAttack(Human target) {
        this.doggo.attackTarget(target);
    }
}