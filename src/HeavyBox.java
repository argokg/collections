public class HeavyBox {
    private String name;
    private int weight;

    public HeavyBox(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "\nname: " + name +
                "\nweight: " + weight;
    }
}
