package be.intecbrussel;

public class HumanityApp {
    public static void main(String[] args) {

        Human anthony = new Human("Anthony", 31);
        Human elline = new Human("Elline", 21);

        Dog sofia = new Dog("Sofia", "White");

        elline.setDog(sofia);

        System.out.println(elline.getDog().getName());

        elline.tellDogToAttack(anthony);
    }
}
