package test.testdoubles.poquer;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PokerStatus {

	public boolean verificar(String cartaUno, String cartaDos, String cartaTres, String cartaCuatro,
			String cartaCinco) {
		List<String> cartas = List.of(cartaUno, cartaDos, cartaTres, cartaCuatro, cartaCinco);
		List<String> valores = cambiarAListaDeValores(cartas);
		return cartas.stream().anyMatch(carta -> hayPokerEn(valores, this.valorDe(carta)));
	}

	private List<String> cambiarAListaDeValores(List<String> cartas) {
		return cartas.stream().map(carta -> this.valorDe(carta)).collect(Collectors.toList());
	}

	private boolean hayPokerEn(List<String> listaDeCartas, String valorDeUnaCarta) {
		return Collections.frequency(listaDeCartas, valorDeUnaCarta) >= 4;
	}

	private String valorDe(String unaCarta) {
		return unaCarta.substring(0, unaCarta.length() - 1);
	}
}
