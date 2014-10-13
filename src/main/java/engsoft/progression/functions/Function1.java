package engsoft.progression.functions;

// Quero ser um clojure, mas java 7 não deixa.
public interface Function1<I,O> {
    public O apply(I previousValue);
} // Scala, I miss you.
