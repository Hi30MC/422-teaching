public class plane {
    private int topSpeed;
    private int capacity;
    public String color;
    
    public plane(int topSpeed, int capacity, String color) {
        this.topSpeed = topSpeed;
        this.capacity = capacity;
        this.color = color;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }
}