package T.Tools;

public class Toy implements Comparable<Toy> {
    private String name;
    private int frequency;

    public Toy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public int compareTo(Toy other) {
        return Integer.compare(other.getFrequency(), this.getFrequency());
    }
}
