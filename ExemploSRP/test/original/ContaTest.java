package original;

import org.junit.Assert;
import org.junit.Test;

public class ContaTest {
	@Test
	public void deveCriarConta() {
		Conta conta = new Conta();
		
		Assert.assertEquals(0, conta.getSaldo());
	}
	
	@Test
	public void deveTestarFuncaoDepositarNaConta() {
		Conta conta = new Conta();
		conta.depositar(1000);
		
		Assert.assertEquals(1000, conta.getSaldo());
	}
	
	@Test
	public void deveTestarFuncaoSacarNaConta() {
		Conta conta = new Conta();
		conta.depositar(1000);
		conta.sacar(700);
		
		Assert.assertEquals(300, conta.getSaldo());
	}
}
