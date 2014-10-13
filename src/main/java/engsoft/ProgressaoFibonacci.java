package engsoft;

public class ProgressaoFibonacci extends Progressao {

    private int valPrev; // INT é ruim pra fibonacci. Não aguenta nem um index de 50.

    ProgressaoFibonacci() {
        inicia();
    }

    public int inicia() {
	valCor  = 0;
	valPrev = 1;
	return valCor;
    }

    public int proxTermo() {
        valCor += valPrev;
        valPrev = valCor - valPrev;
	return valCor;
    }
}
