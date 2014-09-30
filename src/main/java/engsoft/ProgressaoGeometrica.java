package engsoft;

public class ProgressaoGeometrica implements Progressao {
    
    private int valCor;
    private int base;

    public ProgressaoGeometrica() {
        this(2);
    }

    public ProgressaoGeometrica(int base) {
        this.base = base;
        inicia();
    }

    public int inicia() {
        valCor = 1;
        return valCor;
    }

    public int proxTermo() {
        valCor *= base;
        return valCor;
    }

    public int iesimoTermo(int i) {
        int iesimo = inicia();
        for (int j = 0; j < i; j++) {
            iesimo = proxTermo();
        }
        return iesimo;
    }

    public String imprimeProgressao(int n) {
        StringBuilder progressao = new StringBuilder();
        progressao.append(inicia());
        for (int j = 0; j < n; j++) {
            progressao.append(' ');
            progressao.append(proxTermo());
        }
        progressao.append('\n');
        return progressao.toString();
    }

}
