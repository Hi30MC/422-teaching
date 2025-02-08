public class Dog extends Animal {
    private String breed;
    private int weight;
    private boolean isBarking;

    public Dog(int age, String breed, int weight, boolean isBarking) {
        super("Dog", age, true); 
        this.breed = breed;
        this.weight = weight;
        this.isBarking = isBarking;
    }

    @Override
    public String getSpecies() {
        return "Dog";
    }

    @Override
    public void swim() {
        System.out.println("Bark! Bark!");
    }

}