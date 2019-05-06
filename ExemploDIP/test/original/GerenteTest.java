package original;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import original.Funcionario;
import original.Gerente;

public class GerenteTest {
	
	@Test
	public void deveTestarCriacaoGerente() {
		Gerente gerente = new Gerente();
		gerente.setFuncionario(new Funcionario("Fulano", "DEV"));
		
		gerente.gerenciar();
		
		assertEquals("Fulano", gerente.getFuncionario().getNome());
		assertEquals("DEV", gerente.getFuncionario().getCargo());
	}
}
