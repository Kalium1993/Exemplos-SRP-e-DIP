package srp;

public class Sacar implements FuncoesConta {
	
	public int funcao(int saldo, int sacar) {
		saldo -= sacar;
		return saldo;
	}

}
