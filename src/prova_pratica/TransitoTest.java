package prova_pratica;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class TransitoTest {

	@Test
	void listarPericulosidadeTest() {
		Rodovia r1 = new Rodovia("Rodovia Test#1", "test1", "Alta");
		Rodovia r2 = new Rodovia("Rodovia Test#2", "test2", "Baixa");
		Rodovia r3 = new Rodovia("Rodovia Test#3", "test3", "Media");
		
		Acidente a1 = new Acidente(r1, 0, 0, 0, null);
		Acidente a2 = new Acidente(r2, 0, 0, 0, null);
		Acidente a3 = new Acidente(r3, 0, 0, 0, null);
		
		List<Acidente> acidentes = new ArrayList<>();
		acidentes.add(a1);
		acidentes.add(a2);
		acidentes.add(a3);
		
		List<Acidente> acidentesPer = Acidente.listarPorPericulosidade(acidentes, "Alta");
		assertEquals(acidentesPer.get(0).getRodovia().getPericulosidade(), "ALTA");
		assertEquals(acidentesPer.get(1).getRodovia().getPericulosidade(), "BAIXA");
	}

}
