package engsoft.progression;

public interface Progression {
    public double next();
    public void reset();

    public String print(int index, String mask);
    public double valueByIndex(int index);
}
