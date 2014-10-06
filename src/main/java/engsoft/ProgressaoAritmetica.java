package engsoft;

public class ProgressaoAritmetica implements Progressao {
    Progression progression;

    public ProgressaoAritmetica() {
	this.progression = new FirstOrderProgression(new Arithmetic(1), 0);
    }

    public ProgressaoAritmetica(double base) {
	this.progression = new FirstOrderProgression(new Arithmetic(base), 0);
    }

    public int proxTermo() {
	return (int) progression.next();
    }

    public int iesimoTermo(int index) {
	return (int) progression.valueByIndex(index);
    }

    public String imprimeProgressao(int to) {
	return progression.print(to);
    }

    public int inicia() {
	progression.reset();
	return (int) progression.valueByIndex(0);
    }
}
