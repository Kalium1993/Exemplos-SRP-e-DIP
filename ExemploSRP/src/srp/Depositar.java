package srp;

public class Depositar implements FuncoesConta {

	public int funcao(int saldo, int depositar) {
		saldo += depositar;
		return saldo;
	}
}
