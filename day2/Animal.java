public class Animal {
    private String species;
    private int age;
    private boolean isMammal;

    public Animal(String species, int age, boolean isMammal) { //constructor method
        this.species = species;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void swim() {
        System.out.println("I am using the water!");
    }

}