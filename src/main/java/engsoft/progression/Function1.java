package engsoft.progression;

// This interface wants to be a lambda so bad.
public interface Function1<I,O> {
    public O apply(I previousValue);
} // Scala, I miss you.
