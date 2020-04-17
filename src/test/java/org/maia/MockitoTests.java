package org.maia;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

public class MockitoTests {
	
	@SuppressWarnings("unchecked")
	@Test
	public void primeiroTesteMockito() {
		List<String> lista = Mockito.mock(ArrayList.class); // criando instancia da lista com mock
		
		Mockito.when( lista.size()).thenReturn(20); // definindo o retorno da lista com mock
		
		int size = lista.size(); // atribuindo o valor da minha lista a uma variavel int
		
		Assertions.assertThat(size).isEqualTo(20); // virificando  e validando o tamanho da minha lista.
		
	}

}
