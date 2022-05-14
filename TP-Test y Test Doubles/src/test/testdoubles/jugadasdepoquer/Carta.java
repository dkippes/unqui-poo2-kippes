package test.testdoubles.jugadasdepoquer;

public class Carta {
	private String palo;
	private String valor;
	private String color;

	public Carta(String valor, String palo, String color) {
		this.valor = valor;
		this.palo = palo;
		this.color = color;
	}

	public String getValor() {
		return valor;
	}

	public String getPalo() {
		return palo;
	}
	
	public String getColor() {
		return color;
	}

	public boolean esMismoPaloQue(Carta cartaAComparar) {
		return palo.equals(cartaAComparar.getPalo());
	}

	public boolean esSuperiorA(Carta cartaAComparar) {
		return valorNumericoDe(valor) > valorNumericoDe(cartaAComparar.getValor());
	}

	private int valorNumericoDe(String valorDeUnaCarta) {
		switch (valorDeUnaCarta) {
		case "J":
			return 11;
		case "Q":
			return 12;
		case "K":
			return 13;
		case "A":
			return 14;
		}
		return Integer.valueOf(valorDeUnaCarta);
	}

	public boolean esMismoValorQue(Carta unaCarta) {
		return valor.equals(unaCarta.getValor());
	}
	
	public boolean esMismoColor(Carta unaCarta) {
		return this.color.equals(unaCarta.getColor());
	}

	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", valor=" + valor + ", color=" + color + "]";
	}
}
