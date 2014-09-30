package engsoft;

public class ProgressaoAritmetica implements Progressao {
    
    private int valCor;
    private int incremento;

    public ProgressaoAritmetica() {
        this(1);
    }

    public ProgressaoAritmetica(int incremento) {
        this.incremento = incremento;
        inicia();
    }

    public int inicia() {
        valCor = 0;
        return valCor;
    }

    public int proxTermo() {
        valCor += incremento;
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
