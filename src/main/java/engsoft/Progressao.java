package engsoft;


// A semantica dessa interface viola ao meu ver o CQSP (command-query-separation-principle).
// Você pede prox-termo e além de retornar um valor, você altera o estado interno da progressão.
// Segundo vários autores, violar esse principio dificulta manutenção pois
// obscurece a semantica das operações tornando-as interdependentes.

public abstract class Progressao {
    protected int valCor;

    public abstract int inicia();
    public abstract int proxTermo();

    public int iesimoTermo(int i) {
        int iesimo = inicia();
        for (int j = 0; j < i; j++) {
            iesimo = proxTermo();
        }
        return iesimo;
    }

    public String imprimeProgressao(int n) {
	// Repare que se um dia eu inventar de imprimir BigDecimal em uma outra
	// progressao DERIVADA dessa eu sou obrigado a mecher (ou sobreescrever)
	// essa implementação. Falta generalidade.

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
