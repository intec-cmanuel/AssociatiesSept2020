package be.intecbrussel;

public class Dog {
    private String name;
    private String peltColor;
    // NO HUMAN ATTRIBUTE

    public Dog(String name, String peltColor) {
        this.name = name;
        this.peltColor = peltColor;
    }

    public String getName(){
        return this.name;
    }

    public void attackTarget(Human target){
        System.out.println(this.name + " is attacking " + target.getName());
    }
}
