package engsoft;

public interface Progression {
    public double next();
    public void reset();

    public String print(int index);
    public double valueByIndex(int index);
}
