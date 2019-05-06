package original;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import original.FuncionarioDedicado;
import original.GerenteFuncionarioDedicado;

public class GerenteFuncionarioDedicadoTest {
	@Test
	public void deveTestarCriacaoGerente() {
		GerenteFuncionarioDedicado gerente = new GerenteFuncionarioDedicado();
		gerente.setFuncionario(new FuncionarioDedicado("Fulano", "DEV"));
		
		gerente.gerenciar();
		
		assertEquals("Fulano", gerente.getFuncionario().getNome());
		assertEquals("DEV", gerente.getFuncionario().getCargo());
	}
}
