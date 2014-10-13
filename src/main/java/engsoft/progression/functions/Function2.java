package engsoft.progression.functions;

// Tudo em java precisa de um nome....
// http://steve-yegge.blogspot.com.br/2006/03/execution-in-kingdom-of-nouns.html
public interface Function2<I1, I2, O> {
    public O apply(I1 p1, I2 p2);
}
