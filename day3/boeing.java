public class boeing extends plane {
    String label;
    int size;
    int numWindows;

    public boeing(int topSpeed, int capacity, String color, String label, int size, int numWindows) {
        this.label = label;
        this.size = size;
        this.numWindows = numWindows;
        super(topSpeed, capacity, color);
    }

    @Override
    public void setColor(String color) {
        this.color = "light " +  color;
    }
}
